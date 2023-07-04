package clase_8;

public class Main {
    public static void main(String[] args) {
        System.out.println(saludar());
        calcularAreaRectangulo(10, 402);
        calcularAreaTriangulo(24,12);
    }

    private static String saludar(){
        return "Hello World";
    }

    private static void calcularAreaRectangulo(double ancho, double largo){
        double resultado = ancho * largo;
        System.out.println("El area del rectangulo es de: " + resultado);
    }

    private static void calcularAreaTriangulo(double base, double height){
        double result = (base * height)/2;
        System.out.println("El area del triangulo es de: " + result);
    }
}
