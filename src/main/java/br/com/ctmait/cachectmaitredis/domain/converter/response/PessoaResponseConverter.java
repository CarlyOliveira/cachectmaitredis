package br.com.ctmait.cachectmaitredis.domain.converter.response;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import br.com.ctmait.cachectmaitredis.domain.dto.response.PessoaResponseDTO;
import br.com.ctmait.cachectmaitredis.domain.model.Pessoa;

@Component
public class PessoaResponseConverter implements Converter<Pessoa, PessoaResponseDTO>{

	@Override
	public PessoaResponseDTO convert(Pessoa source) {
		return PessoaResponseDTO.builder()
								.nome(source.getNome())
								.idade(source.getIdade())
								.uuid(source.getUuid())
								.build();
	}

}
