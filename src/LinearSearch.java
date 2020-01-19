
/* Linear sear approach compares the key element key sequentially with each element in the array.
   It's complexity is O(n) since it has to compare at most n items in the list to the key
   Linear search is ineffective for large arrays.
   If a match is made it returns the index of the element in the list.
   If no match is made it returns -1;
 */
public class LinearSearch {
    /** The method for finding a key in the list */
    public static int linearSearch(int[] list, int key){
        for(int i = 0; i < list.length; i++){
            if(key == list[i]){
                return i;
            }
        }
        return -1;
    }
}
