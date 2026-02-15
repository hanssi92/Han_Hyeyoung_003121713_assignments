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
public class StudentAccount {
    
    StudentProfile studentProfile;
    
    String name;
    String nuId;
    String year;
    String major;
    
    public StudentAccount(StudentProfile studentProfile) {
        this.studentProfile = studentProfile;
    }
    
    public StudentProfile getStudentProfile() {
        return studentProfile;
    }
    
    public Person getPerson() {
        return studentProfile.getPerson();
    }
    
    public String getRole() {
        return studentProfile.getRole();
    }
    
    public boolean isMatch(String id) {
        return studentProfile.isMatch(id);
    }
    
    public String getMajor() {
        return major;
    }
    
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getNuId () {
        return nuId;
    }
    
    public void setNuId (String nuId) {
        this.nuId = nuId;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public String getName(String name) {
        return name;
    }
    
    public void setName (String name) {
        this.name = name;
    }
    
}
