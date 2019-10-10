package com.singtel.SolutionB;

public abstract class Animal {
    public enum Sex {MALE,FEMALE};
   public Sex sex;

    public void setSex(Sex sex){
        this.sex = sex;
    }

    public Sex getSex(){
        return sex;
    }

}
