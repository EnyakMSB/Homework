package ro.fasttrackit.curs6;

import java.util.Arrays;
import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int[] sirNumereIntregi = {5, 15, 80};
        System.out.println("Suma elementelor din sir este: " + sumaElemSir(sirNumereIntregi));
        System.out.println("Numarul elementelor impare din sir este : " + countImpare(sirNumereIntregi));
        System.out.println("Elementele mai mari ca valoarea data sunt: " + greatherThanValue(sirNumereIntregi, 55));
        donatii(500);
        numarMaximDonatii(1000, 5);
        phraseSplit("Viata este o tapiserie minunata. Individul nu e decat un detaliu neinsemnat dintr-un desen urias" +
                " si sublim.\n" +"\n" + "Viata este un proces de devenire, o combinatie de stari prin care trebuie sa" +
                " trecem. Oamenii esueaza cand doresc sa aleaga o stare si sa ramana in ea. Asta este un fel de moarte.\n" +
                "\n" + "Nu merge in spatele meu, s-ar putea sa nu conduc. Nu merge in fata mea, s-ar putea sa nu te " +
                "urmez. Mergi langa mine si fii prietenul meu.\n");
    }


    //6) scrieti o functie care primeste un string cu o fraza (mai multe propozitii despartite prin punct). Printati
    // fiecare propozitie pe o linie noua
    public static void phraseSplit(String phrase) {
        System.out.println(" ");
        System.out.println("- Tiparire propozitii pe un rand nou -");
        String[] letters = phrase.split("\\.");
        for (String letter : letters) {
            System.out.println(letter + ".");
        }
    }

    //5) rescrieti functia de la 4 cu urmatoarea modificare: functia va primi si un numar maxim de donatii. Cand acesta
    // se termina, campania se va incheia
    public static void numarMaximDonatii(int targhetDonatii, int numarDonatii) {
        System.out.println(" ");
        Random donatie = new Random();
        int suma = 0;
        int i = 0;
        while (suma <= targhetDonatii && i <= numarDonatii - 1) {
            int donatia = donatie.nextInt(1000);
            suma = suma + donatia;
            i++;
            System.out.println("Donatia " + i + " :" + donatia);
            System.out.println("Suma total donata: " + suma);
        }
    }
    //4) scrieti o functie care primeste un numar intreg reprezentand targetul de donatii. Donatiile se vor face cu
    // ajutorul obiectului Random. Primim donatii pana cand ajungem la suma dorita. Cand ajungem la suma dorita afisam un
    // mesaj de succes.

    public static void donatii(int targhetDonatii) {
        System.out.println(" ");
        Random donatie = new Random();
        int suma = 0;
        while (suma <= targhetDonatii) {
            int donatia = donatie.nextInt(500);
            suma = suma + donatia;
            System.out.println("Donatia :" + donatia);
        }
        System.out.println("Suma total donata: " + suma);
        System.out.println("Succes!!! Targhetul a fost atins/depasit.");
    }
    //3) scrieti o functie care primeste un sir de numere intregi si un alt numar intreg. Returnati toate numerele mai
    // mari decat numarul primit

    public static int[] greatherThanValue(int[] sirNumereIntregi, int valoare) {
        System.out.println(" ");
        // create space for the potential values greater than 'v'
        int[] potentials = new int[sirNumereIntregi.length];
        // an 'insertion point' in to the potentials array.
        int ip = 0;
        for (int sir : sirNumereIntregi) {
            // for each value in the input array....
            if (sir > valoare) {
                // if it is greater than 'v', add it to the potentials
                // and increment the ip insertion point.
                potentials[ip++] = sir;
            }
        }
        // return the valid values from the potentials
        return Arrays.copyOf(potentials, ip);
    }

    //2) scrieti o functie care primeste un sir de numere intregi si returneaza numarul de elemente impare
    public static int countImpare(int[] sirNumereIntregi) {
        System.out.println(" ");
        int numarElementeImpare = 0;
        for (int sirIntregi : sirNumereIntregi) {
            if (sirIntregi % 2 != 0) {
                numarElementeImpare++;
            }
        }
        return numarElementeImpare;
    }

    //1) scrieti o functie care primeste un sir de numere intregi si returneaza suma lor
    public static int sumaElemSir(int[] sirNumereIntregi) {
        int suma = 0;
        for (int sirIntregi : sirNumereIntregi) {
            suma = suma + sirIntregi;
        }
        return suma;
    }
}
