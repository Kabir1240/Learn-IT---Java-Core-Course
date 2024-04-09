package com.udemy.learnit.javacore.codingExercises.booksManagement;

import java.math.BigDecimal;

public class Book {
    private int id;
    private String name;
    private Author[] authors;
    private Publisher publisher;
    private int publishingYear;
    private int amountOfPages;
    private BigDecimal price;
    private CoverType coverType;

    public Book(int id, String name, Author[] authors, Publisher publisher, int publishingYear,
                int amountOfPages, BigDecimal price, CoverType coverType){
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingYear = publishingYear;
        this.amountOfPages = amountOfPages;
        this.price = price;
        this.coverType = coverType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public int getAmountOfPages() {
        return amountOfPages;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public Author[] getAuthor(){
        return this.authors;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setAmountOfPages(int amountOfPages) {
        this.amountOfPages = amountOfPages;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setCoverType(CoverType coverType) {
        this.coverType = coverType;
    }

    public boolean matchAuthor(Author otherAuthor){
        for (Author author: this.authors){
            if (author.toString().equals(otherAuthor.toString())){
                return true;
            }
        }
        return false;
    }

    public boolean matchPublisher(Publisher publisher){
        return this.publisher.getPublisherName().equals(publisher.getPublisherName());
    }

    public boolean isGreaterThanPublishYear(int publishingYear){
        return this.publishingYear >= publishingYear;
    }

    @Override
    public String toString(){
        return "Book [id = " + id + ", name = " + name + ", authors = " + java.util.Arrays.toString(authors) +
                ", publisher = " + publisher + ", publishing year = " + publishingYear + ", amount of pages = " + amountOfPages +
                ", price = " + price + ", cover type = " + coverType + "]";
    }
}
