package ThirdQn;

public enum Country {
    CHINA("China", "CN", "+86", Currency.RMB),
    SINGAPORE("Singapore", "SG", "+65", Currency.SGD);

    private String name;
    private String isoCode;
    private String countryCode;
    private Currency currency;

    Country(String name, String isoCode, String countryCode, Currency currency) {
        this.name = name;
        this.isoCode = isoCode;
        this.countryCode = countryCode;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode ;
    }

    public String getCountryCode() {
        return countryCode ;
    }

    public Currency getCurrency() {
        return currency ;
    }

    @Override
    public String toString() {
        return "Country, name: " +name + ", isoCode: " + isoCode + ", countryCode: " +countryCode+
                ", &nbsp" + currency + " ";
    }
}
