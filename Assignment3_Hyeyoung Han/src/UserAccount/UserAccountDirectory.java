/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Profile.Profile;
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
    
    public UserAccount authenticate(String userName, String password) {
        for (UserAccount ua : userAccountList) {
            if(ua.getUserLoginName().equals(userName) &&
                ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }
    
}
