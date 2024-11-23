public class Main {
    public static void main(String[] args) {
        // Creating the objects of the superclass(parent) -> GameConsoles

        // Creating the object of Playstation
        GameConsoles gameConsoles = new PlayStation();
        gameConsoles.gameOn();
        System.out.println();

        // Creating the object of Xbox
        gameConsoles = new Xbox();
        gameConsoles.gameOn();
        System.out.println();

        // Creating the object of Nintendo Switch
        gameConsoles = new NintendoSwitch();
        gameConsoles.gameOn();
        System.out.println();
    }
}
