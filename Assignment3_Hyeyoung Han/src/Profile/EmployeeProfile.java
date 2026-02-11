/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profile;

import Person.Person;

/**
 *
 * @author Hyungs
 * 
 */

public class EmployeeProfile extends Profile {
    
    
    public EmployeeProfile(Person p) {
        super(p);
    }
    
    @Override
    public String getRole() {
        return "Admin";
    }
        
}

    
    

