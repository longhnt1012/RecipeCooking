/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.User;

import java.sql.Timestamp;

/**
 *
 * @author truc0
 */

public class UserDTO {
    
    private String userName;
    private String firstName;
    private String lastName;
    private Timestamp dob;
    private boolean gender;
    private String phone;
    private String gmail;
    private String password;
    private String role;
    private boolean status;  

    public UserDTO() {
    }

    public UserDTO(String userName, String firstName, String lastName, Timestamp dob, boolean gender, String phone, String gmail, String password, String role, boolean status) {
        
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.gmail = gmail;
        this.password = password;
        this.role = role;
        this.status = status;
    }

   

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public Timestamp getDob() {
        return dob;
    }

    public void setDob(Timestamp dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserDTO{" + "userName=" + userName + ", firstName=" + firstName + ", lastName=" + lastName + ", dob=" + dob + ", gender=" + gender + ", phone=" + phone + ", gmail=" + gmail + ", password=" + password + ", role=" + role + ", status=" + status + '}';
    }
    
}
