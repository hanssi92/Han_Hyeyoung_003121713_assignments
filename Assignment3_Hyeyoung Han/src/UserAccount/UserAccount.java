/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UserAccount;

import Profile.Profile;

/**
 *
 * @author Hyungs
 */
public class UserAccount {
    
    Profile profile;
    String userName;
    String password;
    String lastLogin;
    
    public UserAccount (Profile profile, String un, String pw) {
        userName = un;
        password = pw;
        this.profile = profile;
    }
    
    public String getPersonId() {
        return profile.getPerson().getPersonId();
    }
    
    public String getUserLoginName() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public String getLastLogin() {
        return lastLogin;
    }
    
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }
    
        public boolean isMatch(String id) {
            if (getPersonId().equals(id)) return true;
            return false;
        }
        
        public boolean isValidUser(String un, String pw) {
            if(userName.equalsIgnoreCase(un) && password.equals(pw)) return true;
            else return false;
        }
        
        public String getRole() {
            return profile.getRole();
        }
    
        public Profile getAssociatedPersonProfile() {
            return profile;
        }
        
    @Override
        public String toString() {
            return getUserLoginName();
        }
    
}
