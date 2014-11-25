package evosuite;

import java.util.List;
/**
 * An implementation of the bubble sort.
 * More info : http://en.wikipedia.org/wiki/Bubble_sort
 *
 */
public class Bubble {
		
	public int add (int a, int b) throws IllegalArgumentException, IllegalStateException {
        if (a < 0) {
            throw new IllegalArgumentException();
        }
        if (b < 0) {
            throw new IllegalStateException();
        }
        return a+b;
    }

}
