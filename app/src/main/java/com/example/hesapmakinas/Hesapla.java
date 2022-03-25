package com.example.hesapmakinas;

import java.security.PublicKey;

public class Hesapla {
    private int GelenSayi1, GelenSayi2;

    public Hesapla(int gelenSayi1, int gelenSayi2){
        this.GelenSayi1 = gelenSayi1;
        this.GelenSayi2 = gelenSayi2;
    }

    public int toplam(){
        return GelenSayi1 + GelenSayi2;
    }
    public int cıkar(){
        return GelenSayi1 - GelenSayi2;
    }
    public int carp(){
        return GelenSayi1 * GelenSayi2;
    }
    public int bol(){
        return GelenSayi1 / GelenSayi2;
    }
}
