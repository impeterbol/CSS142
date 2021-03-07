//Peter Boldyrev

public class LineAtOfficeHour {
    private Student[] line;
    private int n; //number of students in the line.
    private int back; //index of the last student in line

    public LineAtOfficeHour(){
        this.line = new Student[5];
        this.n=0;
        this.back = 0;
    }

    public LineAtOfficeHour(Student[] newArr){
       this.line = new Student[5];
        int arrLength = newArr.length;
        if(arrLength>5){
            arrLength =5;
        }
        for(int i=0;i<arrLength;i++){
            line[i]=newArr[i];
            
        }
        this.n = line.length;
        this.back = line.length-1;
      //end of LineAtOfficeHours
    }

    public int inTheLine(){
        return this.n;
    }

    public boolean isEmpty(){
        if(this.n==0){
            return true;
        }
        else{
            return false;
        }
        //end of isEmpty
    }       

    public boolean isFull(){
        
        if(this.n==5){
            return true;
        }
        else{
            return false;
        }
      
        //end of isEmpty
    }      
    
    public int size(){
        return line.length;
        //end of isEmpty
    }     

    public void enterLine(Student newStudent){
        if(isFull()){
            System.out.println("Sorry, the line is full");
        }
        else{
           
            line[this.back]=newStudent;
            this.n++;
        }
        //end of enterLine
    }

    public Student seeTeacher(Student studentToRemove){
        Student [] newSet = new Student[this.line.length];
        for(int i=1,j=0;i<this.line.length;i++){
            newSet[j++]=this.line[i];
        }
        this.n--;
        this.line = newSet;
        return studentToRemove;
        //end of seeTeacher
    }
    public Student firstInline(){
        return this.line[0];
    }


}
