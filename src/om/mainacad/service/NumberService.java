package om.mainacad.service;

public class NumberService {
    public static String getMultiplicationDescription(int number1, int number2) {
        String out = "";

        int result = number1*number2;
        int maxLength = String.valueOf(result).length();

        out += getSpaces(maxLength-String.valueOf(number1).length()) + number1 + "\n";
        out += getSpaces(maxLength-String.valueOf(number2).length()) + number2 + "\n";



        // future check
        if (number2 > 9){
            out += getSpaces(maxLength - String.valueOf(Math.max(number1, number2)).length())
                    + getUnderlines(String.valueOf(Math.max(number1, number2)).length()) + "\n";
        out += getRows(number1, number2, maxLength);
        }

        out += getUnderlines(maxLength) + "\n";
        out += result;

        return out;
    }

    private static String getRows(int number1, int number2, int maxLength) {
        String out = "";
        int counter = 0;
        while (number2>0){
            int multiplier = number2 % 10;
            int rowResult = multiplier*number1;
            out += getSpaces(maxLength - String.valueOf(rowResult).length() - counter) + rowResult + "\n";
            number2 = number2/10;
            counter++;
        }
        return out;
    }

    private static String getSpaces(int amount) {
        String out = "";
        for (int i = 0; i < amount; i++) {
            out += " ";
        }
        return out;
    }
    private static String getUnderlines(int amount) {
        String out = "";
        for (int i = 0; i < amount; i++) {
            out += "_";
        }
        return out;
    }
}
