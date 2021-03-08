public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String companyName;
    private String userID;

    public Contact(){
        this.firstName = "first name is empty";
        this.lastName = "last name is empty";
        this.phoneNumber = 0;
        this.companyName = "company name is empty";
    }

    public Contact(String newFirstName, String newLastName, String newPhoneNumber, String newCompanyName){
        this.firstName = newFirstName;
        this.lastName = newLastName;
        this.phoneNumber = newPhoneNumber;
        this.companyName = newCompanyName;
    }

    public setFirstName(String newFirstName){
        this.firstName = newFirstName;
    }

    public setLastName(String newLastName){
        this.lastName = newLastName;
    }

    public setPhoneNumber(String newPhoneNumber){
        this.phoneNumber = newFirstName;
    }

    public setCompanyName(String newCompanyName){
        this.companyName = newCompanyName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getCompanyName(){
        return this.companyName;
    }

    
    public String toString(){
        return this.firstName+" "+this.lastName+
        " "+this.phoneNumber+" "+this.companyName;
    }


    //end of class
}
