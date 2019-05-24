package sources;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

import memo.CarteApp;

public class MineApp extends FrameForDemoMaker{

    private static final int ROW_COUNT = 10;
    private static final int COLUMN_COUNT = 10;
    private Jeu img ;
    
	public MineApp() throws IOException{
        super("Demineur");
        setDefaultBounds(100,100,900,600);
    }

	 @Override
	    public void init(JFrame frame) {
	    	Container cp = frame.getContentPane();
	    	int rows = ROW_COUNT;
	    	int cols = COLUMN_COUNT;
	    	cp.setLayout(new GridLayout(rows, cols));

	    	LinkedList<ImageIcon> pioche = jeu.creerPioche();
	    	while(!pioche.isEmpty())
	    	{
	    		cp.add(createButton(pioche.pop()));
	    	}
	    	
	    	
	    }
	
	 private Component createButton(ImageIcon pop) {
	    	ImageIcon imageIcon = pop ; // Récupération depuis la pioche
	    	JToggleButton button = new JToggleButton(dosCarte);
	    	button.setSelectedIcon(imageIcon);
	    	button.setDisabledIcon(imageIcon);
	    	button.setDisabledSelectedIcon(imageIcon);
	    	button.putClientProperty("carte", imageIcon.getDescription());

	    	button.addActionListener(new ActionListener() {
	    	  @Override
	    	  public void actionPerformed(ActionEvent e) {
	    		  state.nouveauBoutonSelectionne(button);
	    	  }
	    	});
	    	return button;
		}
	
	
	
	
	    public static void main(String[] args) throws IOException {
	    	MineApp example = new MineApp();
	        SwingUtilities.invokeLater(example);
	    }
	
}
