//Peter Boldyrev 

public class TestLine {
    public static void main(String [] args){

        Student newStudent1 = new Student("Peter", "Boldyrev");
        String firstNameTest = newStudent1.getFirstName();
        String secondNameTest = newStudent1.getLastName();
        String fullName = newStudent1.fullName();
        System.out.println(fullName);
        System.out.println("Here is the initial test of first/last "+firstNameTest+" "+secondNameTest);


       newStudent1.setFirstName("Jack");
       newStudent1.setLastName("Dorsey");
             
        
     System.out.println("Testing it now, not more than 140 chars since first and last is "+newStudent1.getFirstName()+" "+newStudent1.getLastName());
     Student newStudent2 = new Student("Peter", "Boldyrev");
     Student newStudent3 = new Student("Joe", "Biden");

        LineAtOfficeHour line1 = new LineAtOfficeHour();
        System.out.println(line1.size());
        System.out.println(line1.inTheLine());

        System.out.println(line1.isFull());
        System.out.println(line1.isEmpty());


       line1.enterLine(newStudent1);
       line1.enterLine(newStudent2);
       line1.enterLine(newStudent3);

      
        System.out.println(line1.inTheLine());

        line1.seeTeacher(newStudent1);
        System.out.println(line1.inTheLine());
        System.out.println(line1.size());

        Student [] newArrOfStudents = {newStudent1,newStudent2,newStudent3,newStudent1,newStudent2,newStudent3};
        LineAtOfficeHour line2 = new LineAtOfficeHour(newArrOfStudents);
        System.out.println(line2.isFull());
        System.out.println(line2.isEmpty());

        line2.enterLine(newStudent1);

        System.out.println(line2.inTheLine());
        System.out.println(line2.firstInline().getFirstName()); // Jack 
        System.out.println(line2.firstInline().getLastName()); //Dorsey

        line2.seeTeacher(newStudent1);
        System.out.println(line2.inTheLine());
        System.out.println(line2.size());
        line2.enterLine(newStudent1);
        System.out.println(line2.inTheLine());
        
        System.out.println(line2.firstInline().getFirstName()); //Peter since Jack Dorsey was removed
        System.out.println(line2.firstInline().getLastName()); // Boldyrev since Jack Dorsey was removed
        //end of main
    }

    //end of TestLineClass
}
