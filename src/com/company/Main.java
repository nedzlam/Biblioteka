package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library biblioteka = new Library();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int opcija;
        int isbn;
        String imePrezimeAutora;
        String naziv;
        biblioteka.addBook(new Book("Dante Alighieri", "Pakao", 1));
        biblioteka.addBook(new Book("William Shakespeare", "Hamlet", 2));
        biblioteka.addBook(new Book("Franz Kafka", "Proces", 3));
        biblioteka.addBook(new Book("Marin Drzic", "Dundo Maroje", 4));

        System.out.println("Izaberite opciju: 1.Add book, 2.Show all books, 3.Remove book, 4.Show book details");
            opcija = scanner.nextInt();
            if(opcija == 1) {
                System.out.println("Koju knjigu zelite dodati?");
                System.out.println("Unesite naziv autora:");
                imePrezimeAutora = scanner1.nextLine();
                System.out.println("Naziv knige:");
                naziv = scanner2.nextLine();
                System.out.println("Unesite isbn:");
                isbn = scanner.nextInt();
                Book book = new Book(imePrezimeAutora, naziv, isbn);
                biblioteka.addBook(book);
                biblioteka.showAllBooks();
            }
            if(opcija == 2) {
                biblioteka.showAllBooks();
            }
            if(opcija == 3) {
                System.out.println("Koju knjigu zelite ukloniti?");
                System.out.println("Naziv knige:");
                naziv = scanner2.nextLine();
                biblioteka.removeBook(naziv);
                biblioteka.showAllBooks();
            }
            if(opcija == 4){
                System.out.println("Naziv knjige: ");
                naziv = scanner2.nextLine();
                biblioteka.showBookDetails(naziv);
            } } }
