public enum EstadoDoChamado {
    ABERTO(1),
    FECHADO(2),
    EM_ATENDIMENTO(3);

    private final int codAtend;

    EstadoDoChamado(int codAtend) {
        this.codAtend = codAtend;
    }
}

