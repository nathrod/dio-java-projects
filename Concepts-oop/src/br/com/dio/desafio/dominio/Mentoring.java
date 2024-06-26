package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoring extends Content{
    LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Mentoring{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public double calculateXp() {
        return DEFAULT_XP + 20;
    }
}
