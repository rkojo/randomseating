import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tableAmount implements amount {

  @Override
  public void display() {
    JPanel display = new JPanel();
    JLabel label = new JLabel("how many tables?");
    JTextField text = new JTextField();
    display.add(label);
    display.add(text);
  }
  
}
