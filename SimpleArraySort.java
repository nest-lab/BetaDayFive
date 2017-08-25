/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestlab;

import java.util.Scanner;

/**
 *
 * @author DEJI
 */
public class SimpleArraySort {
    /*This program develops an algorithm to sort the values of array elements in an Integer array
    in either ascending or descending order.
    */
    
    static boolean bool = true;
    static int t = 0;
    public static void main(String[] args){
        int arr[] = new int[]{10, 20, 5, 6, 30, 1, 2}; //replace elements with numbers to be sorted
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sort action for your array \n1. Sort in Ascending order"
                + "\n2. Sort in Descending order");
        String action = input.nextLine();
        if("1".equals(action)){
            System.out.println("");
            sortAscend(arr);
        }
        else if("2".equals(action)){
            System.out.println("");
            sortDescend(arr);
        }
        else{
            System.out.println("Invalid operation");
        }
        }
    public static void sortAscend(int[] arr){
        //start of sort in ascending order
        while (bool) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int c = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = c;
                    t++;
                }
            }
            if (t == 0) {
                bool = false;
            }
            t = 0;
        }
        //end of sort in ascending order
        for (int y : arr) {
            System.out.println(y);
        }
    }
    public static void sortDescend(int[] arr){
        //start of sort in descending order
        while (bool) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int c = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = c;
                    t++;
                }
            }
            if (t == 0) {
                bool = false;
            }
            t = 0;
        }
        //end of sort in descending order
        for (int y : arr) {
            System.out.println(y);
        }
    }
}
    
