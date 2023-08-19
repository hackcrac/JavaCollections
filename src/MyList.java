import java.util.Iterator;

public class MyList<T> implements Iterable<T> {
    private T[] arr;
    private int size;

    MyList(int listSize){
        arr = (T[]) new Object[listSize];
        size = 0;
    }

    public void addItem(T num){
        arr[size++]=num;
    }

    public T getItemAtIndex(int index){
        return arr[index];
    }

    private class MyIterator implements Iterator<T> {
        private MyList<T> list ;
        private int index ;

        public MyIterator(MyList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.arr[index++];
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator(this);
    }
}
