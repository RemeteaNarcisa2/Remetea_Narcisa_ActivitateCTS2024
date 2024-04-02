package FactoryMethod.main;

import FactoryMethod.clase.PersonalSpital;
import FactoryMethod.fabrici.FabricaAsistent;
import FactoryMethod.fabrici.FabricaMedic;
import FactoryMethod.fabrici.FactoryAngajati;

public class Main {
    public static void main(String[] args) {
        FactoryAngajati factoryAngajati= new FabricaAsistent();
//        PersonalSpital angajat=factoryAngajati.creareAngajat("rares", 1000);
//        angajat.afisare();

        procesareAngajat(factoryAngajati, "marian", 3000);
        procesareAngajat(new FabricaMedic(), "marius", 3000);
        
    }
    public static void procesareAngajat(FactoryAngajati factory, String nume, int salariu){
        PersonalSpital angajat=factory.creareAngajat("rares", 1000);
        angajat.afisare();
    }

}
