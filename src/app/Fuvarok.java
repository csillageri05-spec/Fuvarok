package app;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
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
        int osszeg = 0;
        for (int i = 0; i < fuvarok.size(); i++) {
            osszeg += fuvarok.get(i).getOsszeg();
        }
        System.out.println("osszeg: " + osszeg);
    }

}
