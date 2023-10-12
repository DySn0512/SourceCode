package murach.business;

import java.io.Serializable;

public class User implements Serializable {

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    private String firstName;
    private String lastName;
    private String email;
    private String dateofbirth;
    private String hearAboutUs;
    private String notify;
    private String update;
    private String contact;
    
    public User() {
        firstName = "";
        lastName = "";
        email = "";
        dateofbirth ="";
        hearAboutUs ="";
        notify ="";
        update="";
        contact ="";
    }
    
    public User(String firstName, String lastName, String email, String dateofbirth, String hearAboutUs, String notify, String update, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.dateofbirth = dateofbirth;
        this.hearAboutUs = hearAboutUs;
        this.notify = notify;
        this.update = update;
        this.contact = contact;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getdateofbirth() {
        return dateofbirth;
    }

    public void setdateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }
    
    public String gethearAboutUs() {
        return hearAboutUs;
    }

    public void sethearAboutUs(String hearAboutUs) {
        this.hearAboutUs = hearAboutUs;
    }
        
    public String getnotify() {
        return notify;
    }

    public void setnotify(String notify) {
        this.notify = notify;
    }
    
    public String getupdate() {
        return update;
    }

    public void setupdate(String update) {
        this.update = update;
    }
    
    public String getcontact() {
        return contact;
    }

    public void setcontact(String contact) {
        this.contact = contact;
    }
   
}