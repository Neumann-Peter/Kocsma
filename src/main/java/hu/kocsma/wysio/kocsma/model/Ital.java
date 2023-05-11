package hu.kocsma.wysio.kocsma.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Ital {

    private String nev;
    private int alkoholtartalom;
    private int adagMennyiseg;

    public Ital(String nev, int alkoholtartalom, int adagMennyiseg) {
        this.nev = nev;
        this.alkoholtartalom = alkoholtartalom;
        this.adagMennyiseg = adagMennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAlkoholtartalom() {
        return alkoholtartalom;
    }

    public void setAlkoholtartalom(int alkoholtartalom) {
        this.alkoholtartalom = alkoholtartalom;
    }

    public int getAdagMennyiseg() {
        return adagMennyiseg;
    }

    public void setAdagMennyiseg(int adagMennyiseg) {
        this.adagMennyiseg = adagMennyiseg;
    }
}
