package br.edu.ifpe.oxefood.api.empresa;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpresaDTO {

    private Long id;
    
    private String site;


    @NotBlank(message = "O CNPJ é de preenchimento obrigatório")
   @CNPJ

    private String cnpj;

    private String inscricaoEstadual;


    @NotNull(message = "O Nome Empresarial é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome Empresarial é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome Empresarial deverá ter no máximo {max} caracteres")
   
    private String nomeEmpresarial;


     @NotNull(message = "O Nome Fantasia é de preenchimento obrigatório")
   @NotEmpty(message = "O Nome Fantasia é de preenchimento obrigatório")
   @Length(max = 100, message = "O Nome Fantasia deverá ter no máximo {max} caracteres")

    private String nomeFantasia;


    @Length(min = 8, max = 20, message = "O campo Fone tem que ter entre {min} e {max} caracteres")

    private String fone;


    @Length(min = 8, max = 20, message = "O campo Fone Alternativo tem que ter entre {min} e {max} caracteres")

    private String foneAlternativo;

}
