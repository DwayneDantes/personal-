public class App {
    public static void main(String[] args) {

        
        Character Swordswoman =new Character(350,0,60,"Fiora");
        Swordswoman.sayMyName();
        Swordswoman.sayMyAttributes();

        Character Viking =new Character(400,0,100,"Tryndamere");
        Viking.sayMyName();
        Viking.sayMyAttributes();
       
        Character Darkin =new Character(450,40,50,"Aatrox");
        Darkin.sayMyName();
        Darkin.sayMyAttributes();

        item DoransShield =new item("Doran's Shield",450,1,1,"It blocks 45 damage",true);
        DoransShield.saymyitem();
        DoransShield.saymystats();
        DoransShield.saymytrade();
        
        item DoransBlade = new item(" Doran's Blade",450,1,1,"It deals 9 damage and has 2.5% omnivamp.",false);
        DoransBlade.saymyitem();
        DoransBlade.saymystats();
        DoransBlade.saymytrade();
        
        item Longsword = new item (" Longsword ",350,2,1,"Ït deals 15 damage but you take 10 more damage",true);
        Longsword.saymyitem();
        Longsword.saymystats();
        Longsword.saymytrade();
        
        pet Unicorn = new pet ("Unicorn",10,7,true);
        Unicorn.saymypetname();
        Unicorn.saymypetattributes();
        Unicorn.saymyhappiness();
        
        pet Dragon = new pet("Dragon",10,15,true);
        Dragon.saymypetname();
        Dragon.saymypetattributes();
        Dragon.saymyhappiness();
        
        pet Griffin = new pet("Griffin",14,17,false);
        Griffin.saymypetname();
        Griffin.saymypetattributes();
        Griffin.saymyhappiness();
    
    }
        
}
