package com.udemy.learnit.javacore.codingExercises.booksManagement;

public class Publisher {
    private int id;
    private String publisherName;

    public Publisher(int id, String publisherName){
        this.id = id;
        this.publisherName = publisherName;
    }

    public int getID(){
        return id;
    }

    public String getPublisherName(){
        return publisherName;
    }

    public void setID(int id){
        this.id = id;
    }

    public void setPublisherName(String publisherName){
        this.publisherName = publisherName;
    }

    public String toString(){
        return "Publisher [id = " + id + ", publisher name = " + publisherName + "]";
    }
}
