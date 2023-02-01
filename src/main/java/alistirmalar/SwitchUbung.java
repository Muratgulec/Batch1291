package alistirmalar;

public class SwitchUbung {

    public static void main(String[] args) {

        String day = "cuma";
        switch (day) {

            case "sali":
                System.out.println(1);
                break;
            case " carsamba":
                System.out.println(2);
                break;
            case "persembe":
                System.out.println(3);
                break;
            case "cuma":
                System.out.println(4);
            case "cumartesi":
                System.out.println(5);
                break;
            case " pazar":
                System.out.println(6);
            break;
            default:
                System.out.println("lutfen gecerli bir gun giriniz");


        }


    }
}
