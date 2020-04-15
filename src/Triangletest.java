public class Triangletest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 15, 20);
        Main main = new Main();
        System.out.println("Czy trójkąt jest prostokątny?");
        System.out.println(main.isRightTriangle(triangle));
    }

}
