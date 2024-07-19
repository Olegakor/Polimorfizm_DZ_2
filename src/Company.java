import taxes.*;
public class Company {
    private String title;
    private int debit = 0;
    private int credit = 0;
    TaxSystem taxSystem;
    int amount = 0;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit+=amount;
        } else if (amount < 0) {
            credit+=Math.abs(amount);
        }
    }
    public void payTaxes() {
        int tax = taxSystem.calcTaxFor(this.debit, this.credit);
        this.debit = 0;
        this.credit = 0;
        return tax;
        System.out.println("Компания " + title + " уплатила налог в размере " + amount + " руб.");
    }
}
