public class Main {
    public static void main(String[] args) {
        System.out.println("=== LIVRARIA DEVOPS ===");
        Livro livro1 = new Livro("Java para iniciantes", "Ana Silva", 80.00, 5);
        Livro livro2 = new Livro("Devops na prática", "Carlos Souza", 120.00, 3);

        System.out.println("\n Livro 1 ");
        livro1.exibirDados();
        System.out.println("Valor Total em estoque R$: " + livro1.calcularValorEstoque());
        
        System.out.println("\n Livro 2 ");
        livro2.exibirDados();
        System.out.println("Valor Total em estoque R$: " + livro2.calcularValorEstoque());
        System.out.println("\n Aplicação executada com sucesso!!");

        
    }
    
}
