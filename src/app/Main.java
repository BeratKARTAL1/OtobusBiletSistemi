package app;

import model.Otobus;
import model.Koltuk;

import java.util.SplittableRandom;

public class Main {
    public static void main(String[] args) {
        Otobus otobus = new Otobus("06 KRN 30","hynduai accent",2000);
        otobus.setModel("Merso");
        //otobus.setModelYili(1880); throw fırlatır
        otobus.setModelYili(1992);
        System.out.println(otobus.bosKoltukSayisi());
        otobus.koltukBul(8).setDolu(true);
        System.out.println(otobus.bosKoltukSayisi());
        System.out.println(otobus.koltukBul(7).isDolu()); //çünkü dolmadı (8 gibi)
        otobus.musaitKoltuklariYazdir(); //müsait koltukları yazdrır
        /*
        DENEME
         */
        System.out.println(otobus);//toString ovveride'ı
    }
}
