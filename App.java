public class App {

    public static void main(String[]args) {

        Character Swordswoman = new Character();
        Swordswoman.AttackDamage = 400;
        Swordswoman.AbilityPower= 0;
        Swordswoman.Armor= 100;
        Swordswoman.name= "Fiora";
        Swordswoman.sayMyName();
        Swordswoman.sayMyAttackDamage();
        Swordswoman.sayMyAbilityPower();
        Swordswoman.sayMyArmor();
        
    
        Character Viking = new Character();
        Viking.AttackDamage = 350;
        Viking.AbilityPower = 0;
        Viking.Armor =60;
        Viking.name = "Tryndamere";
        Viking.sayMyName();
        Viking.sayMyAttackDamage();
        Viking.sayMyAbilityPower();
        Viking.sayMyArmor();
    
        Character Darkin = new Character();
        Darkin.AttackDamage = 350;
        Darkin.AbilityPower = 0;
        Darkin.Armor =60;
        Darkin.name = "Aatrox";
        Darkin.sayMyName();
        Darkin.sayMyAttackDamage();
        Darkin.sayMyAbilityPower();
        Darkin.sayMyArmor();
    } 
}