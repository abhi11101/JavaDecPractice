package org.com.abhi.Chapter1_10.Chapter3;

public class DataTypes {
    public static void main(String[] args) {
        byte byte_num = 127;
        System.out.println("Byte: " + byte_num);
        short short_num = 32767;
        System.out.println("Short: " + short_num);
        int int_num = 123456789;
        System.out.println("int: "+ int_num);
        long long_num = (long)int_num*int_num;
        System.out.println("Long: "+ long_num);

        float float_num = 123.45F;
        System.out.println("Float: "+ float_num);
        double double_num = 123.45;
        System.out.println("Double: "+ double_num);


        char char_num = 'A';
        System.out.println("char: " + char_num);
        char_num = 75;
        System.out.println("char: " + char_num);

        boolean bool_num = true;
        System.out.println("Boolean: "+ bool_num);

        typeCasting();

    }

    public static void typeCasting(){

        byte byte_num;
        short short_num;
        int int_num=79673;
        long long_num;
        byte_num = (byte) int_num;
        System.out.println(byte_num);

        short_num = (short) int_num;
        System.out.println(short_num);

        long_num = int_num;
        System.out.println(long_num);

        char char_num = (char)623;
        System.out.println(char_num);


    }
}

