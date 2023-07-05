package clase_8;

public class Main {
    public static void main(String[] args) {
        System.out.println(saludar());
        calcularAreaRectangulo(10, 402);
        calcularAreaTriangulo(24,12);
        System.out.println(generatePassword());
        String contrasena = generatePassword();
        System.out.println(contrasena);
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

    private static String generatePassword(){
        String password = "Nw82nf";
        double firstAleatorio = Math.random() * 1000;
        long firstNumAleatorio = Math.round(firstAleatorio);
        double secondAleatorio = Math.random() * 1000;
        long secondNumAleatorio = Math.round(secondAleatorio);
        String nuevoPassword = firstNumAleatorio + password + secondNumAleatorio;
        return nuevoPassword;
    }
}
