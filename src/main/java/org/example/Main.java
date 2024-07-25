package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of the animal (or press enter to finish): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String isDogStr = scanner.nextLine();
            boolean isDog = isDogStr.equalsIgnoreCase("yes");
            Animal animal = new Animal(name, isDog);
            animals.add(animal);
        }

        // Adding objects using overloaded constructors
        animals.add(new Animal());
        animals.add(new Animal("Bella"));
        animals.add(new Animal("Max", true));

        System.out.println("Animals entered:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Enter the title of the book (or press enter to finish): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Enter the number of pages: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the publication year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            Book book = new Book(title, numberOfPages, publicationYear);
            books.add(book);
        }

        // Adding objects using overloaded constructors
        books.add(new Book());
        books.add(new Book("1984"));
        books.add(new Book("To Kill a Mockingbird", 281, 1960));

        System.out.println("What information do you want to print? (everything/name) ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid choice");
        }

        ArrayList<TvShow> tvShows = new ArrayList<>();

        while (true) {
            System.out.println("Enter the name of the TV show (or press enter to finish): ");
            String showName = scanner.nextLine();
            if (showName.isEmpty()) {
                break;
            }

            System.out.println("Enter the number of episodes: ");
            int numberOfEpisodes = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter the genre: ");
            String genre = scanner.nextLine();

            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            tvShows.add(tvShow);
        }

        // Adding objects using overloaded constructors
        tvShows.add(new TvShow());
        tvShows.add(new TvShow("Friends"));
        tvShows.add(new TvShow("Breaking Bad", 62, "Crime, Drama, Thriller"));



        System.out.println("TV Shows entered:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}