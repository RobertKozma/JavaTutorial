package VariabilaMetoda;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //Structurile alternative = if-then-else; switch-case;

    @Test
    public void metodaTest() {
//        metodaVerificareNumar(4);
//        metodaVerificareNumar(8);
//        metodaVerificareNumar(5);

//        metodaVerificareNrParPozitiv(4);
        metodaVerificareNrParPozitiv(0);
        metodaVerificareNrParPozitiv(1);
        metodaVerificareNrParPozitiv(4);
        metodaVerificareNrParPozitiv(9);
        metodaVerificareNrParPozitiv(-1);
        metodaVerificareNrParPozitiv(-2);
        metodaVerificareNrParPozitiv(-3);

    }

    //Verificam un nr mai mare decat 5

    public void metodaVerificareNumar(int Valoare) {

        if (Valoare > 5) {
            System.out.println("numarul " + Valoare + " este mai mare decat 5");
        } else if (Valoare < 5) {
            System.out.println("numarul " + Valoare + " este mai mic decat 5");
        } else {
            System.out.println("numarul " + Valoare + " este egal cu 5");
        }
    }

    //verificam daca un numar e par pozitiv sau negativ
    public void metodaVerificareNrParPozitiv(int Valoare) {

        if (Valoare > 0) {

            if (Valoare % 2 == 0) {
                System.out.println("Numarul " + Valoare + " este par pozitiv");
            } else {
                System.out.println("Numarul " + Valoare + " impar pozitiv");
            }
        } else if (Valoare < 0) {
            if (Valoare % 2 == 0) {
                System.out.println("numarul " + Valoare + " este par negativ");
            } else {
                System.out.println("numarul " + Valoare + " este impar negativ");
            }
        } else if (Valoare == 0) {
            System.out.println("numarul " + Valoare + " este 0");
        }
    }
}