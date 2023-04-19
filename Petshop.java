package Homework2;
import java.util.*;
import java.lang.String;

public class Petshop {
    public static void main(String[] args) {
        
        Pets p1=new Pets("Dog","Birds");
        p1.getPetname1();
        p1.getPetname2();
        System.out.println("Pets available:" + p1.getPetname1() + "," + p1.getPetname2());
        
        Petsupplies sup1 = new Petsupplies("Dog", "Birds", "Bath Items", "Pet Bed");
        sup1.getSupply1();
        sup1.getSupply2();
        System.out.println("Pet supplies available:" + sup1.getSupply1() + "," + sup1.getSupply2());
        
        Petaccessories a1 = new Petaccessories("Dog", "Birds", "Dog Collar", "Bird Feeder");
        a1.getAccessory1();
        a1.getAccessory2();
        System.out.println("Pet accessories available:" + a1.getAccessory1() + "," + a1.getAccessory2());
        
        Petfood food = new Petfood("Dog", "Birds", "Bath Items", "Pet Bed", "Seed treat bell", "Dry Dog Food");
        food.getDogfood();
        food.getBirdfood();
        System.out.println("Pet foods available:" + food.getDogfood() + "," + food.getBirdfood());
        
        Petmedicines med1 = new Petmedicines("Dog", "Birds", "Bath Items", "Pet Bed", "First AID Kit", "Nexguard Chewables");
        med1.getMedicine1();
        med1.getMedicine2();
        System.out.println("Pet medicines available:" + med1.getMedicine1() + "," + med1.getMedicine2());
        
        Pettoys toy1 = new Pettoys("Dog", "Birds", "Dog Collar", "Bird Feeder", "Dog Bone", "Bird Swing");
        toy1.getToy1();
        toy1.getToy2();
        System.out.println("Pet toys available:" + toy1.getToy1() + "," + toy1.getToy2());
        
        Petservice service1 = new Petservice("Dog","Birds","Dog Hair cut", "Bird Clipping");
        service1.getService1();
        service1.getService2();
        System.out.println("Pet services available:" + service1.getService1() + "," + service1.getService2());
        
        Petcare care1 = new Petcare("Dog","Birds","Pets donated will be taken care");
        System.out.println("Pet care provided");
        
        Petsale sale1 = new Petsale("Dog","Bird","Pet sale are here");
        sale1.getSalepet();
        System.out.println("Pet Sale:" +sale1.getSalepet());
        
        Petcustomercare custom=new Petcustomercare("Dog","Birds","754-632-1490","help1@petshop.com");
        custom.getContactnum1();
        custom.getEmailid1();
        System.out.println("Print the customer care details:"+custom.getContactnum1() + "and" +custom.getEmailid1());
    
    }
    }
