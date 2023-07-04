/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.feedback;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class FeedbackDTO {

    private int feedbackID;
    private String content;
    private int recipeID;
    private int userID;
    private Date feedbackDate;
    private int status;
    private String recipeName;
    private String userName;

    public FeedbackDTO() {
    }

    public FeedbackDTO(int feedbackID, String content, int recipeID, int userID, Date feedbackDate, int status, String recipeName, String userName) {
        this.feedbackID = feedbackID;
        this.content = content;
        this.recipeID = recipeID;
        this.userID = userID;
        this.feedbackDate = feedbackDate;
        this.status = status;
        this.recipeName = recipeName;
        this.userName = userName;
    }

    public int getFeedbackID() {
        return feedbackID;
    }

    public void setFeedbackID(int feedbackID) {
        this.feedbackID = feedbackID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getRecipeID() {
        return recipeID;
    }

    public void setRecipeID(int recipeID) {
        this.recipeID = recipeID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public Date getFeedbackDate() {
        return feedbackDate;
    }

    public void setFeedbackDate(Date feedbackDate) {
        this.feedbackDate = feedbackDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
