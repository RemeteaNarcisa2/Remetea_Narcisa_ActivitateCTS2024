package FactoryMethod.clase;


public class Asistent extends PersonalSpital {
    public Asistent(String nuume, int salariu) {
        super(nuume, salariu);
    }
    public void afisare() {
        System.out.println("Brancardierul "+super.getNume()+" are salariul "+super.getSalariu());
    }
}
