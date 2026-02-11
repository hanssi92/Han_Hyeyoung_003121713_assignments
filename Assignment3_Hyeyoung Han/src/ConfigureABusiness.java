
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
        
        Person pAdmin = pd.newPerson("Will Smith");
        Person pStudent = pd.newPerson("Adam Sandler");
        Person pFaculty = pd.newPerson("Brad Pitt");
        
        EmployeeDirectory ed = business.getEmployeeDirectory();
        StudentDirectory sd = business.getStudentDirectory();
        FacultyDirectory fd = business.getFacultyDirectory();
        
        EmployeeProfile adminProfile = ed.newEmployeeProfile(pAdmin);
        StudentProfile studentProfile = sd.newStudentProfile(pStudent);
        FacultyProfile facultyProfile = fd.newFacutlyProfile(pFaculty);
        
        UserAccountDirectory uad = business.getUserAccountDirectory();
        uad.newUserAccount(adminProfile, "admin", "admin");
        uad.newUserAccount(studentProfile, "student", "student");
        uad.newUserAccount(facultyProfile, "faculty", "faculty");
        
        StudentAccount sa = new StudentAccount(studentProfile);
        sa.setMajor("Information System");
        sa.setStudentNumber("S001");
        sa.setYear("2026");
        sa.setGpa(3.8);
        
        return business;
    }
    
}
