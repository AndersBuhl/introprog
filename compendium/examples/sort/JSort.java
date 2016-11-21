import java.util.ArrayList;

public class JSort {
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> xs) {
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int elem : xs) {
            // linjärsök rätt position i sorted: 
            int pos = 0;  
            while (pos < sorted.size() && sorted.get(pos) < elem) {
                pos++;
            }
            // sätt in element på rätt plats i sorted:
            sorted.add(pos, elem);
        }
        return sorted;
    }
    
    public static ArrayList<Integer> selectionSort(ArrayList<Integer> xs) {
        ArrayList<Integer> unsorted = new ArrayList<Integer>(xs); //ref copy
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        while (unsorted.size() > 0) {
            int indexOfMin = 0;
            // index för minsta element i unsorted:
            for (int i = 1; i < unsorted.size(); i++) { 
                if (unsorted.get(i) < unsorted.get(indexOfMin)) {
                    indexOfMin = i;
                }
            }
            int elem = unsorted.remove(indexOfMin);  // ta bort ur unsorted
            sorted.add(elem);  // lägg sist i sekvensen med sorterade
        }
        return sorted;
    }
}

