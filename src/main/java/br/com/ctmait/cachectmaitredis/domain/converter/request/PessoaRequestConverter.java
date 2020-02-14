package br.com.ctmait.cachectmaitredis.domain.converter.request;

import java.util.UUID;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.ctmait.cachectmaitredis.domain.dto.request.PessoaRequestPostDTO;
import br.com.ctmait.cachectmaitredis.domain.dto.request.PessoaRequestPutDTO;
import br.com.ctmait.cachectmaitredis.domain.model.Pessoa;

@Component
public class PessoaRequestConverter implements Converter<PessoaRequestPostDTO, Pessoa>{

	@Override
	public Pessoa convert(PessoaRequestPostDTO source) {
		return Pessoa.builder()
					 .uuid(UUID.randomUUID().toString() )
					 .idade(source.getIdade())
					 .nome(source.getNome())
					 .build();
	}
	
	public Pessoa convert(PessoaRequestPutDTO source, Pessoa model) {
		model.setIdade(source.getIdade());
		model.setNome(source.getNome());
		return model;
	}

}
