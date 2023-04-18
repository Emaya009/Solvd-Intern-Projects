package Homework2;

public class Petaccessories extends Pets{
    private String accessory1;
    private String accessory2;

    public Petaccessories(String petname1, String petname2, String accessory1, String accessory2) {
        super(petname1, petname2);
        this.accessory1 = accessory1;
        this.accessory2 = accessory2;
    }
    public String getAccessory1() {
        return accessory1;
    }

    public void setAccessory1(String accessory1) {
        this.accessory1 = accessory1;
    }

    public String getAccessory2() {
        return accessory2;
    }

    public void setAccessory2(String accessory2) {
        this.accessory2 = accessory2;
    }


}
