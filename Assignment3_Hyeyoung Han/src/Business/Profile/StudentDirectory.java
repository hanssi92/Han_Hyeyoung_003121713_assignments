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
public class StudentDirectory {
    
    Business business;
    ArrayList<StudentProfile> studentList;
    
    public StudentDirectory(Business d) {
        business = d;
        studentList = new ArrayList<>();
    }
    
    public StudentProfile findStudent(String id) {
        for (StudentProfile sp : studentList) {
            if(sp.isMatch(id)) {
                return sp;
            }
        }
        return null;
    }
    
    public StudentProfile newStudentProfile(Person p) {
        StudentProfile sp = new StudentProfile(p);
        studentList.add(sp);
        return sp;
    }
}
