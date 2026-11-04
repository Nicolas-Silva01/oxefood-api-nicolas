package br.edu.ifpe.oxefood.api.produto;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Long id;

    private String codigo;


    @NotNull(message = "O Título é de preenchimento obrigatório")
   @NotEmpty(message = "O Título é de preenchimento obrigatório")
   @Length(max = 1000, message = "O Título deverá ter no máximo {max} caracteres")

    private String titulo;


    @Length(max = 100000, message = "A Descrição deverá ter no máximo {max} caracteres")
    private String descricao;

    private double valorUnitario;

    private Integer tempoEntregaMinimo;

    private Integer tempoEntregaMaximo;

}
