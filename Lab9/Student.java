//Peter Boldyrev

public class Student {
    private String firstName;
    private String lastName;

    public Student(String newFirstName, String newLastName){
        this.firstName = newFirstName;
        this.lastName = newLastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String newFirst){
        this.firstName = newFirst;
        
    }

    public void setLastName(String newLast){
        this.lastName = newLast;
      
    }

    public String fullName(){
        return this.firstName+ " "+ this.lastName;
    }
    


}
