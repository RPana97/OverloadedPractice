import java.util.ArrayList;
import java.util.Scanner;

public class TvShow {
    private String showName;
    private int numEpisodes;
    private String genre;

    // Constructor with parameters
    public TvShow(String showName, int numEpisodes, String genre) {
        this.showName = showName;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    // Default constructor
    public TvShow() {
        this.showName = "Unknown";
        this.numEpisodes = 0;
        this.genre = "Unknown";
    }

    // Constructor with only show name
    public TvShow(String showName) {
        this.showName = showName;
        this.numEpisodes = 0;
        this.genre = "Unknown";
    }

    public String getShowName() {
        return showName;
    }

    public int getNumEpisodes() {
        return numEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The name of the show is " + getShowName() + " with " + getNumEpisodes() + " episodes. The genre is " + getGenre();
    }

    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

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

        scanner.close();

        System.out.println("TV Shows entered:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
