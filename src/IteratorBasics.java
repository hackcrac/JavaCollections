import java.util.Iterator;

public class IteratorBasics {
    public static void main (String[] args){
        MyList<Integer> list = new MyList<Integer>(100);
        list.addItem(1);
        list.addItem(2);
        list.addItem(3);
        list.addItem(4);
        list.addItem(5);
        System.out.println(list.getItemAtIndex(3));

        // accessing the items using iterators
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // for each loop after implementing iterable and iterator class
        for(int num : list){
            System.out.println(num);
        }
    }
}
