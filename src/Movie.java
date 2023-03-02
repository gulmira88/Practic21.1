import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class Movie implements Findable {
    private String name;
    private int year;
    private String description;
    private Director director;
    private Cast[] casts;

    public Movie (){

    }
    public Movie(String name, int year, String description, Director director, Cast[] casts) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.casts = casts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Cast[] getCasts() {
        return casts;
    }

    public void setCasts(Cast[] casts) {
        this.casts = casts;
    }


    @Override
    public void getAllMovies(Movie[] movies) {

        for (Movie movie1 : movies) {
            System.out.println(movie1.toString());

        }


    }

    @Override
    public void findMovieByName(Movie[] movies) {
        String a = new Scanner(System.in).nextLine();
        for (Movie movie2 : movies) {
            if (a.equals(movie2.name)) {
                System.out.println(movie2.toString());

            }
        }

    }

    @Override
    public void findMovieByActorName(Movie[] movies) {
        String b = new Scanner(System.in).nextLine();
        for (Movie movie3 : movies) {
            for (Cast cast : movie3.getCasts()) {
                if (b.equals(cast.getActorFullName())) {
                    System.out.println(cast.toString());

                }
            }
        }
    }

    @Override
    public void findMovieByYear(Movie[] movies) {
        int b = new Scanner(System.in).nextInt();
        for (Movie movie4 : movies) {
            if (movie4.getYear() == b) {
                System.out.println(movie4.toString());
            }

        }

    }

    @Override
    public void findMovieByDirector(Movie[] movies) {
        String s = new Scanner(System.in).nextLine();
        for (Movie movie5 : movies) {
            if (movie5.getDirector().getName().toUpperCase().equals(s)) {
                System.out.println(movie5.toString());

            }
        }
    }

    @Override
    public void findMovieByDescription(Movie[] movies) {
        String m = new Scanner(System.in).nextLine();
        for (Movie movie6 : movies) {
            if (movie6.getDescription().toUpperCase().equals(m)) {
                System.out.println(movie6.toString());

            }
        }

    }


    @Override
    public String toString() {
        return "Movie:" +
                "name:" + name + ' ' +
                "\n year:" + year +
                "\n description:" + description + ' ' +
                "\n director:" + director +
                "\n casts:" + Arrays.toString(casts) +
                '\n';
    }

    @Override
    public void findMovieByRole(Movie[] movies) {
        String c = new Scanner(System.in).nextLine();
        for (Movie movie7 : movies) {
            for (Cast cast : movie7.getCasts()) {
                if (cast.getRole().toUpperCase().equals(c)) {
                    System.out.println(cast.toString());

                }

            }

        }




    }
}
