package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args) {
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
        number = convertFromOctal("17");
        System.out.println("Number for octal 17: " + number);

        int something = test("A");
        System.out.println("test: " + something);
    }

    public static int convertFromBinary(String binary) {
        int result = 0;
        int conversion = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(binary.charAt(i));
            if (num == 1) {
                num *= conversion;
                result += num;
            }
            conversion *= 2;
        }
        return result;
    }

    public static int convertFromOctal(String octal) {
        int result = 0;
        int conversion = 1;
        for (int i = octal.length() - 1; i >= 0; i--) {
            int num = Character.getNumericValue(octal.charAt(i));
            if (num != 0) {
                num *= conversion;
                result += num;
            }
            conversion *= 8;
        }
        return result;

    }

    public static int test(String number){
        return Character.getNumericValue(number.charAt(0));
//        return Integer.parseInt(number, 16);
    }

}
