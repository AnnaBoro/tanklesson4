package lesson7.tankslesson4.battlefield;

import java.awt.*;


public class Brick  extends FieldObject {

    public Brick(int y, int x) {
        super(y, x);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(0, 0, 255));
        g.fillRect(x, y, 64, 64);
    }
}