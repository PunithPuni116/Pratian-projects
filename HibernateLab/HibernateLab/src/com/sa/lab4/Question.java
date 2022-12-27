package com.sa.lab4;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "QuestionType", discriminatorType = DiscriminatorType.STRING)
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
