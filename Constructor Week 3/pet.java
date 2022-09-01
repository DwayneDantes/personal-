public class pet {
    String petname;
    int trustlevel;
    int petlevel;
    boolean ishappy;

public void saymypetname() {
    System.out.println(" I am " + petname);
}

public void saymypetattributes() {
    System.out.println( "My trust level is " + trustlevel + " my pet level is " + petlevel);
}

public void saymyhappiness() {
    if (ishappy) {
        System.out.println("It is happy");
    } else{
        System.out.println("It is not happy");
    } 
    }


public pet(String ptm, int trl, int plv, boolean ish) {
    petname = ptm;
    trustlevel= trl;
    petlevel = plv;
    ishappy =ish;
}
}