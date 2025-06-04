import java.util.Random;

public class Atendente {
    private int id;
    private String nomeUsuario;
    private String numeroMatricula;
    public Atendente(int id, String nomeUsuario) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.numeroMatricula = gerarMatricula();
    }
    public String gerarMatricula() {
        Random random = new Random();
        StringBuilder matricula = new StringBuilder("BR");
        for (int i = 0; i < 4; i++) {
            matricula.append(random.nextInt(10));
        }
        return matricula.toString();
    }

    public int getId() {
        return id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }
}