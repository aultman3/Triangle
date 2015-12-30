import java.util.Scanner;

/**
 * Determines if a triangle with given dimensions is an Isosceles, Equilateral,
 * or Scalene triangle.
 * 
 * @author Erik Aultman
 * 
 */
public final class Triangles {

    /**
     * 
     */
    private Triangles() {
    }

    /**
     * Checks if all characters of a given string input are numbers and returns
     * true otherwise returns false.
     * 
     * @param string
     *            - string to check of all characters are numbers
     * @return - true if string (@string) is a number and false otherwise
     */
    private static boolean isNum(String string) {
        /*
         * Check if all characters in the string are numbers
         */
        for (int count = 0; count < string.length(); count++) {
            //if character is not a number return false    
            if (!Character.isDigit(string.charAt(count))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main method.
     * 
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        //input stream for user defined lengths
        Scanner in = new Scanner(System.in);
        int[] dim = { 0, 0, 0 }; //preallocate variable to hold dimensions
        int count = 0; //loop counter
        while (count < 3) {
            /*
             * get user length input
             */
            System.out.println("Enter a side length.");
            String nxtLn = in.nextLine();
            //if input is a single integer than store otherwise ask for input again
            if (isNum(nxtLn)) {
                dim[count] = Integer.parseInt(nxtLn);
                count++;
            } else {
                System.err
                        .println("Error: length input must be a single integer value.");
            }
        }
        int a = dim[0]; //first side length
        int b = dim[1]; //second side length
        int c = dim[2]; //third side length
        //conditions to be checked
        boolean aEqualsB = a == b;
        boolean aEqualsC = a == c;
        boolean bEqualsC = b == c;
        //check side length equalities
        if (aEqualsB && aEqualsC && bEqualsC) {
            System.out.println("Triangle is an Equilateral Triangle.");
        } else if (aEqualsB || aEqualsC || bEqualsC) {
            System.out.println("Triangle is an Isosceles Triangle.");
        } else {
            System.out.println("Triangle is a Scalene Triangle.");
        }
        in.close();
    }
}
