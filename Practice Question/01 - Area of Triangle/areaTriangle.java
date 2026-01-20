import java.util.Scanner; 

public class areaTriangle {
    
    static double findArea(double base, double height) {
        return (base * height) * 0.5; 
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter base and height: ");

            if (sc.hasNextDouble()) {
                double base = sc.nextDouble();
                double height = sc.nextDouble();

                System.out.println("Area: " + findArea(base, height));
            }
        } 
    }
}