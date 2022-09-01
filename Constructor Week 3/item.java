public class item {
    //Attributes 
    String name;
    int price;
    int weight;
    int quantity;
    String Description; 
    boolean Trade;
    //Method
    public void saymyitem() {
        System.out.println(" I have a " + name);
    }
    
    public void saymystats() {
        System.out.println("It costs " + price + " It weighs " + weight + " I have " + quantity + " It is " + Description + " It is " + Trade);
    }
    
    public void saymytrade() {
    if (Trade) {
        System.out.println("It is tradeable");
    } else {
        System.out.println("It  cannot be traded");
    }
}


    
    // Constructor
    public item(String nme, int pr, int wgt, int qty, String Desc,boolean Tr) {
        name = nme;
        price = pr ;
        weight = wgt ;
        quantity = qty ;
        Description = Desc ;
        Trade = Tr ;
    }
    
    
}
    
