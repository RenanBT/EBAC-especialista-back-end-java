package br.com.betereli.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "TB_ACESSORIO")
public class Acessorio {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="acessorio_seq")
    @SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "CODIGO", length = 20, nullable = false)
    private String codigo;

    @Column(name = "NOME", length = 50, nullable = false)
    private String nome;
    @Column(name = "ESPORTIVO", length = 10, nullable = false)
    private Boolean esportivo;
    @Column(name = "PRECO", length = 20, nullable = false)
    private double preco;

    @ManyToMany(cascade = { CascadeType.ALL})
        @JoinTable(
                name = "TB_ACESSORIO_CARRO",
                joinColumns = {@JoinColumn(name ="id_acessorio_fk" )},
                inverseJoinColumns = {@JoinColumn(name = "id_carro_fk")}
        )
    private List<Carro> carros;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getEsportivo() {
        return esportivo;
    }

    public void setEsportivo(Boolean esportivo) {
        this.esportivo = esportivo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }




    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

   // public Acessorio(){
   //     this.carros = new ArrayList<Carro>();
   // }
}
