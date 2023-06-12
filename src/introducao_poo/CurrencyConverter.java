package introducao_poo;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double convertDollarToReal (double dollar, double priceDollar) {
                dollar = dollar + (dollar*IOF);
        return priceDollar * dollar;
    }


}
