import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("James","Cameron");
        Director director1 = new Director("Stephan","Dj");
        Director director2 = new Director("Ernest","Japarov");

        Cast[]casts = {new Cast("Leonardo di Caprio","Major")};
        Cast[]casts1 = {new Cast("Rose","major")};
        Cast[]casts2 ={new Cast("Emil","major")};

        Movie movie= new Movie("Titanic",1998,"melodrama",director,casts);
        Movie movie1 = new Movie("flover",2020,"humor",director1,casts1);
        Movie movie2 = new Movie("Surprise",2018,"humor",director2,casts2);
        Movie[]movies ={movie,movie1,movie2};
       int s = new Scanner(System.in).nextInt();

     Movie movies1 = new Movie();
       switch (s){
           case 1->movie.getAllMovies(movies);
           case 2->movie.findMovieByActorName(movies);
           case 3->movie.findMovieByDirector(movies);
           case 4->movie.findMovieByYear(movies);
           case 5->movie.findMovieByName(movies);
           case 6->movie.findMovieByDescription(movies);
           case 7->movie.findMovieByRole(movies);
       }



        }











    }
