import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

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
		if(!model.getHaveWinner()) {
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
			model.incrementTurns();
			model.switchPlayer();
		}
	}
	
}