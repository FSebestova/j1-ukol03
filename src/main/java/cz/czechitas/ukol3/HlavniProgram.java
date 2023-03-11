package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
//        System.out.println("Program spuštěn.");

        Pocitac frantiskyPocitac = new Pocitac();
//        frantiskyPocitac.zapniSe();
//        frantiskyPocitac.zapniSe();
//        frantiskyPocitac.vypniSe();
//        frantiskyPocitac.vypniSe();

        System.out.println(frantiskyPocitac.toString());

        Procesor frantiskyProcesor = new Procesor();
        frantiskyProcesor.setVyrobce("MSI");
        frantiskyProcesor.setRychlost(1_6_000_000_000L);
        System.out.println(frantiskyProcesor.toString());

        Pamet frantiskyPamet = new Pamet();
        frantiskyPamet.setKapacita(16_000_000_000L);
        System.out.println(frantiskyPamet.toString());

        Disk frantiskyDisk = new Disk();
        frantiskyDisk.setKapacita(494_174_990_336L);
        System.out.println(frantiskyDisk.toString());
        frantiskyDisk.setVyuziteMisto(250_000_000_000L);

        frantiskyPocitac.setCpu(frantiskyProcesor);
        frantiskyPocitac.setRam(frantiskyPamet);
        frantiskyPocitac.setPevnyDisk(frantiskyDisk);

        System.out.println(frantiskyPocitac.toString());

        frantiskyPocitac.zapniSe();

        frantiskyPocitac.vytvorSouborOVelikosti(160_000_000L);
        frantiskyPocitac.vytvorSouborOVelikosti(500_000_000_000L);

        frantiskyPocitac.vymazSouborOVelikosti(1L);
        frantiskyPocitac.vymazSouborOVelikosti(350_000_000_000L);




    }

}
