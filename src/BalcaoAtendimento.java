import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BalcaoAtendimento implements Relatorio {
    private int id;
    private Atendente atendente;
    private String nomeDaLoja;
    private int qtdAtendimentos;
    private LocalDateTime dataDoAtendimento;
    public BalcaoAtendimento(int id, Atendente atendente, String nomeDaLoja) {
        this.id = id;
        this.atendente = atendente;
        this.nomeDaLoja = nomeDaLoja;
        this.qtdAtendimentos = 0;
    }

    public void iniciarAtendimento() {
        this.dataDoAtendimento = LocalDateTime.now();
        this.qtdAtendimentos++;
    }

    @Override
    public String geraRelatorio() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraFormatada = (dataDoAtendimento != null) ? dataDoAtendimento.format(formatter) : "N/A";

        return "Atendente: " + atendente.getNomeUsuario() +
                ", Loja: " + nomeDaLoja +
                ", Quantidade de Atendimentos: " + qtdAtendimentos +
                ", Último Atendimento: " + dataHoraFormatada;
    }

    public int getId() {
        return id;
    }

    public Atendente getAtendente() {
        return atendente;
    }

    public String getNomeDaLoja() {
        return nomeDaLoja;
    }

    public int getQtdAtendimentos() {
        return qtdAtendimentos;
    }

    public LocalDateTime getDataDoAtendimento() {
        return dataDoAtendimento;
    }
}