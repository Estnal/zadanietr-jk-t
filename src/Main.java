public class Main {
    boolean isRightTriangle(Triangle triangle){
        if (Math.pow(triangle.a, 2) + Math.pow(triangle.b, 2) == Math.pow(triangle.c,2)) {
            return true;
        }else{
            return false;

        }
    }

}
