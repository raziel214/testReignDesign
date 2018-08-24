package com.johnquimbaya.testreigndesign.home.model;


/**
 * created by john fredy quimbaya on 24/08/18.
 *
 */
public class HighlightResult
{      private Author author;

    private CommentText comment_text;

    private StoryTitle story_title;

    private StoryUrl story_url;

    public void setAuthor(Author author){
        this.author = author;
    }
    public Author getAuthor(){
        return this.author;
    }
    public void setComment_text(CommentText comment_text){
        this.comment_text = comment_text;
    }
    public CommentText getComment_text(){
        return this.comment_text;
    }
    public void setStory_title(StoryTitle story_title){
        this.story_title = story_title;
    }
    public StoryTitle getStory_title(){
        return this.story_title;
    }
    public void setStory_url(StoryUrl story_url){
        this.story_url = story_url;
    }
    public StoryUrl getStory_url(){
        return this.story_url;
    }
}
