package no.kristiania.romans;

public class RomanConverter {
    private int number;
    private StringBuilder result = new StringBuilder();

    public RomanConverter(int number) {
        this.number = number;
    }

    public String convert() {
        convertRomanDigit(1000, "M");
        convertRomanDigit(500, "D");
        convertRomanDigit(100, "C");
        convertRomanDigit(50, "L");
        convertRomanDigit(10, "X");
        convertRomanDigit(9, "IX");
        convertRomanDigit(5, "V");
        convertRomanDigit(4, "IV");
        convertRomanDigit(1, "I");
        return result.toString();
    }

    private void convertRomanDigit(int digitValue, String digitName) {
        while (number >= digitValue) {
            result.append(digitName);
            number -= digitValue;
        }
    }
}
