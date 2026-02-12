
import Business.Business;
import Person.Person;
import Person.PersonDirectory;
import Profile.EmployeeDirectory;
import Profile.EmployeeProfile;
import Profile.FacultyDirectory;
import Profile.FacultyProfile;
import Profile.StudentAccount;
import Profile.StudentDirectory;
import Profile.StudentProfile;
import UserAccount.UserAccountDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hyungs
 */
public class ConfigureABusiness {
    
    public static Business initialize() {
        Business business = new Business("Information System");
        
        PersonDirectory pd = business.getPersonDirectory();
        
        Person person001 = pd.newPerson("John Smith");
        Person person002 = pd.newPerson("Gina Montana");
        Person person003 = pd.newPerson("Adam Rollen");
 
        Person person005 = pd.newPerson("Jim Dellon");
        Person person006 = pd.newPerson("Anna Shnider");
        Person person007 = pd.newPerson("Laura Brown");
        Person person008 = pd.newPerson("Jack While");
        Person person009 = pd.newPerson("Fidelity");
        
        EmployeeDirectory ed = business.getEmployeeDirectory();
        StudentDirectory sd = business.getStudentDirectory();
        FacultyDirectory fd = business.getFacultyDirectory();
        
        EmployeeProfile adminProfile = ed.newEmployeeProfile(person001);
        StudentProfile studentProfile = sd.newStudentProfile(person003);
        FacultyProfile facultyProfile = fd.newFacutlyProfile(person008);
        
        UserAccountDirectory uad = business.getUserAccountDirectory();
        uad.newUserAccount(adminProfile, "admin", "****");
        uad.newUserAccount(studentProfile, "student", "****");
        uad.newUserAccount(facultyProfile, "faculty", "****");
        
        StudentAccount sa = new StudentAccount(studentProfile);
        sa.setMajor("Information System");
        sa.setNuId("00041212");
        sa.setYear("2026");
        sa.setName("Adam Sandler");
        
        return business;
    }
    
}
