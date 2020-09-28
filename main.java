public class main {
    public static void main(String[] args) {

      //5.1
        LinkedList<Integer> integers = new LinkedList<Integer>();
        LinkedList<String> strings = new LinkedList<String>();

        integers.insertAt(0, 1);
        integers.insertAt(1, 3);
        integers.insertAt(1, 2);
        integers.insertAt(0, 0);

        System.out.println("First element: " + integers.elementAt(0));
        System.out.println("First element: " + integers.elementAt(4));

        //5.2
        integers.insertAt (0 ,"Hi there.");
    }
}
