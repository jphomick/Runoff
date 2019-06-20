import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("What's the size of your roof, in ft x ft?");

        String roof = read.nextLine().toLowerCase();
        int locX = roof.indexOf(" x ");
        if (locX <= 0) {
            System.out.println("Incorrect format!");
            return;
        }

        int ft1, ft2;

        try {
            ft1 = Integer.parseInt(roof.substring(0, locX));
            ft2 = Integer.parseInt(roof.substring(locX + 3));
        } catch (Exception e) {
            System.out.println("Incorrect format!");
            return;
        }

        System.out.println("How much rainfall was there last night, in ft?");

        int rainfall = read.nextInt() * 12;

        // Roof area is in inches
        int roofArea = ft1 * ft2 * 12;

        System.out.println("There was " + ((roofArea * rainfall) / 231.0) + " gallons of runoff last night.");
    }
}
