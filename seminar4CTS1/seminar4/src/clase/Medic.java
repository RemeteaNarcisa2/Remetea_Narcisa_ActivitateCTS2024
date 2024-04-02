package clase;

public class Medic extends PersonalSpital{
    private int vechime;

    public int getVechime() {
        return vechime;
    }

    public Medic(String nume, int salariu, int vechime) {
        super(nume, salariu);
        this.vechime = vechime;
    }

    public Medic(String nume, int salariu) {
        super(nume, salariu);
    }
    public void afisare() {
        System.out.println("Brancardierul "+super.getNume()+" are salariul "+super.getSalariu());
    }
}
