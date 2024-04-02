package FactoryMethod.clase;

import clase.PersonalSpital;

public class Infirmier extends PersonalSpital {
    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }


        public void afisare() {
            System.out.println("Infirmierul "+super.getNume()+" are salariul "+super.getSalariu());
        }

}
