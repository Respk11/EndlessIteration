package work;

import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min;
    protected int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }


            @Override
            public Integer next() {

                int diff = max - min;
                int res = random.nextInt(diff + 1) + min;
                return res;

            }
        };
    }

}
