package com.mycompany.library;

public class Book {

    private long isbn;
    private String title;
    private String subtitle;
    private String author;
    private String published;
    private String publisher;
    private int pages;
    private String description;
    private String website;
    private boolean isRented;

    public Book(long isbn, String title, String subtitle, String author, String published, String publisher, int pages, String description, String website, boolean isRented) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.author = author;
        this.published = published;
        this.publisher = publisher;
        this.pages = pages;
        this.description = description;
        this.website = website;
        this.isRented = isRented;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    @Override
    public String toString() {
        return "Book { "
                + "isbn: " + isbn
                + ", title: '" + title + '\''
                + ", subtitle: '" + subtitle + '\''
                + ", author: '" + author + '\''
                + ", published: '" + published + '\''
                + ", publisher: '" + publisher + '\''
                + ", pages: " + pages
                + ", description: '" + description + '\''
                + ", website:' " + website + '\''
                + ", isRented: " + isRented
                + " }";
    }
}
