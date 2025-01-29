public class PlayStation extends GameConsoles {
    // The 'void' keyword is used to specify a method that a method does not return any value
    // Overriding the parent class

    @Override
    void turnOn() {
        System.out.println("The PlaySation has been switched on!");
    }

    @Override 
    void logOn() {
        System.out.println("The player has been logged on into their PlayStation account!");
    }

    @Override
    void selectGameToPlay() {
        System.out.println("The player is now selecting what game they want to play.");
    }

    @Override
    void selectedGame() {
        System.out.println("The player has now selected a game!");
    }
}
