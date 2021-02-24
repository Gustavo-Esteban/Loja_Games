package ong.generation.Loja_Games.repository;

import java.util.List;

import ong.generation.Loja_Games.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long>{
	
	public List<Usuario> findAllByNomeCompletoContainingIgnoreCase( String nomeCompleto);
}
