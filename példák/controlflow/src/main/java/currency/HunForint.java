package currency;

public class HunForint implements Currency {
    private final String shortName = "HUF";
    private final String sign = "Ft";
    private final double baseValue = 1;

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
