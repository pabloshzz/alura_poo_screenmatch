import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film();
        myFilm.setName("M3gan");
        myFilm.setYearOfRelease(2023);
        myFilm.setGenre("Terror");
        myFilm.setIncluidInPlan(true);
        myFilm.setDurationInMinutes(180);


       // myFilm.showDetails();
        myFilm.rating(5);
        myFilm.rating(7);
        myFilm.rating(10);

        //System.out.println("A média de avaliações do filme é: " + myFilm.getMedianRating());

        Series mySeries = new Series();
        mySeries.setName("Arcane");
        mySeries.setGenre("Aventura");
        mySeries.setYearOfRelease(2021);
        mySeries.setSeasons(2);
        mySeries.setEpisodesPerSeason(9);
        mySeries.showDetails();
    }
}
