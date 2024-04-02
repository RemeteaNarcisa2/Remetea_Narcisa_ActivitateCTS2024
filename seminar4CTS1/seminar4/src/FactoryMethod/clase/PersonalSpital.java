package FactoryMethod.clase;

public abstract class PersonalSpital {
    private String nume;
    private int salariu;
    public abstract void afisare();

    public String getNume() {
        return nume;
    }

    public int getSalariu() {
        return salariu;
    }

    public PersonalSpital(String nume, int salariu) {
        this.nume = nume;
        this.salariu = salariu;
    }
}
