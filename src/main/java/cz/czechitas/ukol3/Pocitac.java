package cz.czechitas.ukol3;

import static java.util.Objects.isNull;



public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;
    private Disk vyuziteMisto;


    public void setJeZapnuty(boolean jeZapnuty) {
        this.jeZapnuty = jeZapnuty;
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public boolean jeZapnuty() {
        if (jeZapnuty) {
            System.out.println("Počítač je zapnutý");
            return true;
        }
        else {
            System.out.println("Počítač je vypnutý");
            return false;
        }
    }

    public void zapniSe() {
        if (jeZapnuty == false) {
            if (isNull(ram) || isNull(pevnyDisk) || isNull(cpu)) {
                System.err.println("Počítač nelze zapnout: chybějící HW.");
                return;
            }
            else {
                System.out.println("Počítač se zapíná");
                setJeZapnuty(true);
            }
        }
        else {
                System.err.println("chyba počítač je již zapnutý");
            }
        }

    public void vypniSe(){
        if (jeZapnuty == true) {
            System.out.println("Počítač se vypíná");
            setJeZapnuty(false);
            return;
        }
        else  {
            System.err.println("nemůžeš vypnout vypnutý počítač");
            return;
        }
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if ((this.pevnyDisk.getVyuziteMisto() + velikost) > this.pevnyDisk.getKapacita()){
            System.err.println("Soubor je větší než kapacita disku");
        }
        else {
                this.pevnyDisk.setVyuziteMisto(this.pevnyDisk.getVyuziteMisto() + velikost);
                System.out.println("Soubor je vytvořen");
            }

        }

    }
    public void vymazSouborOVelikosti(long velikost){
        if (jeZapnuty){
            this.pevnyDisk.setVyuziteMisto(this.pevnyDisk.getVyuziteMisto() - velikost);
        if ((this.pevnyDisk.getVyuziteMisto() - velikost) <= 0){
            System.err.println("Tato operace není možná"+ " " + this.pevnyDisk.getVyuziteMisto());
           }
           else {
               this.pevnyDisk.setVyuziteMisto(this.pevnyDisk.getVyuziteMisto() - velikost);
               System.out.println("Soubor je vymazán" + " " + this.pevnyDisk.getVyuziteMisto());
           }
        }

    }

    @Override
    public String toString() {
        return "Pocitac{" +
                "CPU:" + cpu +
                ", RAM:" + ram +
                ", Pevny Disk:" + pevnyDisk +
                '}';
    }
}





