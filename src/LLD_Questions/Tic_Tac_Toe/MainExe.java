package LLD_Questions.Tic_Tac_Toe;

public class MainExe {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("Game winner is: " + game.startGame());
    }
}
