package VariabilaMetoda;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Masina {

    public String marca;
    public String model;
    public Integer anFabricatie;

    @Test
    public void metodaTest(){

//        dateMasina("Audi","Q7",2023);
//        dateMasina("VW","Golf",2020);
//        calculMedie(7.0,5.0);
//        calculMedie(8.0,8.0);
//        citireNote();

    }


    public void dateMasina(String param1,String param2, Integer param3){

        marca=param1;
        model=param2;
        anFabricatie=param3;

        System.out.println("marca masinii este: "+ marca);
        System.out.println("modelul masinii este: "+ model);
        System.out.println("anul fabricatiei este: "+anFabricatie);

    }

    //calculam media la 2 numere

    public void calculMedie(Double nota1, Double nota2){

        Double rezultat = (nota1+nota2)/2;
        System.out.println("media celor 2 note este: "+rezultat);


    }

//    public void citireNote(){
//
//        System.out.println("Introdu o nota intre 1 si 10-4");
//        Scanner scanner=new Scanner(System.in);
//        int nota=scanner.nextInt();
//        while (nota<0||nota>10){
//            System.out.println("Nota "+nota+" trebuiesa fie intre 1 si 10");
//            nota = scanner.nextInt();
//        }
//        System.out.println("Nota "+nota+" este intre 1 si 10");
//
//    }


}
