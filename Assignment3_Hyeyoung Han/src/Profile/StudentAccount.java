/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Profile;

import Person.Person;

/**
 *
 * @author Hyungs
 */
public class StudentAccount {
    
    StudentProfile studentProfile;
    
    String major;
    String studentNumber;
    String year;
    double gpa;
    
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
    
    public String getStudentNumber() {
        return studentNumber;
    }
    
    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    public String getYear() {
        return year;
    }
    
    public void setYear(String year) {
        this.year = year;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
