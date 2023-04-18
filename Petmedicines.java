package Homework2;

public class Petmedicines extends Petsupplies {
    private String medicine1;
    private String medicine2;
    public String getMedicine1() {
        return medicine1;
    }

    public void setMedicine1(String medicine1) {
        this.medicine1 = medicine1;
    }

    public String getMedicine2() {
        return medicine2;
    }

    public void setMedicine2(String medicine2) {
        this.medicine2 = medicine2;
    }

    public Petmedicines(String petname1, String petname2, String supply1, String supply2, String medicine1, String medicine2) {
        super(petname1, petname2, supply1, supply2);
        this.medicine1 = medicine1;
        this.medicine2 = medicine2;
    }
}
