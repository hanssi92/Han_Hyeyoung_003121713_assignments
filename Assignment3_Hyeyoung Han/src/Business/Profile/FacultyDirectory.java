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
public class FacultyDirectory {
    Business business;
    ArrayList<FacultyProfile> facultyList;
    
    public FacultyDirectory(Business d) {
        business = d;
        facultyList = new ArrayList<>();
    }
    
    public FacultyProfile findFaculty(String id){
        for (FacultyProfile fp : facultyList) {
            if (fp.isMatch(id)) {
                return fp;
            }
        }
        return null;
    }
    
    public ArrayList<FacultyProfile> getFacultyList() {
        return facultyList;
    }
    
    public FacultyProfile newFacutlyProfile(Person p) {
        FacultyProfile fp = new FacultyProfile(p);
        facultyList.add(fp);
        return fp;
    }
}
