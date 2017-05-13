package assignment2;
import java.util.*;
public class SetADTDriver {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    	  /** Creates a new instance of SetADTDriver */

            Random rand = new Random();
            SetADT one = new SetADT();
            SetADT two = new SetADT();
         
            SetADT three = two;
           
            for (int i = 0; i < 15; i++) {
                one.add(new Integer(rand.nextInt(10)));
            }
           
            for (int i = 0; i < 10; i++) {
                two.add(new Integer(rand.nextInt(10)));
            }
            
            System.out.println("Set One's size = " + one.size());
            
            System.out.println("Set Two's size = " + two.size());

            System.out.println("\nSet One's elements\n" + one);
            System.out.println("\nSet Two's elements\n" + two);

            System.out.println("\nremove a random element from one = " + one.removeRandom());
            System.out.println("remove a random element from one = " +  one.removeRandom());

            System.out.println("\nSet One's new elements\n" + one);

            one.addAll(two);
            System.out.println("\nSet One's NEW elements\n" + one);

            System.out.println("\none == two: " + one.equals(two));
            System.out.println("two == three: " + two.equals(three));

            
//           TEST YOUR NEW METHODS HERE      
             System.out.println("\nIntersection\n" + one.intersection(two));
             System.out.println ("\nDifference\n"+  one.difference(two) );
             
             Object[] sortedSet = one.sorted();
             System.out.println ("Sorted");
             
             for (int i=0; i < one.size(); ++ i){
          
            	 System.out.print (sortedSet[i] +"   ");
            }
         
    }
}
