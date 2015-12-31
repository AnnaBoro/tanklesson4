package lesson7.tankslesson4.battlefield;

import java.awt.*;

public class Water extends FieldObject {

    public Water(int y, int x) {
        super(y, x);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(new Color(0, 0, 139));
        g.fillRect(x, y, 64, 64);
    }
}