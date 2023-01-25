package it.develhope.otheroperators;
public class Start {
    public static void main(String[] args) {

        int a = 15;
        a += 5;
        a -= 4;

        int b = a;
        b++;


        if (b % 2 == 1 && (b * (b + 1)) % 3 == 0) {
            System.out.println("Both statements are true");
        } else {
            System.out.println("One or both statements are false");
        }

    }
}

// use the modulus operator to check if there are remainders
