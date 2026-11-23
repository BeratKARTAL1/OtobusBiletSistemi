package model;
import exception.GecersizDegerException;
/**
 * Bir otobüsteki tek bir koltuğu temsil eder: numarası, doluluk durumu,
 * cam kenarı olup olmadığı ve ek ücreti.
 */
//JavaDoc
public class Koltuk {
    private final int no;
    private boolean dolu;
    private boolean camKenariMi;
    private double ekUcret;
     Koltuk(int no){this.no=no;} //PAKET İÇİ KALMALI gerekçesi olarak : "Koltukları yalnızca Otobus oluşturduğu için yapıcı dışarıya kapatıldı."
    public int getNo() {return no;}
    public boolean isCamKenariMi() {return camKenariMi;}
    public double getEkUcret() {return ekUcret;}
    public void setCamKenariMi(boolean camKenariMi) {this.camKenariMi=camKenariMi;}
    public void setEkUcret(double ekUcret) {
        if (ekUcret < 0) {
            throw new GecersizDegerException("Ek ücret negatif olamaz");
        }
         this.ekUcret=ekUcret;}
    public void setDolu(boolean dolu) { this.dolu = dolu; }
    public boolean isDolu() { return dolu; }
   @Override
    public String toString() {
         return "Koltuk bilgileri: " + no + " , " + (dolu ? "koltuk dolu" : "koltuk boş")
                 + (camKenariMi ? " , cam kenarı" : "cam kenarı değil");
   }
}
