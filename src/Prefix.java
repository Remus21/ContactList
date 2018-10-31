public enum Prefix {

    RO("Romania", "+40"),
    BG("Anglia", "+44"),
    BE("Belgia", "+32"),
    BR("Brazilia", "+55"),
    CN("China", "+86"),
    JP("Japonia", "+81"),
    AT("Austria", "+43");


    private String country;
    private String countryCode;

    Prefix(String country, String codeCountry) {
        this.country = country;
        this.countryCode = codeCountry;
    }

    public String getCountry() {
        return country;
    }

    public String getCodeCountry() {
        return countryCode;
    }
}
