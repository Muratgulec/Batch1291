package alistirmalar;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {



    String arr []= new String[5];

    arr [0]="math";
    arr[1]=" music";
    arr [2]=" art";
    arr[3]="sali";
    arr[4]="ses";
        System.out.println(Arrays.toString(arr));

        System.out.println(arr[0].length() + arr[arr.length-1].length());

            int sum =0;
            for(String w : arr){
            sum =sum + w.length();


    }
        System.out.println(sum);

}}
