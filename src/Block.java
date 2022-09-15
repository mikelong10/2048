import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Block {
  private int value, x, y, size;
  private final Map<Integer, Color> colorCode;

  public Block(int value, int x, int y, int size) {
    this.value = value;
    this.x = x;
    this.y = y;
    this.size = size;
    this.colorCode = setColorCode();
  }

  public void draw(Graphics2D g2) {
    g2.setColor(this.colorCode.get(this.value));
    g2.fillRect(x + 4, y + 4, size - 8, size - 8);
    g2.setColor(this.colorCode.get(0));
    if (value > 1 && value < 10) {
      g2.setFont(new Font("single", Font.PLAIN, 100));
      g2.drawString("" + value, x + 70, y + 138);
    } else if (value > 9 && value < 100) {
      g2.setFont(new Font("double", Font.PLAIN, 85));
      g2.drawString("" + value, x + 47, y + 130);
    } else if (value > 99 && value < 1000) {
      g2.setFont(new Font("triple", Font.PLAIN, 70));
      g2.drawString("" + value, x + 32, y + 123);
    } else if (value > 999 && value < 10000) {
      g2.setFont(new Font("quad", Font.PLAIN, 55));
      g2.drawString("" + value, x + 28, y + 117);
    }
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  private Map<Integer, Color> setColorCode() {
    Map<Integer, Color> colorCode = new HashMap<Integer, Color>();
    colorCode.put(0, new Color(118, 110, 101));
    colorCode.put(1, new Color(204, 192, 179));
    colorCode.put(2, new Color(238, 227, 218));
    colorCode.put(4, new Color(238, 224, 201));
    colorCode.put(8, new Color(243, 178, 121));
    colorCode.put(16, new Color(246, 149, 99));
    colorCode.put(32, new Color(247, 124, 95));
    colorCode.put(64, new Color(247, 95, 59));
    colorCode.put(128, new Color(237, 208, 115));
    colorCode.put(256, new Color(237, 204, 97));
    colorCode.put(512, new Color(237, 199, 80));
    colorCode.put(1024, new Color(237, 196, 63));
    colorCode.put(2048, new Color(237, 193, 46));
    return colorCode;
  }
}
