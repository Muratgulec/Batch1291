package day18lists;


import java.util.ArrayList;
import java.util.List;

public class Lists03 {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(13);
        nums.add(7);
        nums.add(12);
        nums.add(11);

//1. Yol :
        //12, 13, 7, 12, 11
        for (Integer w : nums){

            if (w == 7) {
                continue;
            }
            nums.set(nums.indexOf(w),w+3);
        }
        System.out.println(nums);  //[15, 16, 7, 15, 14]

        //2.Yol:
        for (int i = 0; i <nums.size() ; i++) {

            int element = nums.get(i);

            if (element==7){
                continue;
            }
            nums.set(i,element+3);
        }
        System.out.println(nums);//[18, 19, 7, 18, 17]




}}
