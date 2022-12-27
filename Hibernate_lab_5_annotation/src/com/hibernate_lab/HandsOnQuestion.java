package com.hibernate_lab;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Hands On Question")  
public class HandsOnQuestion extends Question{

	private String questionDesc;
    private String referenceDocument;
    
	public String getQuestionDesc() {
		return questionDesc;
	}
	public void setQuestionDesc(String questionDesc) {
		this.questionDesc = questionDesc;
	}
	public String getReferenceDocument() {
		return referenceDocument;
	}
	public void setReferenceDocument(String referenceDocument) {
		this.referenceDocument = referenceDocument;
	}
    
}
