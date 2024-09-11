package listas.lista01.triangulo;

public class TrianguloTest {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 4, 5, 2);
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Tipo: " + triangulo.obterTipo());
    }
}
