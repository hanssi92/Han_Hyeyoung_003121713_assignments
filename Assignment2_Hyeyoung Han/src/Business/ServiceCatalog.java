/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;
import model.Service;

/**
 *
 * @author Hyungs
 */
public class ServiceCatalog {
    
    private ArrayList<Service> services;
    
    public ServiceCatalog() {
        this.services = new ArrayList<Service>();
    }
    
    public ArrayList<Service> getService() {
        return services;
    }
    
    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }
    
    public Service addService() {
        Service s = new Service();
        services.add(s);
        return s;
    }
    
    public void deleteService (Service service) {
        services.remove(service);
    }
    
    public Service searchByServiceId(String id) {
        for (Service s : services) {
            if (s.getServiceId() != null && s.getServiceId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
}
