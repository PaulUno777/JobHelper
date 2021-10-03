package com.company;

public class Main {

    public static void main(String[] args) {
        //**********************************
        // =======here we test the program =======
        //**********************************

        Profil user = new Profil();
        user.attributes.add("bike");
        user.attributes.add("driver's licence");

        JobBoard jb = new JobBoard();
        int score;

        for(CompanyOffer offer : jb.offerlist){
            score = offer.testOffer(user);
            if(score == 10){
                user.lookProfil();
                System.out.println( "is compatible with "+offer.name+"\n");
            }
        }
        System.out.println( "= = = = = = = = = = = = = = = = =");
        System.out.println( "All yours scores with offers are");
        System.out.println( "= = = = = = = = = = = = = = = = =");
        for(CompanyOffer offer : jb.offerlist){
            score = offer.testOffer(user);
            System.out.println( offer.name +" -> "+score+"/10");

        }
    }
}
