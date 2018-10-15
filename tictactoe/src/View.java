import java.awt.*;
import javax.swing.*;

public class View{
    private JFrame gui;
    private JButton[][] buttons;
    private JButton reset;
    private JTextArea playerturn;
	
	public View() {
		gui = new JFrame("Tic Tac Toe");
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(new Dimension(500, 350));
        gui.setResizable(true);
        
        addComponentsToPane(gui);
		
	}
	
	public void addComponentsToPane(final Container pane) {
		JPanel gamePanel = new JPanel(new FlowLayout());
        JPanel game = new JPanel(new GridLayout(3,3));

        gamePanel.add(initGrid(game), BorderLayout.CENTER);
        
        JPanel options = new JPanel(new FlowLayout());
        options.add(reset);
        JPanel messages = new JPanel(new FlowLayout());
        messages.setBackground(Color.white);
        
        gui.add(gamePanel, BorderLayout.NORTH);
        gui.add(options, BorderLayout.CENTER);
        gui.add(messages, BorderLayout.SOUTH);
        
		reset = new JButton("Reset");
		playerturn = new JTextArea();
		
		
		pane.add(gamePanel);
	}
	
	private JPanel initGrid(JPanel gameGrid) {
	JPanel grid = gameGrid;	
	buttons = new JButton[3][3];
	
	for(int i = 0; i < 3; i++) {
		for(int j = 0; j < 3; j++) {
			buttons[i][j] = new JButton();
			grid.add(buttons[i][j]);
		}
	}
	return grid;
	}
	
	public JButton[][] getButtons() {
		return buttons;
	}
	
}