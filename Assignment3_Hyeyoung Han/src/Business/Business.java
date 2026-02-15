/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Person.PersonDirectory;
import Business.Profile.EmployeeDirectory;
import Business.Profile.FacultyDirectory;
import Business.Profile.StudentDirectory;
import Business.UserAccount.UserAccountDirectory;

/**
 *
 * @author Hyungs
 */
public class Business {
    
    String name;
    PersonDirectory personDirectory;
    
    EmployeeDirectory employeeDirectory;
    UserAccountDirectory userAccountDirectory;
    StudentDirectory studentDirectory;
    FacultyDirectory facultyDirectory;
    
    public Business (String n) {
        name = n;
        
        personDirectory = new PersonDirectory();
        employeeDirectory = new EmployeeDirectory(this);
        userAccountDirectory = new UserAccountDirectory();
        studentDirectory = new StudentDirectory(this);
        facultyDirectory = new FacultyDirectory(this);
        
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public FacultyDirectory getFacultyDirectory() {
        return facultyDirectory;
    }
    
}
