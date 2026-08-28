public class Livro {
    String Titulo, autor;
    Double preco;
    int quantidade;
    public Livro (String Titulo, String autor, Double preco, int quantidade){
        this.Titulo = Titulo;
        this.autor = autor; 
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public void exibirDados(){
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }
    public double calcularValorEstoque(){
        return preco*quantidade;
    }
}
