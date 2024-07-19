import taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {

        TaxSystem taxSystem = new TaxSystem();
        Company company = new Company("Ford", taxSystem );

        company.shiftMoney(1000);
        company.shiftMoney(5000);

    company.payTaxes();
    }
}