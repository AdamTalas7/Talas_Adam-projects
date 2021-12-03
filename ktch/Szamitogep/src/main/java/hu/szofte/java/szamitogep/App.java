
package hu.szofte.java.szamitogep;

public class App {
    
    public static void main(String[] args) {
        Szamitogep computer1 = new Szamitogep();
        Szamitogep computer2 = new Szamitogep(2048, false);
        
        computer1.kapcsol();
        System.out.println(computer1);
        System.out.println("Első másolás eredménye(800MB)= " + computer1.programMasol(800));
        System.out.println("Második másolás eredménye(400MB)= " + computer1.programMasol(400));
        System.out.println(computer1);
        
        System.out.println("A másik számítógépre való másolás eredménye= " + computer2.programMasol(1));
        System.out.println(computer2);
    }
}
