public class Main {
    public static void main(String[] args) {

    Company company = new Company("Ford", null );
    company.shiftMoney(1000);
    company.shiftMoney(5000);

    company.payTaxes();
    }
}