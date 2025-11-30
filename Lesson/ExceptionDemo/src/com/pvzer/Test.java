package com.pvzer;

import com.pvzer.exception.AssistanceException;
import com.pvzer.pojo.Assistance;


public class Test {
    public static void main(String[] args) {
        try{
            Assistance assistance = new Assistance(53,8000);
            assistance.calculateAge();

            assistance.setAge(36);
            assistance.calculateAge();

        }catch(AssistanceException e){
            e.printStackTrace();
        }

    }
}