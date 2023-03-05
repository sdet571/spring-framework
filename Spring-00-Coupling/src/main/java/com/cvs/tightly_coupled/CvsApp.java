package com.cvs.tightly_coupled;

public class CvsApp {
    public static void main(String[] args) {


        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTimeMentor = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime, partTimeMentor); //MI
        mentor.manageAccount();

        //MI
    }

}
