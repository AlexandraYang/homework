import java.util.ArrayList;
import java.util.Scanner;

public class Persons {
    private ArrayList <Person> arrylist;

    public Persons(){
        arrylist = new ArrayList<Person>();
    }

    public ArrayList<Person> getArrayList() {
        return arrylist;
    }

    public void add(Person personCreated) {
        arrylist.add(personCreated);
    }

    public void delete(Person element) {
        arrylist.remove(element);
    }

    public int getSize() {
        return arrylist.size();
    }
    
    public Persons search(ArrayList<Person> arrylist, String letter) {
        Persons personsWhoMatch = new Persons();
        for (Person p: arrylist){
            if (p.getName().compareTo(letter) == 0) {
                personsWhoMatch.add(p);
            }
        } 
        return personsWhoMatch;
    }

public static void main(String[] args){
    Person p1 = new Person("Jaime", "Amherst", "000-000-0000");
    Person p2 = new Person("Maria", "Providence", "111-111-1111");
    Persons pp = new Persons();
    ArrayList<Person> arraylist1 = pp.getArrayList();
    arraylist1.add(p1);
    arraylist1.add(p2);
    for (int i = 0; i < pp.getSize(); i += 1) { 
        System.out.println(arraylist1.get(i).getName());		
        }  
    }
}