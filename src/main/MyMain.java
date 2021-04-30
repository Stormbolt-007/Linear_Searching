package main;

import implementation.Searching;

public class MyMain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,22,3,5,3,3,3,35,67,5,5,5,33,44,55,66,77,5};
        Searching obj = new Searching(arr);

        // search().......
        int searchElement = 9;
        int result1 = obj.search(arr, searchElement);
        System.out.println("index of searchElement is : " + result1);

        // findNthIndex().........
        int givenElement = 5;
        int n = 4;
        int result2 = obj.findNthIndex(arr, givenElement, n);
        System.out.println("Index of givenElement for nth time is : " + result2);

        // findLastIndex().......
        int element = 5;
        int result3 = obj.findLastOccurrence(arr, element);
        System.out.println("Last index of element is : " + result3);

    }
}
