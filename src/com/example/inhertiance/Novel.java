package com.example.inhertiance;

public class Novel extends Book {    int pages;

    void displayNovel() {
        displayInfo();
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {
        Novel n = new Novel();
        n.title = "Sahil";
        n.author = "Allah";
        n.pages = 500000;
        n.displayNovel();
    }
}

