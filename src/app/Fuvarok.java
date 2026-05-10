package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Fuvarok {

    private static List<Fuvar> fuvarok = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Path path = Path.of("fuvarok.csv");

        List<String> sorok = Files.readAllLines(path);

        System.out.println(sorok.get(0));

        for (String sor : sorok) {
            String s[] = sor.split(",");
            String rendszam = s[0];
            int ido = Integer.parseInt(s[1]);
            int osszeg = Integer.parseInt(s[2]);
            String fizetesiMod = s[3];
            Fuvar fuvar = new Fuvar(rendszam, ido, osszeg, fizetesiMod);
            fuvarok.add(fuvar);

        }
        Feladat1();
        Feladat2();
        Feladat3();
        Feladat4();
        Feladat5();
        Feeladat6();
        Feladat7();
    
    }
    private static String Feladat7() {
        HashSet<String> db = new HashSet<>();

        for (int i = 0; i < fuvarok.size(); i++) {
            db.add(fuvarok.get(i).getFizetesiMod());
        }

        return "Összes fizetési mód: " + db.size();
    }

    private static String Feeladat6() {
        List<String> db = new ArrayList<>();
        for (int i = 0; i < fuvarok.size(); i++) {
            String fizetes = fuvarok.get(i).getFizetesiMod();

            if (!db.contains(fizetes)) {
                db.add(fizetes);
            }
        }
        return "Összes auto: " + db.size();
    }

    private static String Feladat5() {
        int i = 0;
        while (i < fuvarok.size(){
            i++;
        }
        return "Összes fizetési mód meghatározva....: " +

    ... ;
    }

    

    private static String Feladat4() {
        int db = 0;
        for (int i = 0; i < fuvarok.size(); i++) {
            if (fuvarok.get(i).getFizetesiMod().equals("kártya")) {
                db += fuvarok.get(i).getOsszeg();
            }

        }
        return "Összes kártyás fizetes száma: " + db;
    }

    private static String Feladat3() {
        int min = 0;
        for (int i = 1; i < fuvarok.size(); i++) {
            if (fuvarok.get(i).getOsszeg() < fuvarok.get(min).getOsszeg()) {
                min = i;
            }
        }
        return "Legolcsobb fuvar: " + fuvarok.get(min).getOsszeg() * 352;
    }

    private static String Feladat2() {
        int max = 0;
        for (int i = 1; i < fuvarok.size(); i++) {
            if (fuvarok.get(i).getOsszeg() > fuvarok.get(max).getOsszeg()) {
                max = i;
            }
        }
        return "Legdrágább fuvar rendszáma: " + fuvarok.get(max).getRendszam();
    }

    private static void Feladat1() {
        int osszeg = 0;
        for (int i = 0; i < fuvarok.size(); i++) {
            osszeg += fuvarok.get(i).getOsszeg();
        }
        System.out.println("Összes fuvar: " + osszeg);
    }

}
