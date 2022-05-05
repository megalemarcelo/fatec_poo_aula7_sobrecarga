// Marcelo Megale
// Sobrecarga de Métodos
// Exercício 2

public class TesteImpressora {
    public static void main(String[] args) {
        Impressora impressora = new Impressora();
        impressora.Exibir(25.5f);
        impressora.Exibir(25.5f, 33.42f);
        impressora.Exibir(42.21f, "Marcelo");
        impressora.Exibir("Marcelo", 42.88f);
        impressora.Exibir("Fatec", "Ipiranga", "Marcelo");
        impressora.Exibir(1, 2, "Java");
    }
}