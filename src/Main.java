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
        myFilm.showDetails();
        System.out.println("A duração do filme " + myFilm.getName() + " em minutos é: " + myFilm.getDurationInMinutes());

        myFilm.rating(5);
        myFilm.rating(7);
        myFilm.rating(10);

        System.out.println("A média de avaliações do filme " + myFilm.getName() + " é: " + myFilm.getMedianRating());
        System.out.println();

        Series mySeries = new Series();
        mySeries.setName("Arcane");
        mySeries.setGenre("Aventura");
        mySeries.setYearOfRelease(2021);
        mySeries.setSeasons(2);
        mySeries.setEpisodesPerSeason(9);
        mySeries.setMinutesPerEpisode(40);
        mySeries.showDetails();
        System.out.println("O tempo para maratonar " + mySeries.getName() + " em minutos é: " + mySeries.getDurationInMinutes());
    }
}
