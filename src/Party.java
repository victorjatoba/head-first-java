import java.awt.*;

class Party {

  public void buildInvite() {
    Frame f = new Frame();
    Label l = new Label("Party at Tim's");
    Button b = new Button("You bet");
    Button c = new Button("Shoot me");
    Panel p = new Panel();
    p.add(l);
    p.add(b);
    p.add(c);
    f.add(p);
    f.setVisible(true);
  }
}
