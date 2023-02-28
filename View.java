
//Name: Edgar Alcocer
//Date: Feb 5 2023
//Assignment Description: Build a graphical interface to move an image using keyboard and mouse
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel {
	JButton b1;
	BufferedImage turtle_image;
	Model model;

	View(Controller c, Model m) {
		b1 = new JButton("Don't push me");
		b1.addActionListener(c);
		this.add(b1);
		c.setView(this);
		this.model = m;
		try {
			this.turtle_image = ImageIO.read(new File("turtle.png"));// loads the image into memory it doesnt draw it
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	void removeButton() {
		this.remove(b1);
		this.repaint();
	}

	public void paintComponent(Graphics g) { // this will draw the image
		g.setColor(new Color(128, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		// g.drawImage(this.turtle_image, 50, 200, null);
		g.drawImage(this.turtle_image, model.turtle_x, model.turtle_y, null);
	}
}
