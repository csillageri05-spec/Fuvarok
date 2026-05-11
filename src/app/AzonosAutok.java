package app;

import java.util.HashSet;
import java.util.Set;

public class AzonosAutok {

    public static void main(String[] args) {
        Auto a1 = new Auto();
        Auto a2 = new Auto("ABC-456", "Pál", 2, 0.75, false);
        Auto a3 = new Auto();

        Set<Auto> autok = new HashSet<>();
        autok.add(a1);
        autok.add(a2);
        autok.add(a3);

        int db = 0;
        for (Auto auto : autok) {
            System.out.println(auto);
        }
    }
}
