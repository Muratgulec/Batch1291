package day32collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deqeue01 {
    public static void main(String[] args) {

        Deque<Integer> dq= new LinkedList<>();
        dq.add(12);
        dq.add(7);
        dq.add(8);
        dq.add(3);
        System.out.println(dq);// insortion method kendi siramiza gore siralar  oop prensipleri 1: inheritins

        dq.getFirst();

    }
}