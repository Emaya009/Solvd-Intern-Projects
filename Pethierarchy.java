package Homework3;


public class Pethierarchy
{
    public static void main(String[] args) {

        Pets1 pt1=new Pets1("Dog","Birds");  //object class method using toString()
        System.out.println("Print pets available in the store" +pt1);

        Accessories ac1 = new Accessories("Dog","Birds"); //Object 1
        ac1.accessory1="Dog Collar";          //using object class equals() and hash code method for objects with same values
        ac1.accessory2="Bird Feeder";
        ac1.getAccessory1();
        ac1.getAccessory2();
        System.out.println("Accessories available: " +ac1.getAccessory1() +"," +ac1.getAccessory2());

        Accessories ac2 = new Accessories("Dog","Birds");  //Object 2
        ac2.accessory1="Dog Collar";         //using object class equals() and hash code method for objects with same values
        ac2.accessory2="Bird Feeder";
        ac2.getAccessory1();
        ac2.getAccessory2();
        System.out.println("Accessories available: " +ac2.getAccessory1() +"," +ac2.getAccessory2());
        boolean result = ac1.equals(ac2);
        System.out.println("Objects with same values using equals method:" +result);

        Toys inptoy=new Toys("Dog","Birds","Dog Bone");
        inptoy.price=12.55;           //using object class equals() and hash code method for objects with different values
        Toys inptoy1=new Toys("Dog","Birds","Dog Bone");
        inptoy1.price=13.25;          //using object class equals() and hash code method for objects with different values
        System.out.println("Price of toy1 and toy2 are:" +inptoy.price +"," +inptoy1.price);
        boolean result1=inptoy.equals(inptoy1);
        System.out.println("Objects with different values using equals method:"+ result1);

        Food food1 = new Food("Dry Dog Food", "Seed treat bell");
        food1.getDogfood();          //abstract and override method is used
        food1.getBirdfood();
        food1.supplies();
        food1.displaysupplies();
        System.out.println("Pet foods available:" + food1.getDogfood() + "," + food1.getBirdfood());


        Medicines medi1 = new Medicines("First AID Kit", "Nexguard Chewables");
        medi1.getMedicine1();      //abstract and override method is used
        medi1.getMedicine2();
        medi1.supplies();
        medi1.displaysupplies();
        System.out.println("Pet medicines available:" + medi1.getMedicine1() + "," + medi1.getMedicine2());


        Service ser1 = new Service("Dog","Birds","Dog Hair cut", "Bird Clipping");
        ser1.getService1();
        ser1.getService2();
        System.out.println("Pet services available:" + ser1.getService1() + "," + ser1.getService2());

        Daycare pcare=new Daycare("Dog","Birds","care will be provided");
        pcare.getCareone();
        System.out.println("For Dogs and Birds pet"+pcare.getCareone());

        Sale sale2=new Sale("Dog","Birds","for sale");
        sale2.getSalepet();
        System.out.println("Dog and Birds are " +sale2.getSalepet());

        Customercare contact1=new Customercare("Dog","Birds","765-723-0123","help@petshop.com");
        contact1.getContactnum();
        contact1.getEmailid();
        System.out.println("Petshop contact number and email:"+contact1.getContactnum() +" and " +contact1.getEmailid());
    }
    }
