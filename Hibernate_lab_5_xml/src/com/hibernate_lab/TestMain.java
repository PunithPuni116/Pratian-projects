package com.hibernate_lab;

public class TestMain {
	
	public static void main(String[] args) {
		
		McqQuestion mcqQuestion=new McqQuestion();
		
		mcqQuestion.setQuestionNo(1);
		mcqQuestion.setMarks(2);
		mcqQuestion.setQuestionName("Which is first Indian cricket tournament ?");
		mcqQuestion.setOption1("East Indian Cricket Club");
		mcqQuestion.setOption2("Maharashtra Cricket Club");
		mcqQuestion.setOption3("Oriental Cricket Club");
		mcqQuestion.setOption4("Bombay Cricket Club");
		mcqQuestion.setRigthOption("Oriental Cricket Club");
		
		HibernateUtil hb=new HibernateUtil();
		hb.SaveDate(mcqQuestion);
	}
}
