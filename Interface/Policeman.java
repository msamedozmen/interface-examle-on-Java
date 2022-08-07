import java.util.ArrayList;

public class Policeman {
    ArrayList<Person> personArrayList;
    int treasury = 0;

    public Policeman() {
        personArrayList = new ArrayList<>();
    }
    public void add(Person p){
        personArrayList.add(p);
        if(p.inputProbability<=p.probability&&(p.hour>p.start||p.hour<p.end)){
            treasury += p.punishment;
        }
    }
}
