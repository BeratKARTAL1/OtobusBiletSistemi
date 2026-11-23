package model;

import exception.GecersizKoltukNoException;
import exception.GecersizDegerException;
/**
  * Bir otobüsün basic alanlarını tutan bir sınıf (final , static vs kullanımları)
 */
//JavaDoc
public class Otobus {

    private String model;
    private int modelYili;
    public static final int KOLTUK_SAYISI = 30;
    private final String plaka;
    private final Koltuk[] koltuklar = new Koltuk[KOLTUK_SAYISI];
    public Otobus (String plaka,String model, int modelYili) {
        this.plaka=plaka;
        setModel(model);
        setModelYili(modelYili);
        for(int i=0;i<koltuklar.length;i++) {
            koltuklar[i]=new Koltuk(i+1);
        }
    }
    public Koltuk koltukBul(int no) {
        if (no < 1 || no > KOLTUK_SAYISI) {
            throw new GecersizKoltukNoException("Koltuk no 1-" + KOLTUK_SAYISI + " arası olmalı");
        }
        return koltuklar[no - 1];
    }
    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new GecersizDegerException("Model boş olamaz");
        }
        this.model = model;
    }
    public void setModelYili(int modelYili) {
        if (modelYili < 1990 || modelYili > 2026) {
            throw new GecersizDegerException("Model yılı 1990 ile 2026 arası olmalı");
        }
        this.modelYili = modelYili;
    }
    public String getPlaka() {return plaka;}//get kullanımı
    public String getModel() {return model;}
    public int getModelYili() {return modelYili;}

    public int bosKoltukSayisi () {
        int sayac = 0;
        for(Koltuk k : koltuklar) {
            if(!k.isDolu())
                sayac++;
        }
        return sayac;
    }
    public void musaitKoltuklariYazdir() {
        for (Koltuk k : koltuklar) {
            if (!k.isDolu()) {
                System.out.print(k.getNo() + " ");
            }
        }
        System.out.println();
    }
    @Override
    public String toString() {
        return "Otobus bilgileri: " + plaka + " | " + model + " | " + modelYili +"\n"+ " boş koltuk sayisi: " + bosKoltukSayisi();
    }

}

