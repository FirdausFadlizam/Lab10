public class SelectionSort {
    private int temp;
    /** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    /* A simple SelectionSort algorithm
    * pre-condition: The method takes an array as its parameter.
    * post-condition:The method will return sorted array. 
    * inputs: An integer array in unsorted order.  
    * outputs: The array will be sorted in ascending order. 
    * special conditions:
    */
    public int[] basicSelectionSort(int[] x) {
    for (int i = 0; i < x.length; ++i) {
    for (int j= i+1; j < x.length; ++j) {
    if (x[i] > x[j]) {
    temp = x[i];
    x[i] = x[j];
    temp = x[j];
    }
    } // end of inner for loop
    } // end of outer for loop
    return x;
    } // end of basicSelectionSort method
    }
    