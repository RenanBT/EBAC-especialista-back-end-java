package br.com.betereli.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "TB_PRODUTO")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Produto {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="produto_seq")
    @SequenceGenerator(name="produto_seq", sequenceName="sq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "DESCRICAO", nullable = false, length = 100)
    private String descricao;

    @Column(name = "PRECO", nullable = false)
    private double preco;

    @Column(name = "ESTOQUE", nullable = false)
    private Integer estoque;


}
