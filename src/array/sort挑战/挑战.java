package array.sort挑战;

import java.util.Arrays;
import java.util.Scanner;

public class 挑战 {


    public static void main(String[] args) {

        挑战 t = new 挑战();
        printArray(t.sortArray(t.getIntergers()));


    }

    public int[] getIntergers(){
        Scanner a = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int[] ar = new int[a.nextInt()];
        for (int i = 0; i <ar.length ; i++) {
            System.out.println("please enter your "+(i+1)+" element");
            ar[i] = a.nextInt();
        }
        return ar;
    }

    public static void printArray(int[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.println("The "+ i + " element is " + array[i]);
        }

    }

    public int[] sortArray(int[] sarray){
        Arrays.sort(sarray);
        for(int i=0; i<sarray.length/2; i++) {
            int tem = sarray[i];
            sarray[i] = sarray[sarray.length-1-i];
            sarray[sarray.length-1-i] = tem;
        }
        return sarray;
    }

}
