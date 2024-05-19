package br.com.dio.desafio.dominio;

public abstract class Content {
    private String title;
    private String description;
    protected static final double DEFAULT_XP = 10;

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
