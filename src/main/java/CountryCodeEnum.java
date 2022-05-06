public enum CountryCodeEnum {//Using this enum, we can convert country name to country code, country code to country name.
    INDIA(91),
    US(1),
    CANADA(2);
private int countryCode;
    CountryCodeEnum(int code) {
this.countryCode=code;
    }

    public int getCountryCode() {
        return countryCode;
    }
}
