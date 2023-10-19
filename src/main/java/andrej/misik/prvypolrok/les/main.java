package andrej.misik.prvypolrok.les;

import andrej.misik.prvypolrok.automobil.Automobil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {




        strom a1 = new strom("listnaty","dub",14);
        strom a2 = new strom("ihlicnaty","smrek",15);
        strom a3 = new strom("ihlicnaty","borovica",10);
        strom a4 = new strom("listnaty","vrba",12);

        krik b1 = new krik ("malina",14);
        krik b2 = new krik("jahoda",20);

        List<strom> les = new ArrayList<>();
        les.add(a1);
        les.add(a2);
        les.add(a3);
        les.add(a4);
        List<krik> krik = new ArrayList<>();
        krik.add(b1);
        krik.add(b2);

    }


}
