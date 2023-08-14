package br.com.betereli.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//TODO criar 3 entidades modelar as 3 conforme modulo 1to1 many to 1 many to many;
// criar tabelas: Marca, carro, acessorio; Faça relacionamento.
// Commit github.

@Entity
@Table (name = "TB_CARRO")
public class Carro {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="carro_seq")
    @SequenceGenerator(name="carro_seq", sequenceName="sq_carro", initialValue = 1, allocationSize = 1)
    private Long id;
    @Column(name = "CODIGO", length = 20, nullable = false)
    private String codigo;

    @Column(name = "MODELO", length = 20, nullable = false)
    private String modelo;
    @Column(name = "PLACA", length = 7, nullable = false, unique = true)
    private String placa;
    @Column(name = "CHASSI", length = 50, nullable = false, unique = true)
    private Long chassi;

    @ManyToOne
    @JoinColumn(name = "id_marca_fk",
            foreignKey = @ForeignKey(name = "fk_marca_carro"),
            referencedColumnName = "id",nullable = false
    )
    private Marca marca;


    @ManyToMany(mappedBy = "carros")
    private List<Acessorio> acessorios;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Long getChassi() {
        return chassi;
    }

    public void setChassi(Long chassi) {
        this.chassi = chassi;
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



    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }

    public Carro(){
        this.acessorios = new ArrayList<Acessorio>();
    }

    public void add(Acessorio acessorio){
        this.acessorios.add(acessorio);
    }

}
