package Homework2;
public class Petcustomercare extends Pets
{
        protected String contactnum1;
        private String emailid1;

    public Petcustomercare(String petname1, String petname2, String contactnum1, String emailid1) {
        super(petname1, petname2);
        this.contactnum1 = contactnum1;
        this.emailid1 = emailid1;
    }

    public String getContactnum1() {
        return contactnum1;
    }

    public void setContactnum1(String contactnum1) {
        this.contactnum1 = contactnum1;
    }

    public String getEmailid1() {
        return emailid1;
    }

    public void setEmailid1(String emailid1) {
        this.emailid1 = emailid1;
    }
}
