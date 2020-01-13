package com.company;
import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> biblioteka = new ArrayList<>();

    public void addBook(Book book) {
        biblioteka.add(book);
    }

    public void showAllBooks() {
        for (Book book : biblioteka) {
            System.out.println(book.getImeAutora() + " " + book.getNaslov() + " " + book.getIsbn());
        }
    }

    public void removeBook(String naziv) {
        for (int i = 0; i < biblioteka.size(); i++) {
            if (biblioteka.get(i).getNaslov().equals(naziv)) {
                biblioteka.remove(biblioteka.get(i));
            }
        }
    }

    public void showBookDetails(String naziv) {
        for (int i = 0; i < biblioteka.size(); i++) {
            if (biblioteka.get(i).getNaslov().equals(naziv)) {
                System.out.println(biblioteka.get(i).getImeAutora() + " " + biblioteka.get(i).getNaslov() + " " + biblioteka.get(i).getIsbn());
            }
        }
    }
}
