package alistirmalar;

public class Wrap01 {
    public static void main(String[] args) {

        // wrapper class: Character - Boolean- Byte-Short - Integer - Long - Float- Double

        Integer m = 12;
        m.byteValue();

        Byte r = 9;

        short max = Short.MAX_VALUE;
        System.out.println(max);
        short min = Short.MIN_VALUE;
        System.out.println(min);

        int imin = Integer.MIN_VALUE;
        byte maxx = Byte.MAX_VALUE;
        System.out.println("toplam : " + imin + maxx);
        int num = 33;

        Integer wrapperNum = num;  // primitivi  wrapperi intgere cevirmek
        System.out.println(wrapperNum);

        char initial = 'T';
        Character initialwrapper =initial;
        String shirt ="230";
        String shoes ="100";
        System.out.println("shoes" + "shirt");// toplama yapmaz int cevirmek zorundayiz
       int toplamFiyat= Integer.valueOf(shirt) + Integer.valueOf(shoes);
        System.out.println(toplamFiyat);

        int ch ='A';
        System.out.println(ch);//bize 65 degeri verir


    }


}
