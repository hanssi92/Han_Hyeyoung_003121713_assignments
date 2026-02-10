/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

/**
 *
 * @author Hyungs
 */
public class Person {
    
    String id;
    
    public Person(String id) {
        this.id = id;
    }
    
    public String getPersonId() {
        return id;
    }
    
    public boolean isMatch (String id) {
        if (getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return getPersonId();
    }
}
