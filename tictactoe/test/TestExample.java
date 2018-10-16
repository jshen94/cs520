import org.junit.Test;
import static org.junit.Assert.*;

/**
 * An example test class, which merely shows how to write JUnit tests.
 */
public class TestExample {
    @Test
    public void testNewGame() {
        TicTacToe game = new TicTacToe();
        assertEquals (true, game.getController().getModel().getPlayer());
        assertEquals (0, game.getController().getModel().getTurnCounter());
    }
    @Test
    public void testSwapPlayer() {
    	TicTacToe game = new TicTacToe();
    	assertEquals("X", game.getController().getModel().getSymbol(game.getController().getModel().getPlayer()));
    	game.getController().getModel().switchPlayer();
    	assertEquals("O", game.getController().getModel().getSymbol(game.getController().getModel().getPlayer()));
    }
    @Test
    public void testXWins() {
    	TicTacToe game = new TicTacToe();
    	game.getController().makeMove(0,0); //X moves
    	game.getController().makeMove(1,0); //O moves
    	game.getController().makeMove(0,1); //X moves
    	game.getController().makeMove(2,0); //O moves
    	game.getController().makeMove(0,2); //X moves
    	assertEquals(true, game.getController().getModel().getHasWinner());
    }
    @Test
    public void testReset() {
    	TicTacToe game = new TicTacToe();
    	game.getController().makeMove(0,0); //X moves
    	game.getController().makeMove(1,0); //O moves
    	game.getController().makeMove(0,1); //X moves
    	game.getController().makeMove(2,0); //O moves
    	game.getController().makeMove(0,2); //X moves
    	game.getController().getModel().reset();
    	assertEquals(false, game.getController().getModel().getHasWinner());
    }
}
