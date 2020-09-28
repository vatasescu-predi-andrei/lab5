import java.util.NoSuchElementException;

public class LinkedList<T> {
    protected Link<T> head;
    protected Link<T> tail;
    protected long count;

    public LinkedList() {
    }

    /**
     * This method shows if the Linked List is Empty
     * @return
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * This method takes the object from the specified index
     * @param index-specified position to where our element is taken from
     * @return the element at the specified index
     */
    public Object elementAt(int index){
        if (index >= this.count)
            throw new NoSuchElementException();

        if (index == this.count - 1) {
            return this.tail.getElement();
        } else {
            Link<T> elem = this.head;

            for (int i = 0; i < index; i++) {
                elem = elem.getNext();
            }

            return elem.getElement();
        }
    }

    /**
     * This method takes an object and inserts it at the specified index
     * @param index specified position to where our object is going to be inserted
     * @param e the object we want to insert
     */
    public void insertAt(int index, T e){
        if(index>count){
            throw new NoSuchElementException();
    }
        if (index == 0) { // Insert at the beginning
            if (this.count == 0) {
                this.head = new Link<T>(e, null);
                this.tail = head;
            } else {
                this.head = new Link<T>(e, this.head);
            }
        } else if (index == this.count) { // Insert at the end
            this.tail.setNext(new Link<T>(e, null));
            this.tail = this.tail.getNext();
        } else {
            Link<T> elem = this.head;

            // Get the element
            for (int i = 1; i < index; i++) {
                elem = elem.getNext();
            }

            elem.setNext(new Link<T>(e, elem.getNext()));
        }
        this.count++;
    }
}


