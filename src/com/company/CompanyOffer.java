package com.company;

import java.util.ArrayList;

public class CompanyOffer {
    public String name;
    public ArrayList<Requirement> requirements;
    public ArrayList<String> alternatives;


    public CompanyOffer(){
        this.requirements = new ArrayList<>();
        this.alternatives = new ArrayList<>();
    }

    public CompanyOffer(String name) {
        this.name = name;
        this.requirements = new ArrayList<>();
        this.alternatives = new ArrayList<>();
    }


    public ArrayList<Requirement> getRequirements() {
        return requirements;
    }

    public void setRequirements(ArrayList<Requirement> requirements) {
        this.requirements = requirements;
    }



    public void makeAlternatives(){
        for(Requirement r: this.requirements){
            if (! r.subtittutable ){
                this.alternatives.add(r.condion);
            }

        }
    }

    public int testOffer( Profil p){
        int score =0;
        int rate =0;
        if(this.requirements.isEmpty()){
            score = 10;
        }else{
            for(Requirement r : this.requirements){
                if(r.subtittutable){
                    rate++;
                    for(String attr : p.attributes){
                        if(r.condion.equals(attr)){
                            score++;
                        }
                    }
                }
            }
            if(!this.alternatives.isEmpty()){
                rate++;
                for(String a : this.alternatives){
                    for(String attr : p.attributes){
                        if(a.equals(attr)){
                            score++;
                        }
                    }
                    break;
                }
            }
        }
        if(rate>0)score= score*10/rate;
        return score;

    }

}
