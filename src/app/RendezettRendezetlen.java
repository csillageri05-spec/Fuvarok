package app;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RendezettRendezetlen {

    public static void main(String[] args) {
        Set<String> nevek = new HashSet<>();
        nevek.add("Anna");
        nevek.add("Panna");
        nevek.add("Manna");
        nevek.add("Dorina");
        nevek.add("Dani");
        nevek.add("Kevin");
        nevek.add("Dávid");
        nevek.add("Pál");

        halmazKiir("rendezetlen: ", nevek);
        elsoEsUtolsoElemHash(nevek);
    }

    private static void halmazKiir(String cim, Set<String> nevek) {
        System.out.println(cim);
        for (String elem : nevek) {
            System.out.println(elem);
        }
    }

    private static void elsoEsUtolsoElemHash(Set<String> nevek) {
        List<String> lista = new ArrayList<>(nevek);
        String elso = lista.getFirst();
        String utolso = lista.getLast();
    }
    
    
}
