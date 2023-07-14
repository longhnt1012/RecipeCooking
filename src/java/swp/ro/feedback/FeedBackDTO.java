/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swp.ro.feedback;

import java.util.Date;





/**
 *
 * @author truc0
 */
public class FeedBackDTO {
    private int feedBackID;
    private String content;
    private int recipeID ;
    private int userID;
    private Date feedbackDate;
    private boolean status;

    public FeedBackDTO() {
    }

    public FeedBackDTO(int feedBackID, String content, int recipeID, int userID, Date feedbackDate, boolean status) {
        this.feedBackID = feedBackID;
        this.content = content;
        this.recipeID = recipeID;
        this.userID = userID;
        this.feedbackDate = feedbackDate;
        this.status = status;
    }

    public int getFeedBackID() {
        return feedBackID;
    }

    public void setFeedBackID(int feedBackID) {
        this.feedBackID = feedBackID;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "FeedBackDTO{" + "feedBackID=" + feedBackID + ", content=" + content + ", recipeID=" + recipeID + ", userID=" + userID + ", feedbackDate=" + feedbackDate + ", status=" + status + '}';
    }
    
}
