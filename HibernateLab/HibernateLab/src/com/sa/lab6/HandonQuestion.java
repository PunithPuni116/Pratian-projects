package com.sa.lab6;

import javax.persistence.Entity;

@Entity
public class HandonQuestion extends Question{
    private String question;
    private String userAnswer;
    private String rigthAnser;

    public HandonQuestion() {
  
    }
    public HandonQuestion(int id, int totalMarks, String question, String userAnswer,
            String rigthAnser) {
        super(id, totalMarks);
        this.question = question;
        this.userAnswer = userAnswer;
        this.rigthAnser = rigthAnser;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getUserAnswer() {
        return userAnswer;
    }
    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }
    public String getRigthAnser() {
        return rigthAnser;
    }
    public void setRigthAnser(String rigthAnser) {
        this.rigthAnser = rigthAnser;
    }

    

    
}
