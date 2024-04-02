package program;

import clase.Factory;
import clase.Medic;
import clase.PersonalSpital;
import clase.TipAngajat;

public class Main {
    public static void main(String[] args) {
        Factory factoryPersonal = new Factory();
        PersonalSpital medic = factoryPersonal.creareTip(TipAngajat.MEDIC, "marian", 3000, 0);
        PersonalSpital a1 = factoryPersonal.creareTip(TipAngajat.ASISTENT, "marian", 3000, 3);

        medic.afisare();
    }
}
