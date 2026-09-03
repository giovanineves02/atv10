public class Main {

    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE CURSOS ===");

        Curso curso1 = new Curso(
            "Desenvolvimento Java",
            "Carlos Silva",
            40,
            800.00
        );

        Curso curso2 = new Curso(
            "Desenvolvimento Web",
            "Ana Souza",
            60,
            1200.00
        );

        Curso curso3 = new Curso(
            "Banco de Dados",
            "Marcos Oliveira",
            30,
            600.00
        );

        curso1.exibirInformacoes();
        System.out.println();

        curso2.exibirInformacoes();
        System.out.println();

        curso3.exibirInformacoes();
    }
}