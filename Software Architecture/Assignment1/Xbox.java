public class Xbox extends GameConsoles {
    @Override
    void turnOn() {
        System.out.println("The Xbox has been switched on!");
    }

    @Override
    void logOn() {
        System.out.println("The player has been logged on into their Xbox account!");
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
