package Semana3;

import imonsh.Colors;
import imonsh.Screen;

public class Jinx extends Champion implements JinxActionCallbacks {

    public Jinx(int id, String name, String role, String difficulty, String description) {
        super(id, name, role, difficulty, description);
    }

    @Override
    public void getExcited(Screen s) {
        s.setVisible(true);
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/getExcited.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void switcheroo(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/switcheroo.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void zap(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/zap.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void flameChompers(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/flameChompers.gif");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void deathRocket(Screen s) {
        s.cls();
        s.repaint();
        s.out(showMessage(), "Victor Mono", 28, Colors.BlueHorizon);
        s.showImage("./media/deathRocket.gif");
        s.setBounds(200, 100, 1100, 900);
    }
}
