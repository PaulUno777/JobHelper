package com.company;

import java.util.ArrayList;

public class JobBoard {
    //+++++++++++++++++++++++++++++++++++++++++++++++++++
    //the job board is like a data base of all job offers
    //+++++++++++++++++++++++++++++++++++++++++++++++++++

    //**********************************************************
    // ======define all company and theirs requirements =======
    //**********************************************************
    public ArrayList<CompanyOffer> offerlist;

    public JobBoard() {

        this.offerlist = new  ArrayList<CompanyOffer>();

    CompanyOffer comA = new CompanyOffer("Company A");
        comA.requirements.add(PseudoDataBase.r1);
        comA.requirements.add(PseudoDataBase.r2);
        comA.requirements.add(PseudoDataBase.r3);
        comA.makeAlternatives();

    CompanyOffer comB = new CompanyOffer("Company B");
        comB.requirements.add(PseudoDataBase.r4);
        comB.requirements.add(PseudoDataBase.r5);
        comB.requirements.add(PseudoDataBase.r6);
        comB.requirements.add(PseudoDataBase.r7);
        comB.makeAlternatives();

    CompanyOffer comC = new CompanyOffer("Company C");
        comC.requirements.add(PseudoDataBase.r8);
        comC.requirements.add(PseudoDataBase.r9);
        comC.makeAlternatives();

    CompanyOffer comD = new CompanyOffer("Company D");
        comD.requirements.add(PseudoDataBase.r1);
        comD.requirements.add(PseudoDataBase.r10);
        comD.requirements.add(PseudoDataBase.r2);
        comD.makeAlternatives();

    CompanyOffer comE = new CompanyOffer("Company E");
        comE.requirements.add(PseudoDataBase.r6);
        comE.requirements.add(PseudoDataBase.r11);
        comE.requirements.add(PseudoDataBase.r12);
        comE.requirements.add(PseudoDataBase.r4);
        comE.requirements.add(PseudoDataBase.r5);
        comE.makeAlternatives();

    CompanyOffer comF = new CompanyOffer("Company F");
        comF.requirements.add(PseudoDataBase.r13);
        comF.requirements.add(PseudoDataBase.r14);
        comF.requirements.add(PseudoDataBase.r15);
        comF.requirements.add(PseudoDataBase.r6);
        comF.requirements.add(PseudoDataBase.r16);
        comF.makeAlternatives();

    CompanyOffer comG = new CompanyOffer("Company G");
        comG.requirements.add(PseudoDataBase.r17);
        comG.requirements.add(PseudoDataBase.r18);
        comG.makeAlternatives();

    CompanyOffer comH = new CompanyOffer("Company H");
        comH.requirements.add(PseudoDataBase.r19);
        comH.requirements.add(PseudoDataBase.r20);
        comH.makeAlternatives();

    CompanyOffer comJ = new CompanyOffer("Company J");
        comJ.makeAlternatives();

    CompanyOffer comK = new CompanyOffer("Company K");
        comK.requirements.add(PseudoDataBase.r21);
        comK.makeAlternatives();

        this.offerlist.add(comA);
        this.offerlist.add(comB);
        this.offerlist.add(comC);
        this.offerlist.add(comD);
        this.offerlist.add(comE);
        this.offerlist.add(comF);
        this.offerlist.add(comG);
        this.offerlist.add(comH);
        this.offerlist.add(comJ);
        this.offerlist.add(comK);
}

    public ArrayList<CompanyOffer> getOfferlist() {
        return offerlist;
    }

    public void setOfferlist(ArrayList<CompanyOffer> offerlist) {
        this.offerlist = offerlist;
    }
}
