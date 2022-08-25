public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Chen");
        // Calls the sayMyName method
        knight.sayMyName();
        knight.sayMyAttributes();
        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Akasha");
        // Calls the sayMyName method
        mage.sayMyName();
        mage.sayMyAttributes();
        // Creates a new object named "mage" from Character class
        Character thief = new Character(5, 10, 0, "Gondar");
        // Calls the sayMyName method
        thief.sayMyName();
        thief.sayMyAttributes();
        Character Priest = new Character(4,8,6,"Invoker");
        Priest.sayMyName();
        Priest.sayMyAttributes();
        
        Character Archer =new Character(7,8,5,"Mirana");
        Archer.sayMyName();
        Archer.sayMyAttributes();
    }
}
