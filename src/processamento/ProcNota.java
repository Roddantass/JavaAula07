package processamento; 
import java.time.LocalDate;

public class ProcNota {
    private String nomeClienteFatura;
    private LocalDate dataDaBaixa;

    public ProcNota (String nomeCliente) {
        nomeClienteFatura = nomeCliente;
    }

    public void baixarNota() {
        dataDaBaixa = LocalDate.now();
    }

    public String getDatadaBaixa() {
        if (dataDaBaixa == null) {
            return "Data não definida";
        }
        return dataDaBaixa + "";
    }

    public String getNomeClienteFatura() {
        return nomeClienteFatura;
    }

    public void setNomeClienteFatura(String nomeClienteFatura) {
        this.nomeClienteFatura = nomeClienteFatura;
    }
    
}
