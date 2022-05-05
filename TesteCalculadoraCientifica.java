// Marcelo Megale
// Sobrecarga de Métodos
// Exercício 4

public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        System.out.println(calculadora.raiz(2));
        System.out.println(calculadora.raiz(45.10));
        System.out.println(calculadora.raiz("144"));
        System.out.println(calculadora.potencia(2, 3));
        System.out.println(calculadora.potencia("2", "3"));
        System.out.println(calculadora.potencia(3, 2));
    }
}