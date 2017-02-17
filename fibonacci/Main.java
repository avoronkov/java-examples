import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by avoronkov on 16.02.17.
 */

class Fibb implements Iterable<Integer> {
    private int amount;
    public Fibb(int n) {
        amount = n;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new FibbIterator(this.amount);
    }
}

class FibbIterator implements Iterator<Integer> {
    private int a;
    private int b;
    private int index;
    private int maxIndex;

    FibbIterator(int maxIndex) {
        this.maxIndex = maxIndex;
        a = 0;
        b = 1;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < maxIndex;
    }

    @Override
    public Integer next() {
        b = b + a;
        a = b - a;
        index++;
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
		/*
        for (int x : fibonacci(10)) {
            System.out.println(x);
        }
		*/
		fibonacci(10).forEach((x) -> System.out.println(x));
    }
    public static Fibb fibonacci(int n) {
        return new Fibb(n);
    }
}
