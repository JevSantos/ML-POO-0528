public class Main {
    public static void main(String[] args) {

        Atendente atendente1 = new Atendente(1, "Corolina");
        Atendente atendente2 = new Atendente(2, "Ribamar");

        System.out.println("--- Atendentes Criados ---");
        System.out.println("Atendente 1: " + atendente1.getNomeUsuario() + " (Matrícula: " + atendente1.getNumeroMatricula() + ")");
        System.out.println("Atendente 2: " + atendente2.getNomeUsuario() + " (Matrícula: " + atendente2.getNumeroMatricula() + ")");
        System.out.println("\n");

        BalcaoAtendimento balcao1 = new BalcaoAtendimento(101, atendente1, "Center Pop");
        balcao1.iniciarAtendimento();
        balcao1.iniciarAtendimento();
        System.out.println("--- Balcão de Atendimento Criado ---");
        System.out.println("Balcão 1: Atendente: " + balcao1.getAtendente().getNomeUsuario() + ", Loja: " + balcao1.getNomeDaLoja());
        System.out.println("\n");

        Chamados chamado1 = new Chamados("Luana Barros", atendente1, "MacBook Pro", EstadoDoChamado.EM_ATENDIMENTO);
        Chamados chamado2 = new Chamados("Dandara Santos", atendente2, "Subwooffer JBL", EstadoDoChamado.ABERTO);
        Chamados chamado3 = new Chamados("Raul Gomes", atendente1, "Monitor Samsung 32", EstadoDoChamado.FECHADO);

        System.out.println("--- Chamados Criados ---");
        System.out.println("Chamado 1: Cliente: " + chamado1.getNomeDoCliente() + ", Atendente: " + chamado1.getAtendente().getNomeUsuario() + ", Produto: " + chamado1.getNomeDoProduto() + ", Estado: " + chamado1.getEstado());
        System.out.println("Chamado 2: Cliente: " + chamado2.getNomeDoCliente() + ", Atendente: " + chamado2.getAtendente().getNomeUsuario() + ", Produto: " + chamado2.getNomeDoProduto() + ", Estado: " + chamado2.getEstado());
        System.out.println("Chamado 3: Cliente: " + chamado3.getNomeDoCliente() + ", Atendente: " + chamado3.getAtendente().getNomeUsuario() + ", Produto: " + chamado3.getNomeDoProduto() + ", Estado: " + chamado3.getEstado());
        System.out.println("\n");

        // 4. Geração de Relatórios
        System.out.println("--- Relatórios ---");

        // Relatórios de Chamados
        System.out.println("--- Relatórios de Chamados ---");
        System.out.println("Relatório Chamado 1: " + chamado1.geraRelatorio());
        System.out.println("Relatório Chamado 2: " + chamado2.geraRelatorio());
        System.out.println("Relatório Chamado 3: " + chamado3.geraRelatorio());
        System.out.println("\n");

        // Relatório de Balcão de Atendimento
        System.out.println("--- Relatório de Balcão de Atendimento ---");
        System.out.println("Relatório Balcão 1: " + balcao1.geraRelatorio());
    }
}

