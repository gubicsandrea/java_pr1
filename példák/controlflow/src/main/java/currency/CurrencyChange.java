package currency;

public class CurrencyChange {
    public static void main(String[] args) {
        Currency currency1 = new UsDollar();
        Currency currency2 = new Euro();
        Currency currency3 = new HunForint();
        Currency currency4 = new SwissFrank();

        double valueInForint = currency1.toBase(300);
        System.out.println(valueInForint + "base unit");
        double valueInEuro = currency4.fromBase(valueInForint);
        System.out.println(Math.round(valueInEuro*100)/100.0 + currency4.getSign());

        System.out.println(Math.round(currency1.toOtherCurrency(300, currency4)*100)/100.0 + currency4.getSign());
    }
}
