import java.util.Scanner;

public class UserDialogs {
    public static String getUsername() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine().trim();
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Try again.");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }

    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose your color (R-red, B-blue, G-green, Y-yellow, W-white):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "R":
                    return "red";
                case "B":
                    return "blue";
                case "G":
                    return "green";
                case "Y":
                    return "yellow";
                case "W":
                    return "white";
                default:
                    System.out.println("This color is not available.");
            }
        }
    }
}