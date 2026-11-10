package br.edu.ifpe.oxefood.api.produto;


import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriaProdutoDTO {

    @Length(max = 100000, message = "A Descrição deverá ter no máximo {max} caracteres")
    private String descricao;
}
