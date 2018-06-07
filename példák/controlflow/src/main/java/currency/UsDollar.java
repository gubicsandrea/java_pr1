package currency;

public class UsDollar implements Currency {
    private final String shortName = "USD";
    private final String sign = "$";
    private final double baseValue = 280;

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public String getSign() {
        return sign;
    }

    @Override
    public double toBase(double value) {
        return value * baseValue;
    }

    @Override
    public double fromBase(double value) {
        return value / baseValue;
    }

    @Override
    public double toOtherCurrency(double value, Currency currency) {
        return currency.fromBase(toBase(value));
    }
}
