package Experiment.experiment;

import java.util.Arrays;
import java.util.Collection;

public class My_ArrayList<E> implements My_List<E> {

    private Object[] obj;
    private int capasity;
    private int size;

    public My_ArrayList(int capasity) {
        this.capasity = capasity;
        obj = new Object[capasity];
    }

    public My_ArrayList() {
        capasity = 10;
        obj = new Object[capasity];
    }

    public My_ArrayList(Collection<E> eArray) {
        add((E) eArray);
    }

    private void capasity() {
        if (capasity - size <= 0) { //  [1 2 3 4 5 5 5 5 5] 10
            capasity = (capasity * 3 / 2) + 1;
        }
    }

    public int getCapasity() {
        return capasity;
    }

    @Override
    public int size() {
        int count = 0;
        for (Object o : obj) {
            if (o == null) {
                continue;
            }
            count++;
        }
        size = count;
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E o) {
        for (Object object : obj) {
            if (o == object || o.equals(object)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public E[] toArray() {
        size();
        if (obj[0] instanceof Integer) {
            Integer[] a = new Integer[size];
            for (int i = 0; i < size; i++) {
                a[i] = (Integer) obj[i];
            }
            E[] a1 = (E[]) a;
            return a1;
        } else if (obj[0] instanceof String) {
            String[] a = new String[size];
            for (int i = 0; i < size; i++) {
                a[i] = (String) obj[i];
            }
            E[] a1 = (E[]) a;
            return a1;
        } else if (obj[0] instanceof Boolean) {
            Boolean[] a = new Boolean[size];
            for (int i = 0; i < size; i++) {
                a[i] = (Boolean) obj[i];
            }
            E[] a1 = (E[]) a;
            return a1;
        } else if (obj[0] instanceof Double) {
            Double[] a = new Double[size];
            for (int i = 0; i < size; i++) {
                a[i] = (Double) obj[i];
            }
            E[] a1 = (E[]) a;
            return a1;
        } else if (obj[0] instanceof Float) {
            Float[] a = new Float[size];
            for (int i = 0; i < size; i++) {
                a[i] = (Float) obj[i];
            }
            E[] a1 = (E[]) a;
            return a1;
        } else if (obj[0] instanceof Character) {
            Character[] a = new Character[size];
            for (int i = 0; i < size; i++) {
                a[i] = (Character) obj[i];
            }
            E[] a1 = (E[]) a;
            return a1;
        } else return null;
    }

    @Override
    public Object[] toArrays() {
        Object[] objects = new Object[size()];
        for (int i = 0; i < size(); i++) {
            obj[i] = objects[i];
        }
        return objects;
    }

    @Override
    public boolean add(E c) {
        if (c != null) {
            capasity();
            Object[] objects = new Object[capasity];
            int i = 0;
            for (int j = 0; j < size(); j++) {
                objects[i] = obj[j];
                i++;
            }
            objects[i] = c;
            obj = objects;
            size();

            return true;
        }
        return false;
    }

    @Override
    public boolean remove(E c) {
        if (c != null) {
            if (contains(c)) {
                capasity();
                Object[] objects = new Object[size() - 1];
                int i = 0;
                for (int j = 0; j < size; j++) {
                    if (c == obj[j] || c.equals(obj[j])) {
                        continue;
                    }
                    objects[i] = obj[j];
                    i++;
                }
                obj = objects;
                size();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(My_ArrayList c) {
        try {
            for (int i = 0; i < c.size(); i++) {
                add((E) c.obj[i]);
            }
            return true;
        } catch (ClassCastException s) {
            return false;
        }
    }

    @Override
    public E get(int index) {
        if (index >= size()) {
            return null;
        }
        if (contains((E) obj[index])) {
            E e = (E) obj[index];
            return e;
        }
        return null;
    }

    @Override
    public E set(int index, E e) {
        if (index >= size) {
            return null;
        }
        obj[index] = e;
        return e;
    }

    @Override
    public void add(int index, E e) {
        capasity();
        Object[] objects = new Object[capasity];
        int i = 0;
        for (int j = 0; j < size(); j++) {
            if (j == index) {
                objects[i++] = e;
            }
            objects[i] = obj[j];
            i++;
        }
        obj = objects;
        size();
    }

    @Override
    public E remove(int index) {
        if (index >= size) {
            return null;
        }
        size();
        E typ = null;
        Object[] objects = new Object[capasity - 1];
        int i = 0;
        for (int j = 0; j < size; j++) {
            if (j == index) {
                typ = (E) obj[j];
                continue;
            }
            objects[i] = obj[j];
            i++;
        }
        obj = objects;
        size();
        return typ;
    }

    @Override
    public int indexOf(E o) {
        size();
        for (int i = 0; i < size; i++) {
            if (o == obj[i] || obj.equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean removeAll(My_ArrayList<E> c) {
        boolean b = false;
        for (Object e : c.obj) {
            if (remove((E) e)) {
                b = true;
            }
        }
        return b;
    }

    @Override
    public String toString() {
        Object[] o = new Object[size()];
        for (int i = 0; i < size(); i++) {
            o[i] = obj[i];
        }
        return Arrays.toString(o);
    }

    public void sort() {
        Object[] o = new Object[size()];
        for (int i = 0; i < size; i++) {
            o[i] = obj[i];
        }
        Arrays.sort(o);
        obj = o;
    }

}
