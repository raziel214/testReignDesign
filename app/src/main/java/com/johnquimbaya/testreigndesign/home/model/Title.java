package com.johnquimbaya.testreigndesign.home.model;

import java.util.ArrayList;


/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */
public class Title
{
    private String value;

    public String getValue() { return this.value; }

    public void setValue(String value) { this.value = value; }

    private String matchLevel;

    public String getMatchLevel() { return this.matchLevel; }

    public void setMatchLevel(String matchLevel) { this.matchLevel = matchLevel; }

    private boolean fullyHighlighted;

    public boolean getFullyHighlighted() { return this.fullyHighlighted; }

    public void setFullyHighlighted(boolean fullyHighlighted) { this.fullyHighlighted = fullyHighlighted; }

    private ArrayList<String> matchedWords;

    public ArrayList<String> getMatchedWords() { return this.matchedWords; }

    public void setMatchedWords(ArrayList<String> matchedWords) { this.matchedWords = matchedWords; }
}