import java.util.Scanner;

public class App{
    //Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
       
       // String crush =revealmycrush();
      //  System.out.println(crush);

      //  float divide = divide();
      //  System.out.println(" The quotient is " + divide);
        
      //  int multiply = multiply();
       // System.out.println(" The product is " + multiply);
        String order = myorder();
        System.out.println(order);

        
    }

    static String myorder(){
    System.out.println(" Please enter your order");
    String order1 = scan.nextLine();
    System.out.println("Please enter the price");
    int order1price = scan.nextInt();

    scan.nextLine();
    System.out.println(" Please enter your second order");
    String order2 = scan.nextLine();
    System.out.println("Please enter the price");
    int order2price = scan.nextInt();
   
    scan.nextLine();
    System.out.println(" Please enter your third order");
    String order3 = scan.nextLine();
    System.out.println("Please enter the price");
    int order3price = scan.nextInt();

    int total = (order1price + order2price + order3price);
    return " your order is " + order1 + "," + order2 + " and "  + order3 + " Your total amount is " + total;
    
    

    





    //static int multiply() {
    //System.out.println("please enter two numbers to multiply");
   // System.out.println("please enter the first number");
   // int x = scan.nextInt();

   // System.out.println("Please enter the second number");
   // int y = scan.nextInt();
   // return x * y;
}

//static int divide() {
   // System.out.println("Please enter two numbers to divide");
   // System.out.println("Please enter the first number");
   // int x = scan.nextInt();

   // System.out.println("Please enter the Second number ");
   // int y = scan.nextInt();
   // return x / y;
{


//static String revealmycrush(){
    //System.out.println("This method will reveal your crush");
   // System.out.println("Enter your name");
   // String name = scan.nextLine();
    

   // System.out.println("Enter your crush's name");
   // String crush = scan.nextLine();
  

   // System.out.println("Enter your second crush's name");
   // String crushname2 = scan.nextLine();
   // return name + " loves " + crush + " and " + crushname2;



}
}
