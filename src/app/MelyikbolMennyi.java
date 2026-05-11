package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MelyikbolMennyi {

    public static void main(String[] args) {
        Auto a0 = new Auto();
        Auto a1 = new Auto("ABC-456", "Pál", 2, 0.75, true);
        Auto a2 = new Auto("AGC-466", "János", 2, 0.75, true);
        Auto a3 = new Auto("ADC-476", "Béla", 2, 0.75, false);
        List<Auto> autok = new ArrayList<>();
        autok.add(a0);
        autok.add(a1);
        autok.add(a2);
        autok.add(a3);

        Map<String, Integer> mm = new HashMap<>();
//        mm.put(a0.getRsz(), 1);
//        mm.put(a1.getRsz(), 1);
//        mm.put(a2.getRsz(), 2);
        for (Auto auto : autok) {
            String kulcs = auto.getRsz();
            if (mm.containsKey(kulcs)) {
                int ertek = mm.get(kulcs);
                mm.put(kulcs, ++ertek);
            } else {
                mm.put(kulcs, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : mm.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + value);

        }
    }
}
