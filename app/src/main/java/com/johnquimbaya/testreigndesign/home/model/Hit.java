package com.johnquimbaya.testreigndesign.home.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */

public class Hit{

    private String created_at;

    private String title;

    private String url;

    private String author;

    private String points;

    private String story_text;

    private String comment_text;

    private String num_comments;

    private int story_id;

    private String story_title;

    private String story_url;

    private int parent_id;

    private int created_at_i;

    private List<String> _tags;

    private String objectID;

    private HighlightResult _highlightResult;

    public void setCreated_at(String created_at){
        this.created_at = created_at;
    }
    public String getCreated_at(){
        return this.created_at;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getUrl(){
        return this.url;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return this.author;
    }
    public void setPoints(String points){
        this.points = points;
    }
    public String getPoints(){
        return this.points;
    }
    public void setStory_text(String story_text){
        this.story_text = story_text;
    }
    public String getStory_text(){
        return this.story_text;
    }
    public void setComment_text(String comment_text){
        this.comment_text = comment_text;
    }
    public String getComment_text(){
        return this.comment_text;
    }
    public void setNum_comments(String num_comments){
        this.num_comments = num_comments;
    }
    public String getNum_comments(){
        return this.num_comments;
    }
    public void setStory_id(int story_id){
        this.story_id = story_id;
    }
    public int getStory_id(){
        return this.story_id;
    }
    public void setStory_title(String story_title){
        this.story_title = story_title;
    }
    public String getStory_title(){
        return this.story_title;
    }
    public void setStory_url(String story_url){
        this.story_url = story_url;
    }
    public String getStory_url(){
        return this.story_url;
    }
    public void setParent_id(int parent_id){
        this.parent_id = parent_id;
    }
    public int getParent_id(){
        return this.parent_id;
    }
    public void setCreated_at_i(int created_at_i){
        this.created_at_i = created_at_i;
    }
    public int getCreated_at_i(){
        return this.created_at_i;
    }
    public void set_tags(List<String> _tags){
        this._tags = _tags;
    }
    public List<String> get_tags(){
        return this._tags;
    }
    public void setObjectID(String objectID){
        this.objectID = objectID;
    }
    public String getObjectID(){
        return this.objectID;
    }
    public void set_highlightResult(HighlightResult _highlightResult){
        this._highlightResult = _highlightResult;
    }
    public HighlightResult get_highlightResult(){
        return this._highlightResult;
    }
}

