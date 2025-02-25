package banque;

public class TestOperation {
    public static void main(String[] args) {

        Operation[] operations = new Operation[4];
        operations[0] = new Credit("2024-02-25", 500.00);
        operations[1] = new Debit("2024-02-26", 200.00);
        operations[2] = new Credit("2024-02-27", 300.00);
        operations[3] = new Debit("2024-02-28", 100.00);

        double montantGlobal = 0.0;

        for (Operation op : operations) {
            System.out.println(op.afficherType() + " - " + op.toString());
            if (op instanceof Credit) {
                montantGlobal += op.getMontant();
            } else if (op instanceof Debit) {
                montantGlobal -= op.getMontant();
            }
        }

        System.out.println("\nMontant global des opérations : " + montantGlobal + " €");
    }
}
