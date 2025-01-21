package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Multimi {

    //multimi: array, list, map

    @Test
    public void metodaTest(){
        //colegiCurs();
        //colegiCursLista();
       // categoriiObiecte();
        tariOrase();


    }

    //exemplu array
    public void colegiCurs (){

        String[] colegi=new String[6];
        colegi[0]="Jon";
        colegi[1]="Jane";
        colegi[2]="Joe";
        colegi[3]="Jack";
        colegi[4]="John";
        colegi[5]="Joan";

        for (int index=0;index<colegi.length;index++){
            System.out.println("Numele colegului este "+colegi[index]);
        }
    }

    //exemplu lista
    public void colegiCursLista (){

        List<String> colegi=new ArrayList<>();
        colegi.add("Jon");
        colegi.add("Jane");
        colegi.add("Jack");
        colegi.add("John");
        colegi.add("Joe");

        int index=0;
        while (index<colegi.size()){
            System.out.println("Numele colegului este "+colegi.get(index));
            index++;
        }
    }

    //exemplu map
    //map -> cheie=valoare
    public void categoriiObiecte(){
        HashMap<String,String> obiecte=new HashMap<>();
        obiecte.put("obiect","laptop");
        obiecte.put("fruct","mar");
        obiecte.put("floare","trandafir");
        for (String key: obiecte.keySet()){
            System.out.println("Cheia este: "+ key);
            System.out.println("Valoare este: "+ obiecte.get(key));
        }

    }

    public void tariOrase(){

        HashMap<String,List<String>> clasificare=new HashMap<>();

        List<String> oraseRomania=new ArrayList<>();
        oraseRomania.add("Cluj-Napoca");
        oraseRomania.add("Bucuresti");
        oraseRomania.add("Timisoara");
        oraseRomania.add("Arad");

        List<String> oraseItalia=new ArrayList<>();
        oraseItalia.add("Roma");
        oraseItalia.add("Milano");
        oraseItalia.add("Palermo");

        List<String> oraseSpania=new ArrayList<>();
        oraseSpania.add("Barcelona");
        oraseSpania.add("Valencia");
        oraseSpania.add("Malaga");

        clasificare.put("Romania",oraseRomania);
        clasificare.put("Italia",oraseItalia);
        clasificare.put("Spania",oraseSpania);

        for (String key: clasificare.keySet()){
            System.out.println("tara este: "+ key);
            System.out.println("orasele sunt: "+ clasificare.get(key));
        }
    }
}
