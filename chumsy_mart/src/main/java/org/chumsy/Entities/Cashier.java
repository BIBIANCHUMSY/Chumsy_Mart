package org.chumsy.Entities;



public class Cashier extends Human {
    private Integer InterviewScore;

    public Cashier(String name, String id, String email, String phoneNumber, Integer interviewScore) {
        super(name, id, email, phoneNumber);
        InterviewScore = interviewScore;
    }

    public Integer getInterviewScore() {
        return InterviewScore;
    }

    public void setInterviewScore(Integer interviewScore) {
        InterviewScore = interviewScore;
    }
}
