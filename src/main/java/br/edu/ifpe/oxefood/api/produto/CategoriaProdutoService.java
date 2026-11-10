package br.edu.ifpe.oxefood.api.produto;


import java.util.List;

import org.springframework.stereotype.Service;

import br.edu.ifpe.oxefood.exception.ProdutoException;
import jakarta.transaction.Transactional;

@Service
public class CategoriaProdutoService {

    @Transactional
    public CategoriaProduto atualizar(CategoriaProdutoDTO dto) {

        CategoriaProduto categoria = new CategoriaProduto();
        categoria.setDescricao(dto.getDescricao());
        categoria.setHabilitado(true);
        return repository.save(categoria);

    }

    @Transactional
    public void remover(Long id) {

        CategoriaProduto categoriaProduto = repository.findById(id).get();
        categoriaProduto.setHabilitado(false);

        repository.save(categoriaProduto);
    }

    public List<CategoriaProduto> listar() {

        return repository.findAll();
    }

    public CategoriaProduto buscarPorId(Long id) {

        return repository.findById(id).get();
    }


    private final CategoriaProdutoRepository repository;

    private final CategoriaProdutoRepository categoriaProdutoRepository;

    public CategoriaProdutoService(CategoriaProdutoRepository repository, CategoriaProdutoRepository categoriaProdutoRepository) {
       this.repository = repository;
       this.categoriaProdutoRepository = categoriaProdutoRepository;
    }
}