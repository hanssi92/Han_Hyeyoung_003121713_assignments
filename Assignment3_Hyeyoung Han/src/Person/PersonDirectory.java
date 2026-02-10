/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class PersonDirectory {
    
    ArrayList<Person> personList;
    
    public PersonDirectory () {
        personList = new ArrayList();
    }
    
    public Person newPerson(String id) {
        
        Person p = new Person(id);
        personList.add(p);
        return p;
    }
    
    public Person findPerson(String id) {
        
        for (Person p : personList) {
            if (p.isMatch(id)) {
                return p;
            }
        }
        return null;
    }
    
}
