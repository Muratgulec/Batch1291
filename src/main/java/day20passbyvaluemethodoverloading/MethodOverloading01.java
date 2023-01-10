


package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /*
      1)Method Overloading yaparken method ismi degistirilmez
      2)Method Overloading yaparken parametreler degistirilir.
          i)Parametre degistirirken,parametrelerin data type'lari degistireilebilir.
          ii)Parametre degistirirken,parametrelerin data type'lari farklı ise yerleri degistirilebilir.
          iii)Parametre degistirirken,parametrelerin sayisi degistirilebilir.
          3 java icin "ismi" ve "parametreleri" ayni olan iki method tamamiyla aynidir.
          4 Bu yuzden  ismi vve parametre  METHOD SIGNATURE olarak adlandirilir..
     */

    public static void main(String[] args) {

        add(3,5);
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b);
    }
}