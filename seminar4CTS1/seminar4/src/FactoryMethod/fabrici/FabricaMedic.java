package FactoryMethod.fabrici;

import FactoryMethod.clase.Asistent;
import FactoryMethod.clase.Medic;
import FactoryMethod.clase.PersonalSpital;

public class FabricaMedic implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
