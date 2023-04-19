package Homework3;

public class Sale extends Pets1 {

    private String salepet;


    public Sale(String petname1, String petname2, String salepet) {
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




