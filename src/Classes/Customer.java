package Classes;

/**
 * Created by JPMPC-B218 on 11/10/2016.
 */
public class Customer extends Person{

    public float customerID;
    public String membershipLevel;
    public float creditcardNumber;

    public float getCustomerID() {
        return customerID;
    }

    public void setCustomerID(float customerID) {
        this.customerID = customerID;
    }

    public String getMembershipLevel() {
        return membershipLevel;
    }

    public void setMembershipLevel(String membershipLevel) {
        this.membershipLevel = membershipLevel;
    }

    public float getCreditcardNumber() {
        return creditcardNumber;
    }

    public void setCreditcardNumber(float creditcardNumber) {
        this.creditcardNumber = creditcardNumber;
    }
}
