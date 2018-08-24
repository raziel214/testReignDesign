package com.johnquimbaya.testreigndesign.home.model;

import java.util.List;
/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

public class StoryUrl {


    private String value;

    private String matchLevel;

    private List<String> matchedWords;

    public void setValue(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
    public void setMatchLevel(String matchLevel){
        this.matchLevel = matchLevel;
    }
    public String getMatchLevel(){
        return this.matchLevel;
    }
    public void setMatchedWords(List<String> matchedWords){
        this.matchedWords = matchedWords;
    }
    public List<String> getMatchedWords(){
        return this.matchedWords;
    }
}

