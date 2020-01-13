package com.company;

public class Book {
    private String imePrezimeAutora;
    private String naslov;
    private int isbn;

    public Book(String imePrezimeAutora, String naslov, int isbn) {
        this.imePrezimeAutora = imePrezimeAutora;
        this.naslov = naslov;
        this.isbn = isbn;
    }

    public String getImeAutora() {return imePrezimeAutora;}

    public String getNaslov() {return naslov;}

    public int getIsbn() {return isbn;}
}
