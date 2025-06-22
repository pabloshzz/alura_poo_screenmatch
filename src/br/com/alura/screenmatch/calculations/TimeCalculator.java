package br.com.alura.screenmatch.calculations;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void calculation(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
