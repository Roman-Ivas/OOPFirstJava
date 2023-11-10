package org.example;

public class Builder extends Human{
    private String constructionSpecialty;

    public Builder(String name, int age, String constructionSpecialty) {
        super(name, age);
        this.constructionSpecialty = constructionSpecialty;
    }

    // Getters and setters for constructionSpecialty
    public String getConstructionSpecialty() {
        return constructionSpecialty;
    }

    public void setConstructionSpecialty(String constructionSpecialty) {
        this.constructionSpecialty = constructionSpecialty;
    }
}
