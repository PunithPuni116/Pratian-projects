package com.sa.lab6;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Question {

    @Id
    private int id;
    private int totalMarks;

    public Question() {
    }
    
    public Question(int id, int totalMarks) {
        this.id = id;
        this.totalMarks = totalMarks;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }  
    
}
