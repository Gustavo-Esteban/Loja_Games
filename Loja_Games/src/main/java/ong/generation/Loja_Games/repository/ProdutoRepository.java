package ong.generation.Loja_Games.repository;

import java.util.List;

import ong.generation.Loja_Games.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
}
