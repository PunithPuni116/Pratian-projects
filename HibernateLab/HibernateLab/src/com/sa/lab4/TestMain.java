package com.sa.lab4;

public class TestMain {

    public static void main(String[] args) {
       
        MCQQuestion mcq1 = new MCQQuestion(1, 1, "Captital Of Karnataka?", "Delhi", "Bangalore", "Mumbai", "Kolkata", "Bangalore");
        MCQQuestion mcq2 = new MCQQuestion(2, 1, "Captital Of Maharashtra?", "Delhi", "Bangalore", "Mumbai", "Kolkata", "Mumbai");
        MCQQuestion mcq3 = new MCQQuestion(3, 1, "Captital Of WestBengal?", "Delhi", "Bangalore", "Mumbai", "Kolkata", "Kolkata");
        
        HandonQuestion hq1 = new HandonQuestion(4, 2, "Write a note on Karnataka", "One state many worlds", "Garden State");

        QuestionManager manager = new QuestionManager();

        manager.addQuestion(mcq1);
        manager.addQuestion(mcq2);
        manager.addQuestion(mcq3);
        manager.addQuestion(hq1);


    }
    
}
