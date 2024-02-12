package Experiment.experiment;

public interface My_List<E> {

    int size();

    boolean isEmpty();

    boolean contains(E e);

    E[] toArray();

    Object[] toArrays();

    boolean add(E c);

    boolean remove(E c);

    boolean addAll(My_ArrayList c);

    E get(int index);

    E set(int index, E e);

    void add(int index, E e);

    E remove(int index);

    int indexOf(E o);

    boolean removeAll(My_ArrayList<E> c);

    String toString();


}
