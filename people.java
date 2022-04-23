import java.util.ArrayList;
import java.util.List;

public class people {
  List<String> peeps = new ArrayList<String>();

  public people() {
  }

  public List<String> show() {
    return peeps;
  }

  //add to people list
  public void add(String a) {
    peeps.add(a);
  }
  //randomly return a person, and removing them from the list.
  public String randAdd() {
    int rand = (int)(Math.random()  * peeps.size());
    String use =  peeps.get(rand);
    peeps.remove(rand);
    return use;
  }
}
