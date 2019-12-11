import java.util.ArrayList;
import java.util.ListIterator;

public class Test2 {

    public static void main(String[] args) {


        ArrayList<String> myList= new ArrayList<String>();
        myList.add("Pranav");
        myList.add("Chinamy");
        myList.add("Ankur");
       // myList.add(10);



        ArrayList<String> myEmployeeList = new ArrayList<String>();
        myEmployeeList.add("Asmika");
        myEmployeeList.add("Giri");
        myEmployeeList.addAll(myList);

        System.out.println(myEmployeeList);
        



 /*      myEmployeeList.removeAll(myList);
        System.out.println(myEmployeeList);*/

        ListIterator<String> lstr= myList.listIterator();

        while(lstr.hasNext()){
            System.out.println(lstr.next());

        }
    }
}
