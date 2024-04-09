package com.udemy.learnit.javacore.codingExercises.booksManagement;

public class Author {
    private int id;
    private String firstName;
    private String lastName;

    public Author(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getID(){
        return id;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setID(int id){
        this.id = id;
    }

    public String toString(){
        return "Author [id = " + id + ", first name = " + firstName + ", last name = " + lastName + "]";
    }
}
