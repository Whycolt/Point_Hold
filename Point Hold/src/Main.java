import java.applet.Applet;

public class Main extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		// calling frame and game class
		Frame frame = new Frame();
		Game game = new Game();
		// Loading photos
		Photo o = new Photo();
		o.loadAll();
		// adding key listener
		frame.addKeyListener(game);
		frame.setFocusable(true);
		// adding game panel
		frame.add(game);
		// setting frame viable
		frame.setVisible(true);
	}// end of main
}
