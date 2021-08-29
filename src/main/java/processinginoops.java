import processing.core.PApplet;

public class processinginoops extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static void main(String[] args) {
        PApplet.main("processinginoops", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    ball[] b = new ball[4];

    @Override
    public void setup() {
        int k=1;
        for (int i = 0; i < b.length; i++) {
            b[i] = new ball(0,HEIGHT*k/5,i+1);
            k++;
        }

    }

    @Override
    public void draw() {
        for (ball i : b) {
            i.display();

        }

    }
    public class ball {
        float x , y , velx;
        ball(float x,float y,float velx)
        {
            this.x=x;
            this.y=y;
            this.velx=velx;
        }

        void display() {

            ellipse(x,y, 10, 10);
            x = x + velx;
        }



    }
}


