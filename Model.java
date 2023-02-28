//Name: Edgar Alcocer
//Date: Feb 5 2023
//Assignment Description: Build a graphical interface to move an image using keyboard and mouse
class Model {
    int turtle_x;
    int turtle_y;
    int dest_x;
    int dest_y;

    Model() {
    }

    // Move the turtle
    public void update() {
        if (this.turtle_x < this.dest_x) {
            // this.turtle_x += 4;
            this.turtle_x += Math.min(4, dest_x - turtle_x);
            // System.out.println("RIGHT");
        } else if (this.turtle_x > this.dest_x) {
            // this.turtle_x -= 4;
            this.turtle_x -= Math.min(4, turtle_x - dest_x);
            // System.out.println("LEFT");
        }
        if (this.turtle_y < this.dest_y) {
            // this.turtle_y += 4;
            this.turtle_y += Math.min(4, dest_y - turtle_y);
            // System.out.println("DOWN");
        } else if (this.turtle_y > this.dest_y) {
            // this.turtle_y -= 4;
            this.turtle_y -= Math.min(4, turtle_y - dest_y);
            // System.out.println("UP");
        }
    }

    public void setDestination(int x, int y) {
        this.dest_x = x;
        this.dest_y = y;
    }
}