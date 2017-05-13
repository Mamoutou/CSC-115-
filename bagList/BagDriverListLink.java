package bagList;
import java.util.*;

public class BagDriverListLink {

    public static void main(String[] args) {
    /** Creates a new instance of BagADTDriver */


        Random rand = new Random();
        BagADT one = new BagADT();
        BagADT two = new BagADT();

        for (int i = 9; i >= 0 ; i--) {
            one.add(new Integer(i));
        }

        for (int i = 0; i < 10; i++) {
            two.add(new Integer(i));
        }

        System.out.println("Bag One's size = " + one.size());
        System.out.println("Bag Two's size = " + two.size());

        System.out.print("\nBag One's elements: ");
        one.printList();
        System.out.println();
        System.out.print("\nBag Two's elements: ");
        two.printList();

        System.out.println("\nremove a random element from one = " + one.removeRandom());
        System.out.print("\nBag One's elements: ");
        one.printList();
        System.out.println("remove a random element from one = " +  one.removeRandom());
        System.out.print("\nBag One's elements: ");
        one.printList();
/*
        System.out.println("\nBag One's new elements\n" + one);

        one.addAll(two);
        System.out.println("\nBag One's NEW elements\n" + one);

        System.out.println("\none == two: " + one.equals(two));
        System.out.println("two == three: " + two.equals(three));

        System.out.println("\nUnion\n" + one.union(two));
*/
    }

}
