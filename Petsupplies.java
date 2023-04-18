package Homework2;

public class Petsupplies extends Pets
{
    private String supply1;
    private String supply2;
    public Petsupplies(String petname1, String petname2, String supply1, String supply2) {
        super(petname1, petname2);
        this.supply1 = supply1;
        this.supply2 = supply2;
    }
    public String getSupply1() {
        return supply1;
    }

    public void setSupply1(String supply1) {
        this.supply1 = supply1;
    }

    public String getSupply2() {
        return supply2;
    }

    public void setSupply2(String supply2) {
        this.supply2 = supply2;
    }


}
