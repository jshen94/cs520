import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Controller implements ActionListener {
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
		initListeners();
	}
	
	private void initListeners() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				view.getButtons()[i][j].addActionListener(this);
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(!model.getGameEnded()) {
			int x = 0;
			int y = 0;
			JButton[][] buttons = view.getButtons();
			for(int i = 0; i < 3; i++) {
				for(int j = 0; j < 3; j++) {
					if(buttons[i][j] == (JButton)e.getSource() ) {
						x = i;
						y = j;
					}
				}
			}
			model.placeSymbol(model.getPlayer(),x ,y);
			buttons[x][y].setText(model.getSymbol(model.getPlayer()));
			buttons[x][y].setEnabled(false);
			if (model.checkBoard(x,y)) {
				view.getPlayerTurnField().setText("Congratulations "+ model.getSymbol(model.getPlayer()) + " won!");
				for(JButton[] b: buttons) {
					for(JButton button : b) {
						button.setEnabled(false);
					}
				}
			}
			else {
				model.incrementTurns();
				model.switchPlayer();
				view.getPlayerTurnField().setText("Playing: "+ model.getSymbol(model.getPlayer()));
			}

		}
	}
	
}