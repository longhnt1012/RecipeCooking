/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.User;

import java.util.Date;




/**
 *
 * @author truc0
 */

public class UserDTO {
    private int userID;
    private String userName;
    private Date dob;
    private boolean gender;
    private String phone;
    private String gmail;
    private String password;
    private String role;
    private boolean status; 
    private String imageUser;

    public UserDTO() {
    }

    public UserDTO(int userID, String userName, Date dob, boolean gender, String phone, String gmail, String password, String role, boolean status) {
        this.userID = userID;
        this.userName = userName;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.gmail = gmail;
        this.password = password;
        this.role = role;
        this.status = status;
    }

    public UserDTO(int userID, String userName, Date dob, boolean gender, String phone, String gmail, String password, String role, boolean status, String imageUser) {
        this.userID = userID;
        this.userName = userName;
        this.dob = dob;
        this.gender = gender;
        this.phone = phone;
        this.gmail = gmail;
        this.password = password;
        this.role = role;
        this.status = status;
        this.imageUser = imageUser;
    }

    
    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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

    public String getImageUser() {
        return imageUser;
    }

    public void setImageUser(String imageUser) {
        this.imageUser = imageUser;
    }

    

    @Override
    public String toString() {
        return "UserDTO{" + "userID=" + userID + ", userName=" + userName + ", dob=" + dob + ", gender=" + gender + ", phone=" + phone + ", gmail=" + gmail + ", password=" + password + ", role=" + role + ", status=" + status + '}';
    }

}
