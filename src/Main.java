import br.com.alura.screenmatch.calculations.TimeCalculator;
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

        Film myFilm1 = new Film();
        myFilm1.setName("Avatar");
        myFilm1.setYearOfRelease(2009);
        myFilm1.setGenre("Sci-Fi");
        myFilm1.setIncluidInPlan(true);
        myFilm1.setDurationInMinutes(200);
        myFilm1.showDetails();
        System.out.println("A duração do filme " + myFilm1.getName() + " em minutos é: " + myFilm1.getDurationInMinutes());

        myFilm1.rating(8);
        myFilm1.rating(6);
        myFilm1.rating(9);

        System.out.println("A média de avaliações do filme " + myFilm1.getName() + " é: " + myFilm1.getMedianRating());
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

        mySeries.rating(8);
        mySeries.rating(9);
        mySeries.rating(8);

        System.out.println("A média de avaliações da série " + mySeries.getName() + " é: " + mySeries.getMedianRating());
        System.out.println();

        TimeCalculator calculator = new TimeCalculator();
        calculator.calculation(myFilm);
        calculator.calculation(myFilm1);
        calculator.calculation(mySeries);
        System.out.println("O tempo total em minutos para assistir " + myFilm.getName() + ", " + myFilm1.getName() + ", " + mySeries.getName() +" é: " + calculator.getTotalTime());
    }
}
