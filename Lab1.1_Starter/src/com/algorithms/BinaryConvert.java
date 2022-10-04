package com.algorithms;

public class BinaryConvert {
    public static void main(String[] args) {
        int number = convertFromBinary("100101");
        System.out.println("Number for binary 100101: " + number);
    }

    public static int convertFromBinary(String binary) {
        // TODO-Lab1.1: return calculated decimal value converted from String binary
        int result = 0;
        int conversion = 1;
        for(int i = binary.length() -1; i >= 0 ; i--){
            int num = Integer.parseInt(String.valueOf(binary.charAt(i)));
            if (num == 1){
                num *=conversion;
                result += num;
            }
            conversion*=2;
        }
        return result;
    }

}
