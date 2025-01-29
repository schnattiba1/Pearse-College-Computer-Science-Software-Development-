public abstract class GameConsoles {
    
            /* Calling the abstract methods, they cannot be called outside of 
             * the abstract class because it is a restricted class, that cannot
             * be used to create objects.
            */
            abstract void turnOn();
            abstract void logOn();
            abstract void selectGameToPlay();
            abstract void selectedGame(); 
    
            // Template method
            // The 'final' keyword is the constant, which is, it can never be modified.
            public final void gameOn() {
                // The player turns the game console on
                turnOn();
                
                // The player logs on to the game console
                logOn();
    
                // The player selects the game they want to play
                selectGameToPlay();
    
                // The player selected the game they want to play
                selectedGame();
    }
}
