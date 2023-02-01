package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Mood1 {
    public static void main(String[] args) {
        ArrayList<Integer> ages = new ArrayList<>();

        ages.add(12);
        ages.add(23);
        ages.add(256);
        ages.add(2,33333);
        ages.add(1,555);
        System.out.println(ages);
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(2);
        newAges.add(3);
        newAges.add(4);
        ages.addAll(newAges);
        System.out.println(ages);


        List<Integer> mum =new ArrayList<>();
        mum.add(12);
        mum.add(4);
        mum.add(132);
        mum.add(120);

        Collections.sort(mum);
        System.out.println(mum);

        int minDiff=mum.get(1)-mum.get(0);
        for (int i = 1; i <mum.size() ; i++) {

            minDiff = Math.min(minDiff, mum.get(i))- mum.get(i-1);

        }
        System.out.println(minDiff);

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> newList= new ArrayList<>();

        for (Integer w : list
             ) {
            if(!newList.contains(w))
            newList.add(w);

        }

        System.out.println(newList);

    }

}

