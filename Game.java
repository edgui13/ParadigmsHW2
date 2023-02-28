
//Name: Edgar Alcocer
//Date: Feb 5 2023
//Assignment Description: Build a graphical interface to move an image using keyboard and mouse
import javax.swing.JFrame;
import java.awt.Toolkit;

public class Game extends JFrame {
	// Variables
	Model model;
	Controller controller;
	View view;

	// Game constructor
	public Game() {
		model = new Model();// creates a new Model object
		controller = new Controller(model);// creates a new Controller object
		view = new View(controller, model);// creates a new View object
		this.setTitle("Turtle attack!");
		this.setSize(500, 500);
		this.setFocusable(true);
		this.getContentPane().add(view);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		view.addMouseListener(controller);
		this.addKeyListener(controller);
	}

	// MAIN FUNCTION
	public static void main(String[] args) {
		Game g = new Game(); // creates a new Game object
		g.run();
	}

	public void run() {
		while (true) {
			controller.update();
			model.update();
			view.repaint(); // This will indirectly call View.paintComponent
			Toolkit.getDefaultToolkit().sync(); // Updates screen

			// Go to sleep for 50 milliseconds
			try {
				Thread.sleep(40);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(1);
			}
			// System.out.println("hi"); // remove this line
		}
	}
}
