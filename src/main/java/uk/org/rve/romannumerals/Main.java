package uk.org.rve.romannumerals;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        final RomanNumeralConverter converter = new RomanNumeralConverter();

        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            String line = scan.nextLine();
            int value = Integer.valueOf(line);
            String roman = converter.convert(value);
            System.out.println(roman);
            System.out.flush();
        }
    }

}
