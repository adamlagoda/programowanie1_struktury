package com.company.zajecia3;

import java.util.Random;

public class Tablica {
    public int[] zadanie2(int rozmiarTablicy, int dolnaGranica, int gornaGranica) {
        Random rnd = new Random();
        return rnd.ints(dolnaGranica, gornaGranica + 1)
                .limit(rozmiarTablicy)
                .toArray();
    }

    public int[] zadanie3(int[] tab1, int[] tab2) {
        int[] longerTab = tab1.length > tab2.length ? tab1 : tab2;

        int index = tab1.length > tab2.length ? tab2.length : tab1.length;

        if (tab1.length > tab2.length) {
            index = tab2.length;
        } else {
            index = tab1.length;
        }

        for (int i = 0; i < index; i++) {
            longerTab[i] = tab1[i] + tab2[i];
        }
        return longerTab;
    }
}
