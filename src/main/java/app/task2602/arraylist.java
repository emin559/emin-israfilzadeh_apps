package app.task2602;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class arraylist {

    public List<Integer> mergeArray(ArrayList<Integer> l1, ArrayList<Integer> l2 ) {
      ArrayList<Integer> listMerged = new ArrayList<>();
      for (int i = 0; i < l1.size(); i++) {
        listMerged.add(l1.get(i));
      }
      for (int i = 0; i < l2.size(); i++) {
        if(!(listMerged.contains(l2.get(i)))) listMerged.add(l2.get(i));
      }
      return listMerged;
    }

}
