public class Chamados implements Relatorio {
   public String nomeDoCliente;
   private Atendente atendente;
   private String nomeDoProduto;
   private EstadoDoChamado estado;
    public Chamados(String nomeDoCliente, Atendente atendente, String nomeDoProduto, EstadoDoChamado estado) {
        this.nomeDoCliente = nomeDoCliente;
        this.atendente = atendente;
        this.nomeDoProduto = nomeDoProduto;
        this.estado = estado;
    }

    @Override
    public String geraRelatorio() {
        return "Produto: " + nomeDoProduto + ", Estado: " + estado;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public EstadoDoChamado getEstado() {
        return estado;
    }
}
