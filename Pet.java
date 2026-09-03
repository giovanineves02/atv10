public class Pet {

    String nome;
    String especie;
    int idade;
    double valorServico;

    public Pet(String nome, String especie, int idade, double valorServico) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.valorServico = valorServico;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Valor do serviço: R$ " + valorServico);
    }

    public double calcularValorComDesconto() {
        return valorServico * 0.90;
    }
}