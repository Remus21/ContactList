import java.util.HashSet;
import java.util.Set;

public class PhoneNumber {

    Prefix countryCode;
    Set<Integer> number = new HashSet<>();
    Set<String> operator = new HashSet<>();

    public PhoneNumber(Prefix countryCode, Set<Integer> number, Set<String> operator) {
        this.countryCode = countryCode;
        this.number = number;
        this.operator = operator;
    }

    public Prefix getCountryCode() {
        return countryCode;
    }

    public Set<Integer> getNumber() {
        return number;
    }

    public Set<String> getOperator() {
        return operator;
    }
}
