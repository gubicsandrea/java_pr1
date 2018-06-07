package currency;

public interface Currency {
    String getShortName();
    String getSign();
    double toBase(double value);
    double fromBase(double value);
    double toOtherCurrency(double value, Currency currency);
}
