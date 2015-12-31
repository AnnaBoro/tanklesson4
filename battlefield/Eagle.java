package lesson7.tankslesson4.battlefield;

import java.awt.*;


public class Eagle extends FieldObject implements Destroyable {

    public Eagle(int y, int x) {
        super(y, x);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(150, 0, 140));
        g.fillRect(x, y, 64, 64);
    }
}