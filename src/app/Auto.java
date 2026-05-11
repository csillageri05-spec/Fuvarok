package app;

public class Auto {

    private String rsz, tulaj;
    private int ferohely;
    private double uzemAnyagMenny;
    private boolean voltTorve;

    public Auto() {
        this("nincsRsz", "voltTulaj", 4, 0, true);
    }

    public Auto(String rsz, String tulaj, int ferohely, double uzemAnyagMenny, boolean voltTorve) {
        this.rsz = rsz;
        this.tulaj = tulaj;
        this.ferohely = ferohely;
        this.uzemAnyagMenny = uzemAnyagMenny;
        this.voltTorve = voltTorve;
    }

    public String getRsz() {
        return rsz;
    }

    public String getTulaj() {
        return tulaj;
    }

    public int getFerohely() {
        return ferohely;
    }

    public double getUzemAnyagMenny() {
        return uzemAnyagMenny;
    }

    public boolean isVoltTorve() {
        return voltTorve;
    }

}
