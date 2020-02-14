package br.com.ctmait.cachectmaitredis.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ctmait.cachectmaitredis.domain.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	
	public Optional<Pessoa> getByUuid(String uuid);

}
