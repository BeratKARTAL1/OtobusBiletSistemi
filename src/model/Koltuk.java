package model;

public class Koltuk {
    private final int no;
    private boolean dolu;
     Koltuk(int no){this.no=no;} //PAKET İÇİ KALMALI
    public int getNo() {return no;}
    public void setDolu(boolean dolu) { this.dolu = dolu; }
    public boolean isDolu() { return dolu; }

}
