// Marcelo Megale
// Sobrecarga de Métodos
// Exercício 1

public class Impressora {

    //um float
    public void Exibir(float f1) {
        System.out.println(f1);
    }

    //dois floats
    public void Exibir(float f1, float f2) {
        System.out.println(f1 + ", " + f2);
    }

    //um float e uma string
    public void Exibir(float f1, String s1) {
        System.out.println(f1 + ", " + s1);
    }

    //uma string e um float
    public void Exibir(String s1, float f1) {
        System.out.println(s1 + ", " + f1);
    }

    //três strings
    public void Exibir(String s1, String s2, String s3) {
        System.out.println(s1 + ", " + s2 + ", " + s3);
    }

    //dois ints e uma String
    public void Exibir(int i1, int i2, String s1) {
        System.out.println(i1 + ", " + i2 + ", " + s1);
    }
}