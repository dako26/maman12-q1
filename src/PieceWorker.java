public class PieceWorker extends Employee {
    private int NumberItemPrepared;
    private double SalaryFerItem;

    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, DateOfBirth dateOfBirth, int NumberItemPrepared, double SalaryFerItem) {
        super(firstName, lastName, socialSecurityNumber, dateOfBirth);
        try {
            if (NumberItemPrepared < 0) {
                throw new IllegalArgumentException("Number item prepared cannot be less than 0.");
            }
            if (SalaryFerItem <= 0) {
                throw new IllegalArgumentException("Salary fer item cannot be less or equal to 0.");
            }
        } catch (Exception e) {
            // Catch any other unexpected exceptions and provide a more generic error message
            throw new IllegalArgumentException("Invalid number item prepared or salary fer item.", e);
        }
        this.NumberItemPrepared = NumberItemPrepared;
        this.SalaryFerItem = SalaryFerItem;
    }

    public double getSalaryFerItem() {
        return SalaryFerItem;
    }

    public int getNumberItemPrepared() {
        return NumberItemPrepared;
    }

    @Override
    public double earnings() {
        return NumberItemPrepared * SalaryFerItem;
    }

    @Override
    public String toString() {
        return String.format("Piece employee: %s%n%s: $%.2f; %s%s", super.toString(), "salary fer item: ", getSalaryFerItem(), "number item prepared: ", getNumberItemPrepared());
    }
}
