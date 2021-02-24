package ong.generation.Loja_Games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ong.generation.Loja_Games.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByNomeContainingIgnoreCase( String nome);
}
