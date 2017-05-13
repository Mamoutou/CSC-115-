package bagList;

public interface BagInterface {
    public BagADT union (BagADT bag);
    public boolean contains (Object element);
    public boolean equals (BagADT bag);
    public boolean isEmpty();
    public int size();
    public Object remove(Object element);
    public void add (Object newElement);
    public Object removeRandom();

    public void addAll(BagADT bag);

}
