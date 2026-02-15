/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Profile;

import Business.Person.Person;

/**
 *
 * @author Hyungs
 */
public class FacultyProfile extends Profile {
    
    String name;
    String department;
    String userName;
    String role;
    
    public FacultyProfile(Person p) {
        super (p);
    }
    
    @Override
    public String getRole() {
        return "Faculty";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
