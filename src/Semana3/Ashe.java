package Semana3;

import imonsh.Colors;
import imonsh.Screen;

public class Ashe extends Champion implements AsheActionCallbacks {

    public Ashe(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void frostShot(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/frostShot.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void hawkShot(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/hawkShot.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void rangerFocus(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/rangerFocus.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void volley(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/volley.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void crystalArrow(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/crystalArrow.gif");
        s.setBounds(200, 100, 1100, 900);
    }
}
