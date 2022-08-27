package Dominio;
import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "concerto", length = 1, discriminatorType = DiscriminatorType.STRING)
public class Concerto {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Oficina oficina;
    private String codigo;
    private long pagamento;
    private String Descricao;
    private LocalDate dataConcerto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Concerto() {
    }

    public Oficina getOficina() {
        return oficina;
    }

    public void setOficina(Oficina oficina) {
        this.oficina = oficina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public long getPagamento() {
        return pagamento;
    }

    public void setPagamento(long pagamento) {
        this.pagamento = pagamento;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDataConcerto() {
        return dataConcerto;
    }

    public void setDataConcerto(LocalDate dataConcerto) {
        this.dataConcerto = dataConcerto;
    }
}
