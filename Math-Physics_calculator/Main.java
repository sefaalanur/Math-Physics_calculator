import java.util.Scanner;
public class Main {
    // Simple Math and Physics Problems
    // Circle Area - Mathematics
    // Perimeter of Triangle - Mathematics
    // Dot Product of 3D Vectors - Physics
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mathematics and Physics Program");

        String transactions = "Operations...\n"
                + "1. Circle Area Calculation\n"
                + "2. Triangle Circumference Calculator\n"
                + "3. Calculating the Dot Product of 2 Vectors\n"
                + "Exit :  q";
        System.out.println(transactions);
        while (true) {

            System.out.print("Select operation : ");
            String option = scanner.nextLine();
            if(option.equals("q"))  {
                System.out.println("Exiting...");
                break;
            }
            switch (option) {

                case "1":

                    System.out.print("Radius of Circle : ");
                    int radius = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Maths.circleArea(radius);
                    break;

                case "2":
                    System.out.print("Side  1: ");
                    int side1 = scanner.nextInt();
                    System.out.print("Side 2 : ");
                    int side2 = scanner.nextInt();
                    System.out.print("Side 3 : ");
                    int side3 = scanner.nextInt();
                    scanner.nextLine();

                    Problem.Maths.perimeterOfTriangle(side1, side2, side3);

                    break;
                case "3":
                    Vec vec1 = new Vec("Vector1");
                    Vec vec2 = new Vec("Vector2");

                    Problem.Physics.Vector(vec1, vec2);
                    break;

                default:
                    System.out.println("Invalid input...");

            }
        }
    }
}

