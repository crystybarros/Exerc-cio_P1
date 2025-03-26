package Exercicio;

public class LivroDigital extends Livro {
    private double tamanhoArquivo;

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double calcularPreco() {
        return tamanhoArquivo * 5.25; 
    }
    
    
    @Override
    public String mostrarDados() {
        return super.mostrarDados() + ", Tamanho do Arquivo: " + tamanhoArquivo + "MB";
    }

    public void mostrarTamanho() {
        System.out.println("Tamanho do Arquivo: " + tamanhoArquivo + "MB");
    }
}