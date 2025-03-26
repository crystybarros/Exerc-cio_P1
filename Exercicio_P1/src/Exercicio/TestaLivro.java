package Exercicio;

public class TestaLivro {
    public static void main(String[] args) {
        LivroDigital v1 = new LivroDigital();
        v1.setTitulo("Dom Casmurro");
        v1.setAutor("Machado de Assis");
        v1.setAnoPublicacao(1899);
        v1.setTamanhoArquivo(2.5);

        LivroDigital v2 = new LivroDigital();
        v2.setTitulo("Romeu e Julieta");
        v2.setAutor("William Shakespeare");
        v2.setAnoPublicacao(1597);
        v2.setTamanhoArquivo(3.0);

        System.out.println("Livros na biblioteca:");
        System.out.println("------------------------------------");
        System.out.println(v1.mostrarDados());
        v1.mostrarTamanho();
        System.out.println("Preço: R$" + v1.calcularPreco());

        System.out.println("------------------------------------");
        System.out.println(v2.mostrarDados());
        v2.mostrarTamanho();
        System.out.println("Preço: R$" + v2.calcularPreco());
    }
}
