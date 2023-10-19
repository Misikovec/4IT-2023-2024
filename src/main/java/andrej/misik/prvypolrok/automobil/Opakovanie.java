package andrej.misik.prvypolrok.automobil;

import andrej.misik.prvypolrok.automobil.Automobil;

import java.util.*;

public class Opakovanie {
    public static void main(String[] args) {
        Automobil a1 = new Automobil("Skoda");
        Automobil a2 = new Automobil("VW");
        Automobil a3 = new Automobil("VW");


        List<Automobil> automobilList = Arrays.asList(a1, a2, a3);
        int sucetRychlosti=0;
        for (Automobil automobil : automobilList){
            automobil.nastartovatAuto();
            automobil.pohybAuta(37);
            sucetRychlosti += automobil.getAktualnaRychlost();
        }

        double priemernaRychlost = (double) sucetRychlosti / automobilList.size();
        System.out.println("priemerna rychlost aut v listu je " + priemernaRychlost);


        Set<Automobil> sets = new HashSet<>();
        sets.addAll(Arrays.asList(a1,a2,a3));
        System.out.println(sets.size());

    }
}
