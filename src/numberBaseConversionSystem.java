public class numberBaseConversionSystem {
    public static int convert(int number, int currentBase, int convertedBase) {
        int baseTenNumber = 0;
        validateCurrentBase(currentBase);
        validateConvertedBase(convertedBase);

        if(currentBase != 10) {
            String value = String.valueOf(number);
            number = 0;
            int count = 0;
            for (int index = value.length() - 1; index >= 0; index--) {
                int digit = Character.getNumericValue(value.charAt(count));
                number += digit * Math.pow(currentBase, index);
                count++;
            }

        }

        String convertedString = "";
        while(number != 0){
            int remainder = number % convertedBase;
            number = number / convertedBase;
            String newNumber = String.valueOf(remainder);
            convertedString += newNumber;

        }
        String reversedConverted = "";
        for(int count = convertedString.length()-1; count >= 0; count--){
            reversedConverted += convertedString.charAt(count);
        }

        return Integer.parseInt(reversedConverted);
    }

    private static void validateCurrentBase(int currentBase){
        if(currentBase < 2 || currentBase > 10)
            throw new IllegalArgumentException("Invalid base");
    }

    private static void validateConvertedBase(int convertedBase){
        if(convertedBase < 2 || convertedBase > 10)
            throw new IllegalArgumentException("Invalid base");
    }

}