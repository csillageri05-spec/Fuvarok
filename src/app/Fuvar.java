package app;

public class Fuvar {

    private String rendszam;
    private int ido;
    private int osszeg;
    private String fizetesiMod;

    public Fuvar(String rendszam, int ido, int osszeg, String fizetesiMod) {
        this.rendszam = rendszam;
        this.ido = ido;
        this.osszeg = osszeg;
        this.fizetesiMod = fizetesiMod;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getIdo() {
        return ido;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public String getFizetesiMod() {
        return fizetesiMod;
    }
}