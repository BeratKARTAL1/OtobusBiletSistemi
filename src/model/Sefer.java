package model;
import java.time.LocalDateTime;
import exception.GecersizDegerException;
public class Sefer {
    private final int seferNo;
    private String firma;
    private String kalkisSehri;
    private String varisSehri;
    private LocalDateTime zaman;
    private double fiyat;
    private Otobus otobus;//Aynı pakette olduğu için import gerekmez

    public Sefer(int seferNo, String firma, String kalkisSehri, String varisSehri,
                 LocalDateTime zaman, double fiyat, Otobus otobus) {
        this.seferNo = seferNo;
        this.firma = firma;
        this.kalkisSehri = kalkisSehri;
        this.varisSehri = varisSehri;
        this.zaman = zaman;
        this.fiyat = fiyat;
        this.otobus = otobus;
    }
    public int getSeferNo() {return seferNo;}
    public String getFirma() {return firma;}
    public String getKalkisSehri() {return kalkisSehri;}
    public String getVarisSehri() {return varisSehri;}
    public LocalDateTime getZaman() {return zaman;}
    public double getFiyat() {return fiyat;}
    public Otobus getOtobus() {return otobus;}


    public void setFirma(String firma) {
        if(firma==null || firma.isBlank())
            throw new GecersizDegerException("Firma adı boş olamaz");
        this.firma=firma;
    }
    /** Fiyatı atar; sıfır ya da negatifse GecersizDegerException fırlatır. */
    public void setFiyat(double fiyat) {
        if (fiyat <= 0) {
            throw new GecersizDegerException("Fiyat sıfırdan büyük olmalı");
        }
        this.fiyat = fiyat;
    }


}
