// import java.awt.Dimension;
import java.util.Scanner;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JPanel;
// import javax.swing.JTextField;

public class app {
  
  public static void main(String[] args) throws Exception{
    // JPanel panel = new JPanel();
    // JFrame frame = new JFrame();
    // frame.setVisible(true);
    // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setSize(500,500);
 
    // //panel.setPreferredSize(new Dimension(500,500));
    // frame.add(panel);
    // panel.setLayout(null);
    // JLabel label = new JLabel("How many Tables?");
    // label.setBounds(175, 10, 150, 25);
    // panel.add(label);

    //JTextField in = new JTextField();
    // in.setBounds(175,50,100,25);
    // panel.add(in);

    // JButton b = new JButton("Enter"); 
    // b.setBounds(175, 90, 100, 25);
    // panel.add(b);

    table t = new table();
    people p = new people();
    Scanner sc = new Scanner(System.in);
    System.out.println("how many tables?");
    int a = sc.nextInt();
    // String text = in.getText();
    // a = Integer.parseInt(text);
    System.out.println("how many in a table?"); 
    int b = sc.nextInt();
    t.setboundary(a, b);
    //add people into arraylist
    for(int i = 0; i<a*b; i++) {
      System.out.println("input name " + i);
      p.add(sc.next());
    }
    sc.close();
    //add to tables;
    for(int i = 0; i<t.tb.length; i++) {
      for(int k = 0; k< t.tb[i].length; k++) {
        t.tb[i][k] = p.randAdd();
      }
    }
    t.ret();
    
    }
}
