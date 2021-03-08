import javax.sound.sampled.Line;

public class ListOfContacts {
    private Contact [] list;
    private int totalContactsInTheList;
    private int backNum;
    
    public ListOfContacts(){
        this.Contact = new Contact[4];
        this.totalContactsInTheList = 0;
        this.backNum = 0;
    }

    public ListOfContacts(Contact [] newArr){
        this.list = new Contact[newArr.length];

        for(int i =0;i<newArr.length;i++){
            this.list[i]=newArr[i];
        }
        this.totalContactsInTheList = list.length;
        this.backNum = list.length-1;
    }

    public int numberOfContacts(){
        return this.totalContactsInTheList;
    }

    public boolean isEmpty(){
        if(this.totalContactsInTheList==0){
            return true;
        }
        else{
            return false;
        }
        //end of isEmpty
    }       

    public boolean isFull(){
        
        if(this.totalContactsInTheList==this.list.length){
            return true;
        }
        else{
            return false;
        }
        //end of isFull
    }     

    public String enterContact(Contact newContact){
        if(isFull()){
            Contact [] newList = new Contact[this.list.length+1];
            for(int i=0;i< this.list.length;i++){
                newList[i]=this.list[i];
            }
            this.list = newList;
            this.list[this.list.length-1]=newContact;
            this.totalContactsInTheList = this.list.length;
            this.backNum = list.length-1;
        }
        else{
            this.list[this.backNum]=newContact;
            this.totalContactsInTheList++;
        }
    
        return newContact.getFirstName()+ " "+ newContact.getLastName();
        //end of enterContact
    }

    // public removeNull(){
    //     int counter = 0;
    //     for(int i =0;i<this.list.length;i++){
    //         if( !(this.list[i].getFirstName()==null) &&
    //         !(this.list[i].getLastName()==null)&&
    //         !(this.list[i].getPhoneNumber()==null)&&
    //         !(this.list[i].getCompanyName()==null) ){
    //            counter++; 
    //         }
    //     }


    // }

    public removeContact (String phoneNumberToRemove ){
        Contact [] listAfterRemoving = new Contact[this.list.length];
        for(int i=0, j=0;i<this.list.lenght;i++){
            if((phoneNumberToRemove.toLowerCase().equals(this.list[i].getPhoneNumber().toLowerCase()))){
                listAfterRemoving[j++]=this.list[i];
            }
        }
        this.list = listAfterRemoving;

        //end of remove contact
    }

    public String [] listAllContact(){
        String [] resAllContacts = new String [this.list.length];
        for(int i =0;i<this.list.length;i++){
            String entry = this.list[i].getFirstName()+" "+
            this.list[i].getLastName()+" "+
            this.list[i].getPhoneNumber()+" "+
            this.list[i].getCompanyName();
            resAllContacts[i]= entry;
        }
        return resAllContacts;
    }



}
