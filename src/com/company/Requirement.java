package com.company;

public class Requirement {
    public String condion;
    public boolean subtittutable;


    public Requirement() {
    }

    //condition is the statement like "house"
    //subtittutable tell if the condition is subtittutable or not
    public Requirement(String condion, boolean required) {
        this.condion = condion;
        this.subtittutable = required;
    }



    public String getCondion() {
        return condion;
    }

    public void setCondion(String condion) {
        this.condion = condion;
    }

    public boolean isSubtittutable() {
        return subtittutable;
    }

    public void setSubtittutable(boolean subtittutable) {
        this.subtittutable = subtittutable;
    }

}
