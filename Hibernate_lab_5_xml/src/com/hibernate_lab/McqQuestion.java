package com.hibernate_lab;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Mcq Question")  
public class McqQuestion extends Question{
	
	private String questionName;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rigthOption;
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	public String getOption2() {
		return option2;
	}
	public void setOption2(String option2) {
		this.option2 = option2;
	}
	public String getOption3() {
		return option3;
	}
	public void setOption3(String option3) {
		this.option3 = option3;
	}
	public String getOption4() {
		return option4;
	}
	public void setOption4(String option4) {
		this.option4 = option4;
	}
	public String getRigthOption() {
		return rigthOption;
	}
	public void setRigthOption(String rigthOption) {
		this.rigthOption = rigthOption;
	}
    
}
