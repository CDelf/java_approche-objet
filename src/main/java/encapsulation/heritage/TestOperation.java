package encapsulation.heritage;

public class TestOperation {

    public static void main(String[] args) {
        // Opérations
        Credit c1 = new Credit("01/03/2025", 1450);
        Credit c2 = new Credit("17/03/2025", 150.5);
        Debit d1 = new Debit("10/03/2025", 25.5);
        Debit d2 = new Debit("20/03/2025", 599.9);
        Operation[] operations = {c1, d1, c2, d2};

        // Afficher les opérations
        for(Operation op : operations) {
            System.out.println(op);
        }
        // Calculer le montant restant après ces opérations
        double result = 0;
        for(Operation op : operations) {
            result += op.calculateAmount();
        }
        System.out.println("-----------------------------------------");
        System.out.println("Il reste : " + result + "€ sur le compte.");
    }
}
