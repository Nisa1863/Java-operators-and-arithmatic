//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int x =3;
        int y= x++;
        System.out.println(x);
        System.out.println(y);
        /*
        Önce: y'ye x'in mevcut değeri atanır, yani y = 3.

        Sonra: x'in değeri bir artırılır, yani x = 4 olur

        bir dip not daha aritmatik islemde x++ ile ++x ayni
        gorevi ustlenmekte bir farki yoktur bu islemlerin
        adi da post incerment yani artirma islemi
        azaltma isleminde de ayni sekilde dir x-- ile --x
        ayni gorevi ustlenmekte

         */
        // onemli bir detay nasil yazildigina da baglidir//

        int a=7;
        int b =++a;
        System.out.println(a);
        System.out.println(b);
/*
        a'nin değeri: 8 (çünkü ++a ile önce bir artırıldı).

        b'nin değeri: 8 (çünkü b, artırılmış a değerini aldı).

 */
        int c =6;
        c += 5;
        // c = c+ 5 ile ayni gorevdedir//
        System.out.println(c);

        /* bunlara ekk olarak ust alma islemlerini pow yapiyoruz
        math.pow(3,2) 9 cikar mesela yada kok alma islemlerinde
        math.sqrt(9) 3 cikar
        modunu almak istedigimizde % mod isaretidir x % y
        stringleri birlestirmede de
         string="nisa ";
         string="melis";
         "nisa"+"melis"
        */
        System.out.println(Math.pow(3,2));
        System.out.println((Math.sqrt(16)));
        System.out.println(9%6);

        String nisa="Nisa";
        String nur="Nur";
        System.out.println(nisa +nur);
    }


}