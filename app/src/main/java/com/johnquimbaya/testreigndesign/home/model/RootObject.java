package com.johnquimbaya.testreigndesign.home.model;

import java.util.ArrayList;
import java.util.List;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

public class RootObject
{

    private List<Hit> hits;

    private int nbHits;

    private int page;

    private int nbPages;

    private int hitsPerPage;

    private int processingTimeMS;

    private boolean exhaustiveNbHits;

    private String query;

    private String params;

    public void setHits(List<Hit> hits){
        this.hits = hits;
    }
    public List<Hit> getHits(){
        return this.hits;
    }
    public void setNbHits(int nbHits){
        this.nbHits = nbHits;
    }
    public int getNbHits(){
        return this.nbHits;
    }
    public void setPage(int page){
        this.page = page;
    }
    public int getPage(){
        return this.page;
    }
    public void setNbPages(int nbPages){
        this.nbPages = nbPages;
    }
    public int getNbPages(){
        return this.nbPages;
    }
    public void setHitsPerPage(int hitsPerPage){
        this.hitsPerPage = hitsPerPage;
    }
    public int getHitsPerPage(){
        return this.hitsPerPage;
    }
    public void setProcessingTimeMS(int processingTimeMS){
        this.processingTimeMS = processingTimeMS;
    }
    public int getProcessingTimeMS(){
        return this.processingTimeMS;
    }
    public void setExhaustiveNbHits(boolean exhaustiveNbHits){
        this.exhaustiveNbHits = exhaustiveNbHits;
    }
    public boolean getExhaustiveNbHits(){
        return this.exhaustiveNbHits;
    }
    public void setQuery(String query){
        this.query = query;
    }
    public String getQuery(){
        return this.query;
    }
    public void setParams(String params){
        this.params = params;
    }
    public String getParams(){
        return this.params;
    }
}
