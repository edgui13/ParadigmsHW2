
//Name: Edgar Alcocer
//Date: Feb 5 2023
//Assignment Description: Build a graphical interface to move an image using keyboard and mouse
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class Controller implements ActionListener, MouseListener, KeyListener {
	View view;
	Model model;
	boolean keyLeft;
	boolean keyRight;
	boolean keyUp;
	boolean keyDown;

	Controller() {
	}

	public void actionPerformed(ActionEvent e) {
		view.removeButton();
		// System.out.println("Hey! I said not to push that button!");
	}

	// Set destination for the image to go w/ the mouse
	public void mousePressed(MouseEvent e) {
		model.setDestination(e.getX(), e.getY());
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mouseClicked(MouseEvent e) {
	}

	void setView(View v) {
		view = v;
	}

	Controller(Model m) {
		model = m;
	}

	// Read the key that is pressed to move the image
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:
				keyRight = true;
				break;
			case KeyEvent.VK_LEFT:
				keyLeft = true;
				break;
			case KeyEvent.VK_UP:
				keyUp = true;
				break;
			case KeyEvent.VK_DOWN:
				keyDown = true;
				break;
		}
	}

	// Move the image after reading the key
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
			case KeyEvent.VK_RIGHT:
				keyRight = false;
				break;
			case KeyEvent.VK_LEFT:
				keyLeft = false;
				break;
			case KeyEvent.VK_UP:
				keyUp = false;
				break;
			case KeyEvent.VK_DOWN:
				keyDown = false;
				break;
		}
	}

	public void keyTyped(KeyEvent e) {

	}

	void update() {
		if (keyRight)
			model.dest_x += 4;
		if (keyLeft)
			model.dest_x -= 4;
		if (keyDown)
			model.dest_y += 4;
		if (keyUp)
			model.dest_y -= 4;
	}

}
