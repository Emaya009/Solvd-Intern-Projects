package Homework2;

public class Pettoys extends Petaccessories
{
    private String toy1;
    private String toy2;

    public Pettoys(String petname1, String petname2, String accessory1, String accessory2, String toy1, String toy2) {
        super(petname1, petname2, accessory1, accessory2);
        this.toy1 = toy1;
        this.toy2 = toy2;
    }
    public String getToy1() {
        return toy1;
    }

    public void setToy1(String toy1) {
        this.toy1 = toy1;
    }

    public String getToy2() {
        return toy2;
    }

    public void setToy2(String toy2) {
        this.toy2 = toy2;
    }


}
