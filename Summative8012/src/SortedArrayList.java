import java.io.*;
import java.util.*;

public class SortedArrayList<E> extends ArrayList{

    //**************************************************METHODS*******************************************************//

    // Slide 37, Section 2. NEED TO REMOVE STATIC FROM 2 BELOW
    public static <E extends Comparable<E>> E minU (ArrayList<E> u){
        E uSoFar = u.get(0);
        for (E elem: u)
            if (elem.compareTo(uSoFar) < 0) {
                uSoFar = elem;
            }
        return uSoFar;
    }

    public static <E extends Comparable<E>> E minB (ArrayList<E> b) {
        E bSoFar = b.get(0);
        for (E elem : b){
            if (elem.compareTo(bSoFar) < 0){
                bSoFar = elem;
            }
        }
        return bSoFar;
    }
}