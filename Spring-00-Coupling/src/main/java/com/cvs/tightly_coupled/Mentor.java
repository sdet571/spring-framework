package com.cvs.tightly_coupled;

public class Mentor {

    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;

    //MI

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor){
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
        //MI
    }
}
