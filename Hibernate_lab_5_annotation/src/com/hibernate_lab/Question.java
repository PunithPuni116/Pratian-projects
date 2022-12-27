/*Create a hibernate project with IS-A relation - Map One Table per class hierarchy
MCQQuestion is a Question and HandsonQuestion is a Question
use XML approach*/
package com.hibernate_lab;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "Hibernate_lab_5")  
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Question_Type",discriminatorType = DiscriminatorType.STRING)

public class Question {
	@Id
	private int QuestionNo;
	private int marks;
	
	public int getQuestionNo() {
		return QuestionNo;
	}

	public void setQuestionNo(int questionNo) {
		this.QuestionNo = questionNo;
	}


	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
