package br.com.alura.screenmatch.models;

public class Film {
    private String name, genre;
    private int yearOfRelease;
    private int durationInMinutes;
    private int totalRatings;
    private boolean incluidInPlan;
    private double sumOfRatings;

    public void showDetails() {
        System.out.println("Nome do filme: " + name);
        System.out.println("Ano de lançamento: " + yearOfRelease);
        System.out.println("Gênero: " + genre);
    }

    public void rating(double rate) {
        sumOfRatings += rate;
        totalRatings++;
    }

    public double getMedianRating() {
        return (sumOfRatings / totalRatings);
    }

    public int getTotalRatings() {
        return totalRatings;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean getIncluidInPlan() {
        return this.incluidInPlan;
    }

    public void setIncluidInPlan(boolean incluidInPlan) {
        this.incluidInPlan = incluidInPlan;
    }

    public int getDurationInMinutes() {
        return this.durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getSumOfRatings() {
        return sumOfRatings;
    }


}

