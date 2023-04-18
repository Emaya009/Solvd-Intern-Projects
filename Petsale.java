package Homework2;

public class Petsale extends Pets {

    private String salepet;
    public Petsale(String petname1, String petname2, String salepet) {
        super(petname1, petname2);
        this.salepet = salepet;
    }

    public String getSalepet() {
        return salepet;
    }

    public void setSalepet(String salepet) {
        this.salepet = salepet;
    }
}




