import java.util.Map;

public class NumberParser {

    private Map<String, Integer> callingCodes;

    public NumberParser(Map<String, Integer> callingCodes) {
        this.callingCodes = callingCodes; //why use this calling codes if we can parser it from userNumber
    }

    //we do not check the format of phone number
    //we should check if diallednumber has got proper format for current country
    //there also will be a problem if someone puts 0044 as a international prefix
    //I think it would be better to pass calling code instead of userNumber
    public String parse(String dialledNumber, String userNumber) {
        if (dialledNumber.charAt(0) == '0') {
            String prefix = userNumber.substring(0,3);
            String numberWithoutPrefix = dialledNumber.substring(1);

            return prefix + numberWithoutPrefix;
        }
        return dialledNumber;
    }
}
