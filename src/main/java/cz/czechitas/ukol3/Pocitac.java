package cz.czechitas.ukol3;

import static java.util.Objects.isNull;



public class Pocitac {

    private boolean jeZapnuty;

    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;


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

    @Override
    public String toString() {
        return "Pocitac{" +
                "CPU:" + cpu +
                ", RAM:" + ram +
                ", Pevny Disk:" + pevnyDisk +
                '}';
    }
}





