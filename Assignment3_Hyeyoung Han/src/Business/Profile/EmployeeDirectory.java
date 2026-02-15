/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profile;

import Business.Business;
import Business.Person.Person;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class EmployeeDirectory {
    
    Business business;
    ArrayList<EmployeeProfile> employeeList;
    
    public EmployeeDirectory (Business d) {
        business = d;
        employeeList = new ArrayList();
    }
    
    public EmployeeProfile newEmployeeProfile (Person p) {
        EmployeeProfile ep = new EmployeeProfile(p);
        employeeList.add(ep);
        return ep;
    }
    
    public EmployeeProfile findEmployee(String id) {
        
        for (EmployeeProfile ep : employeeList) {
            if (ep.isMatch(id)) {
                return ep;
            }
        }
        return null;
    }
    
}
