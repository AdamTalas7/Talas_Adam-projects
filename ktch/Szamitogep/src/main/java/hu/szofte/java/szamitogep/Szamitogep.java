
package hu.szofte.java.szamitogep;

public class Szamitogep {
    private double memory; //MB-ban
    private boolean isOn;

    public Szamitogep() {
        memory = 1024;
        isOn = false;
    }

    public Szamitogep(double memory, boolean isOn) {
        this.memory = memory;
        this.isOn = isOn;
    }
    
    public void kapcsol() {
        if (isOn == false) {
            isOn = true;
        } else {
            isOn = false;
        }
    }
    
    public boolean programMasol(double programSize) {
        
        if(programSize < memory && isOn == true) {
            memory -= programSize;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Szamitogep{" + "memória=" + memory + ", Bevan kapcsolva=" + isOn + '}';
        
    }
    
}
