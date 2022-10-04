package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args){
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);
    }

    public static int convertFromBinary(String binary){
        if (binary == null || binary.length() == 0){
            throw new IllegalArgumentException("Invalid input string");
        }

        int conversion = 1;
        int result = 0;

        for (int i = binary.length()-1; i>=0; i-- ){
            if( binary.charAt(i) != '0' && binary.charAt(i) != '1'){
                throw new IllegalArgumentException("Invalid binary number");
            }
            if (binary.charAt(i) == '1'){
                result += conversion;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        int conversion = 1;
        int result = 0;
        for (int i = octal.length()-1; i>=0; i-- ){
            System.out.println("i is " + i);
            int num = Character.getNumericValue(octal.charAt(i));
            result += num*conversion;
            conversion *= 8;
        }
        return result;
    }
}
