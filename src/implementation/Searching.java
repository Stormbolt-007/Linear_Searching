package implementation;

public class Searching {
    private int[] arr;

    public Searching(int[] arr) {
        this.arr = arr;
    }

    public int search(int[] arr, int searchElement){
        // this function will return the index of searchElement, if not present
        // then return -1.......
        if(arr == null){
            return -1;
        }
        int len = arr.length;
        int i=0;
        while(i<len){
            if(arr[i] == searchElement){
                return i;
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public int findNthIndex(int[] arr ,int givenElement, int n){
        // this function will return the index of n'th occurrence of givenElement present for n'th time,
        // otherwise -1.....
        int occurrence = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i] == givenElement){
                occurrence++;
            }
            if(occurrence == n){
                return i;
            }
        }

        return -1;
    }

    public int findLastOccurrence(int[] arr , int element){
        // the method will return the index of last occurrence of givenElement if element present..
        // otherwise return -1.........
        int occurrence = 0;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] == element){
                return i;
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}
