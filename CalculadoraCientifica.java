// Marcelo Megale
// Sobrecarga de Métodos
// Exercício 3

public class CalculadoraCientifica {
    
    //raiz com um inteiro
    public double raiz(int i1) {
        return Math.sqrt(i1);
    }

    //raiz com um double
    public double raiz(double d1) {
        return Math.sqrt(d1);
    }

    //raiz com um String convertida
    public double raiz(String s1) {
        return Math.sqrt(Double.parseDouble(s1));
    }

    //potência com dois bytes a e b
    public double potencia(byte a, byte b) {
        return Math.pow(a, b);
    }

    //potência com duas strings convertidas s1 e s2
    public double potencia(String s1, String s2) {
        return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
    }

    //potência com inteiro a e double b
    public double potencia(int a, double b) {
        return Math.pow(a, b);
    }
}