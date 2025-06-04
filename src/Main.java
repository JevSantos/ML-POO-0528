public class Main {
    public static void main(String[] args) {

        Atendente atendente1 = new Atendente(1, "Corolina");
        Atendente atendente2 = new Atendente(2, "Ribamar");

        System.out.println("--- Atendentes Criados ---");
        System.out.println("Atendente 1: " + atendente1.getNomeUsuario() + " (Matrícula: " + atendente1.getNumeroMatricula() + ")");
        System.out.println("Atendente 2: " + atendente2.getNomeUsuario() + " (Matrícula: " + atendente2.getNumeroMatricula() + ")");
        System.out.println("\n");

        BalcaoAtendimento balcao1 = new BalcaoAtendimento(101, atendente1, "Eletrônicos Center");
        balcao1.iniciarAtendimento();
        balcao1.iniciarAtendimento();
        System.out.println("--- Balcão de Atendimento Criado ---");
        System.out.println("Balcão 1: Atendente: " + balcao1.getAtendente().getNomeUsuario() + ", Loja: " + balcao1.getNomeDaLoja());
        System.out.println("\n");

    }
}