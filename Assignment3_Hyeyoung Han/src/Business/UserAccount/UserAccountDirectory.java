/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Profile.Profile;
import java.util.ArrayList;

/**
 *
 * @author Hyungs
 */
public class UserAccountDirectory {
    
    ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount newUserAccount(Profile profile, String userName, String password) {
        UserAccount ua = new UserAccount(profile, userName, password);
        userAccountList.add(ua);
        return ua;
    }
    
    public UserAccount authenticate(String loginId, String password) {
        for (UserAccount ua : userAccountList) {
            boolean idMatch = ua.getUserLoginName().equals(loginId) || (ua.getPersonId() !=null && ua.getPersonId().equals(loginId));
            
            if (idMatch && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
    
    
}
