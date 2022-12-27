package com.sa.lab5;

public class MCQQuestion extends Question {
    private String questionDescription;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rigthOption;

    public MCQQuestion() {
    }

    public MCQQuestion(int id, int totalMarks, String questionDescription, String option1, String option2,
            String option3, String option4, String rigthOption) {
        super(id, totalMarks);
        this.questionDescription = questionDescription;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.rigthOption = rigthOption;
    }

    public String getQuestionDescription() {
        return questionDescription;
    }

    public void setQuestionDescription(String questionDescription) {
        this.questionDescription = questionDescription;
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
