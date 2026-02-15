/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.UserAccount;

import Business.Profile.Profile;

/**
 *
 * @author Hyungs
 */
public class UserAccount {
    
    Profile profile;
    String userName;
    String password;
    
    String lastActivity;
    String lastUpdated;
    boolean enabled = true;
    
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
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getLastActivity () {
        return lastActivity;
    }
    
    public void setLastActivity (String lastActivity) {
        this.lastActivity = lastActivity;
    }
    
    public String getLastUpdated() {
        return lastUpdated;
    }
    
    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
    public boolean isEnabled () {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
    public String getStatus() {
        return enabled ? "Enabled" : "Disabled" ;
    }
    
    public void setStatus(boolean enabled) {
        this.enabled = enabled;
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
