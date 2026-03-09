/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TheBusiness;

import MarketingManagement.MarketingPersonDirectory;
import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.MarketModel.ChannelCatalog;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.MarketModel.MarketCatalog;
import TheBusiness.MarketModel.MarketChannelAssignment;
import TheBusiness.MarketModel.MarketChannelComboCatalog;
import TheBusiness.MarketModel.SolutionOffer;
import TheBusiness.MarketModel.SolutionOfferCatalog;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.SolutionOrders.MasterSolutionOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.OrderManagement.OrderItem;
import TheBusiness.Personnel.Person;
import TheBusiness.Personnel.PersonDirectory;
import TheBusiness.ProductManagement.Product;
import TheBusiness.ProductManagement.ProductSummary;
import TheBusiness.ProductManagement.ProductCatalog;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.SolutionOrders.SolutionOrder;
import TheBusiness.Supplier.Supplier;
import TheBusiness.Supplier.SupplierDirectory;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Xerox");
        
// 1. Core Person/Profile
// 2. 300 customers
// 3. 50 suppliers
// 4. Products (30suppliers x 50)
// 5. user Account
// 6. Orders (1~3 per customer, 1~10items)
// 7. market/channel/solution 
// 8. Return Business

        // Core persons
        PersonDirectory persondirectory = business.getPersonDirectory();
       
        Person xeroxsalesperson001 = persondirectory.newPerson("Xerox sales");
        Person xeroxmarketingperson001 = persondirectory.newPerson("Xerox marketing");

        // Employee profile (Sales / Marketing)
        SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
        SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(xeroxsalesperson001);
        
        MarketingPersonDirectory marketingpersondirectory = business.getMarketingPersonDirectory();
        MarketingPersonProfile marketingpersonprofile0 = marketingpersondirectory.newMarketingPersonProfile(xeroxmarketingperson001);

       // Create 300 customers
       CustomerDirectory customerdirectory = business.getCustomerDirectory();
       
       for (int i = 1; i <=300; i++) {
           Person customerPerson = persondirectory.newPerson("Customer_" + i);
           customerdirectory.newCustomerProfile(customerPerson);
       }
       
       // Create 50 suppliers (first 30 suppliers get 50 products each)
       SupplierDirectory supplierdirectory = business.getSupplierDirectory();
       
       for (int i = 1; i <= 50; i++) {
           Supplier supplier = supplierdirectory.newSupplier("Supplier_" + i);
           
           if (i <= 30) {
               ProductCatalog productcatalog = supplier.getProductCatalog();
               
               for (int j = 1; j<=50; j++) {
                   int floorPrice = 1000 + (int)(Math.random()*4000); //1000~4999
                   int ceilingPrice = floorPrice + 2000 + (int)(Math.random()*6000);
                   int targetPrice = floorPrice + ((ceilingPrice - floorPrice) / 2);
                   
                   productcatalog.newProduct("Product_" + i + "_" + j, floorPrice, ceilingPrice, targetPrice);
               }
           }
       }
       
       //User Accounts
       UserAccountDirectory uad = business.getUserAccountDirectory();
       
       uad.newUserAccount(salespersonprofile, "Sales", "****");
       uad.newUserAccount(marketingpersonprofile0, "Marketing", "****");
      
       // Create Orders
       // Each customer: 1~3 orders / Each order: 1~10items
       MasterOrderList masterorderlist = business.getMasterOrderList();
       
       for (CustomerProfile cp : customerdirectory.getCustomerList()) {
           
           int orderCount = 1 + (int)(Math.random()*3); //1~3orders
           
           for (int o = 0; o < orderCount; o++) {
               Order order = masterorderlist.newOrder(cp,salespersonprofile);
               
               int itemCount = 1 + (int)(Math.random()*10); //1~10items
               
               for (int k = 0; k < itemCount; k++){
                   
                   //first 30 suppliers only, because only they have products
                   int supplierIndex = (int)(Math.random()*30);
                   Supplier randomSupplier = supplierdirectory.getSuplierList().get(supplierIndex);
                   
                   ProductCatalog pc = randomSupplier.getProductCatalog();
                   
                   if (pc.getProductList().isEmpty()){
                       continue;
                   }
                   
                   int productIndex = (int)(Math.random()* pc.getProductList().size());
                   Product randomProduct = pc.getProductList().get(productIndex);
                   
                   int quantity = 1 + (int)(Math.random() * 10);
                   
                   int floor = randomProduct.getFloorPrice();
                   int ceiling = randomProduct.getCeilingPrice();
                   
                   int actualPrice;
                   if (ceiling > floor) {
                       actualPrice = floor + (int)(Math.random() * (ceiling - floor + 1));
                   }else {
                       actualPrice = floor;
                   }
                   
                   order.newOrderItem(randomProduct, actualPrice, quantity);
               }
           }
       }

       return business;

    }
}
