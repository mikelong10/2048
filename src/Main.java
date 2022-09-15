import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JFrame window = new JFrame("");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // (x, y, w, h) 22 due to title bar.
    window.setBounds(0, 0, 800, 800 + 22);

    Panel panel = new Panel(window.getWidth(), window.getHeight());

    panel.setFocusable(true);
    panel.grabFocus();

    window.add(panel);

    window.setVisible(true);
  }
}