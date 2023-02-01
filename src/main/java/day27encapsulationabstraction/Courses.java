package day27encapsulationabstraction;


/*1)Bazen method body'sini yazmak gerekmez, bu durumlarda body'siz method olusturmak gerekir.
        Body'si olmayan method'lara "abstract method" lar denir.

        2)"abstract method" lar child class'lar tarafindan "override" edilmek zorundadirlar.
        Bu yuzden, eger bir fonksiyonun child class'lar tarafindan kullanilmasini mecbur kilmak isterseniz
        o method'u abstract yapmak gerekir.

        3)Bir method'un body'sini silmek o method'un abstract olmasi icin yeterli degildir.
        "access modifier" ile "return type" arasina "abstract" keyword koymak gerekir.

        4)"abstract method" lar siradan class'larin(concrete) icine yazilamazlar, "abstract method" larin icine yazildiklari class'lar da


abstract olmak zorundadirlar.
*/
public abstract class Courses {

    public abstract void math();






}
