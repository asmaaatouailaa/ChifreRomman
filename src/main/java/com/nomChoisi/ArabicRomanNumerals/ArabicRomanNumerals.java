package com.nomChoisi.ArabicRomanNumerals;

import java.util.ArrayList;
import java.util.List;

public class ArabicRomanNumerals {
    public static List<String> convert(int nbr) {
        List<String> obj = new ArrayList<>();

        while (nbr >= 10) {
            if (nbr >= 40 && nbr < 50) {
                obj.add("X");
                obj.add("L");
                nbr -= 40;
            } else {
                obj.add("X");
                nbr -= 10;
            }
        }
        if (nbr == 1) {
            obj.add("I");
        }

        if (nbr == 2) {
            obj.add("I");
            obj.add("I");
        }
        if (nbr == 3) {
            obj.add("I");
            obj.add("I");
            obj.add("I");
        }
        if (nbr == 4) {
            obj.add("I");
            obj.add("V");
        }
        if (nbr >= 5 && nbr <= 8) {

            obj.add("V");
            for (int i = 1; i <= nbr-5; i++) {
                obj.add("I");

            }}
            if (nbr== 9) {
                obj.add("I");
                obj.add("X");
            }


        return obj;
    }
}