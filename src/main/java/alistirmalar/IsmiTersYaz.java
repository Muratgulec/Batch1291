package alistirmalar;

public class IsmiTersYaz {
    public static void main(String[] args) {



        String s = "Germany";

        for ( int i=s.length()-1; i>=0; i--   ) {

            System.out.print(s.charAt(i));
        }




        int k= 23;
        while (k>12){

            if (k%2==0){
                System.out.print(k+" ");
            }
            k--;
        }


    }

}
