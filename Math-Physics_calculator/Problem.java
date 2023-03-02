public class Problem {

    public static class Maths{
        public static void circleArea(int radius) {
            System.out.println("Area of circle :" + (Math.PI * radius * radius));
        }
        public static void perimeterOfTriangle(int side1,int side2,int side3) {

            System.out.println("Perimeter of triangle : " + (side1 + side2 + side3));
        }

    }
    public static class Physics {

        public static void Vector(Vec vec1,Vec vec2) {

            int vector = vec1.getI() * vec2.getI() + vec1.getJ() * vec2.getJ() + vec1.getK() * vec2.getK();
            System.out.println(vec1.getName() + " and " + vec2.getName() + " =  " + vector);

        }

    }

}
