package lesson7.tankslesson4.battlefield;

import java.awt.*;


public class Rock extends FieldObject implements Destroyable {

    public Rock(int y, int x) {
        super(y, x);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(255, 255, 0));
        g.fillRect(x, y, 64, 64);
    }
}
