package com.homework;

public class Main {

    public static void main(String[] args) {

        //Testime Aine classi uue objekti loomine ja konstruktori
        Aine JavaOOP = new Aine("RT - 016", "Objektorienteeritud programmeerimine", 5);
        System.out.println("Java OOP info: " + JavaOOP.toString());

        System.out.println(String.format("We need to study %d hours to finish Java OOP", JavaOOP.hoursToSuccess()));


        //Testime Aine classi getterid/setterid
        JavaOOP.setAineEAP(8);
        JavaOOP.setAineKood("RT - 015");
        JavaOOP.setAineNimetus("Automaattestimine");

        System.out.println();

        System.out.println(String.format("We got modified aine object with 'ainekood': %s, 'ainenimetus': %s and 'aineEAP': %d", JavaOOP.getAineKood(), JavaOOP.getAineNimetus(), JavaOOP.getAineEAP()));
        System.out.println(String.format("We also got new hours amount to achieve certificate: %d", JavaOOP.hoursToSuccess()));

        System.out.println();


        //Testime oppekava classi objekti loomine ja konstrukori
        Aine Algebra = new Aine("RT - 012", "Lineaaralgebra", 4);

        Aine[] RTained = {Algebra, JavaOOP};

        Oppekava robootika = new Oppekava("RT - VIL", RTained);

        System.out.println(robootika.toString());


        //Testime oppekava classi getterid/setterid
        robootika.setOppekavaKood("IT - TLN");

        Aine informaatika = new Aine("IT - 007", "Informaatika", 6);
        Aine andmebaasid = new Aine("IT - 009", "Andmebaasid", 5);

        Aine[] ITained = {informaatika, andmebaasid, Algebra};

        robootika.setAined(ITained);

        System.out.println();

        System.out.print("Modified oppekavaKood: '" + robootika.getOppekavaKood() + "' ja sisustus: ");
        for (Aine aine : robootika.getAined()) {
            System.out.print(aine + ", ");
        }


    }
}
