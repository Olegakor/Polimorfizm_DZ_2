import taxes.TaxSystem;
import taxes.USN_dohodi_minus_rashodi;
import taxes.usnDohodi;

public class Main {
    public static void main(String[] args) {
        usnDohodi usndohodi = new usnDohodi();
        USN_dohodi_minus_rashodi usnDohodiMinusRashodi = new USN_dohodi_minus_rashodi();
        Company company = new Company("Ford", usnDohodiMinusRashodi );

        company.shiftMoney(1000);

        company.payTaxes();
    }
}