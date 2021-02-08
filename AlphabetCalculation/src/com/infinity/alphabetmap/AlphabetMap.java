package com.infinity.alphabetmap;

import java.util.HashMap;

public class AlphabetMap {

    HashMap<String,Integer> alphabetValueMap=new HashMap<>();

    public int calculateAlphabet(Character character){

        alphabetValueMap.put("a",1);
        alphabetValueMap.put("b",2);
        alphabetValueMap.put("c",3);
        alphabetValueMap.put("d",4);
        alphabetValueMap.put("e",5);
        alphabetValueMap.put("f",6);
        alphabetValueMap.put("g",7);
        alphabetValueMap.put("h",8);
        alphabetValueMap.put("i",9);
        alphabetValueMap.put("j",10);
        alphabetValueMap.put("k",11);
        alphabetValueMap.put("l",12);
        alphabetValueMap.put("m",13);
        alphabetValueMap.put("n",14);
        alphabetValueMap.put("o",15);
        alphabetValueMap.put("p",16);
        alphabetValueMap.put("q",17);
        alphabetValueMap.put("r",18);
        alphabetValueMap.put("s",19);
        alphabetValueMap.put("t",20);
        alphabetValueMap.put("u",21);
        alphabetValueMap.put("v",22);
        alphabetValueMap.put("w",23);
        alphabetValueMap.put("x",24);
        alphabetValueMap.put("y",25);
        alphabetValueMap.put("z",26);


        return alphabetValueMap.get(character.toString());

    }
}
