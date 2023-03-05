package com.cvs.loosely_coupled;


public class CvsApp {
    public static void main(String[] args) {

        FullTimeMentor fullTime = new FullTimeMentor();
//        PartTimeMentor partTimeMentor = new PartTimeMentor();

        MentorAccount mentor = new MentorAccount(fullTime);
        mentor.manageAccount();
    }
}
