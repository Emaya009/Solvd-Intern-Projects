package Homework2;

public class Petfood extends Petsupplies {

    private String dogfood;
    private String birdfood;
    public Petfood(String petname1, String petname2, String supply1, String supply2, String dogfood, String birdfood)
    {
        super(petname1, petname2, supply1, supply2);
        this.dogfood = dogfood;
        this.birdfood = birdfood;
    }
    public String getDogfood() {
        return dogfood;
    }

    public void setDogfood(String dogfood) {
        this.dogfood = dogfood;
    }

    public String getBirdfood() {
        return birdfood;
    }

    public void setBirdfood(String birdfood) {
        this.birdfood = birdfood;
    }

    }

