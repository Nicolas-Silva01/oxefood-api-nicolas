package br.edu.ifpe.oxefood.api.produto;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/produto")
public class CategoriaProdutoController {

    @PutMapping
    public ResponseEntity<CategoriaProduto> atualizar(@RequestBody @Valid CategoriaProdutoDTO dto) {

	    CategoriaProduto categoriaProdutoAtualizada = categoriaProdutoService.atualizar(dto);
	    return ResponseEntity.ok(categoriaProdutoAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable @Valid Long id) {

        categoriaProdutoService.remover(id);
        return ResponseEntity.noContent().build();
    }


    @GetMapping
    public ResponseEntity<List<CategoriaProduto>> listar() {

        return ResponseEntity.ok(categoriaProdutoService.listar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaProduto> buscarPorId(@PathVariable @Valid Long id) {

        return ResponseEntity.ok(categoriaProdutoService.buscarPorId(id));
    }


    private final CategoriaProdutoService categoriaProdutoService;

    public CategoriaProdutoController(CategoriaProdutoService categoriaProdutoService) {
        this.categoriaProdutoService = categoriaProdutoService;
    }

}