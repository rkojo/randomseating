
public class table {
  //ArrayList<String[]> finaltable = new ArrayList<>();
  String[][] tb;

  public void setboundary(int a, int b) {
    tb = new String[a][b];
  }

//returns the people in the table
  public void ret() {
    for(int i = 0; i<tb.length; i++) {
      System.out.println("table " + (i+1));
      for(int j = 0; j<tb[i].length; j++) {
        System.out.println(tb[i][j]);
      }
    }

  }
}
