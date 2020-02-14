package br.com.ctmait.cachectmaitredis.domain.dto.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PessoaResponseDTO implements Serializable{	
	
	private static final long serialVersionUID = -2560568656307184119L;

	private String uuid;
	private String nome;
	private Integer idade;
}
