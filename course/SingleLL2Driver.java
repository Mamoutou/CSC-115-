package course;

public class SingleLL2Driver {
 public static void main (String args[]) {

SingleLL2 sLL2 = new SingleLL2(0);
sLL2.insertBefore(55, 88);
sLL2.append(1);
sLL2.append(2);
sLL2.insertBefore(2, 55);
SimpleLL.printListFor(sLL2.getFront());
 }
}