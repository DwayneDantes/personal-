public class student {
    //Attributes 
    String Surname;
    String Firstname;
    String MiddleInitial;
    String DateofBirth;
    int StudentNumber;
    String StudentEmailAddress;
    Boolean IamAwesome;


//Method
// Method
public void sayMyStudentnumber() {
    System.out.println("My student number is " + StudentNumber);
}

public void sayMyStudentEmailAdress(){
    System.out.println("My student email address is " + StudentEmailAddress);
}

public void AmIAwesome() {
    if (IamAwesome) {
        System.out.println("I am Awesome!");
    } else {
        System.out.println("I am not Awesome.");
    }
}



//Constructor
public student(String S,String F,String M,String D,int SN,String SE,Boolean IA) {
    Surname=S;
    Firstname=F;
    MiddleInitial=M;
    DateofBirth=D;
    StudentNumber=SN;
    StudentEmailAddress=SE;
    IamAwesome=IA;
}
}
