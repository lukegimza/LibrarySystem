import java.io.*;
import java.util.*;

public class SortedArrayList <E extends Comparable<? super E>> extends ArrayList<E>{

    //**************************************************FIELDS-[NONE]*************************************************//

    //**************************************************ARRAYLISTS-[NONE]*********************************************//

    //**************************************************CONSTRUCTORS-[NONE]*******************************************//

    //**************************************************MAIN-[NONE]***************************************************//

    //**************************************************METHODS*******************************************************//

    // Insertion Method
    public void insert (E toAdd){
        this.add(toAdd);
        for (int i = 1; i < this.size(); i++){
            E valueU = this.get(i);
            int j;
            for (j = i; j > 0; j--){
                if (this.get(j - 1).compareTo(valueU)<0){
                    break;
                } else {
                    this.set(j, this.get(j-1));
                }
            }
        this.set(j, valueU);
        }
    }

}