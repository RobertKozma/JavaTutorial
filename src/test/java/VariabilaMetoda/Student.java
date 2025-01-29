package VariabilaMetoda;

import org.checkerframework.checker.units.qual.N;
import org.testng.annotations.Test;

import java.text.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Student {

    //clasa = sablon care defineste proprietatile si comportamentul unei entitati specifice
    //intr-un fisier java putem avea mai multe clase diferentiate pe baza numelui (nu este un practice bun sa avem mai multe clase cu acelasi nume)
    //intr-o clasa putem defini proprietatile si actiunile entitatii
    //variabila = proprietatea unei clase
    //variabilele pot sa fie de 2 feluri: globale si locale
    //variabilele globale sunt vizibile peste tot in proiect
    //variabilele locale sunt vizibile doar in locul unde le-am localizat
    //ca sa definim o variabila globala: access control (public), tip variabila, nume variabila
    //cand definim o variabila nu este obligatoriu sa ii definim o valoare

    //metoda = actiunea unei clase
    //exista 2 tipuri de metode: void si return

    public String Nume;
    public String Prenume;
    public Integer Varsta;
    public String Adresa;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean AreDiploma;

    @Test
//    public void prezentareStudent(){
//
//        Nume = "Jon";
//        Prenume = "Doe";
//        Varsta = 32;
//        Adresa = "str. Baker nr.9 London UK";
//        Inaltime = 1.76;
//        Greutate = 75.50F;
//        Sex = 'M';
//        AreDiploma = true;
//
//        //System.out.println(Nume + " " + Prenume + " " + Varsta + " " + Adresa);
//        //System.out.println(Inaltime);
//
//        System.out.println("Nume studentului este: " + Nume);
//        System.out.println("Prenumele studentului este: " + Prenume);
//        System.out.println("Varsta studentului este: " + Varsta);
//        System.out.println("Adresa studentului este: " + Adresa);
//        System.out.println("Inaltimea studentului este: " + Inaltime);
//        System.out.println("Greutatea studentului este: " + Greutate);
//        System.out.println("Sexul studentului este: " + Sex);
//        System.out.println("Are studentul diploma?: " + AreDiploma);
//
//        calculMedie();
//        System.out.println(getSalariu());
//
//    }
//
//
//    public void calculMedie(){
//        Integer Nota1 = 10;
//        Integer Nota2 = 7;
//        Integer Nota3 = 9;
//        Integer Medie = (Nota1 + Nota2 + Nota3)/3;
//        System.out.println("Media studentului este: " + Medie);
//
//    }
//
//    //metoda cu return
//
//    public Integer getSalariu(){
//
//        Integer salariu = 1000;
//        return salariu;
//    }

    public void parseDate() throws ParseException {

        String date = "18 Jun 2015";
        String date2 = "18 June,2015";

        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy", Locale.ENGLISH);
        SimpleDateFormat formatter2 = new SimpleDateFormat("dd MMMM,yyyy", Locale.ENGLISH);


        Date insertDate = formatter.parse(date);
        Date insertDate2 = formatter2.parse(date2);
        System.out.println("Inserted date is: " + insertDate);
        System.out.println("Inserted date2 is: " + insertDate2);

    }

}
