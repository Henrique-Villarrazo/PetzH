package br.com.villa.petzh.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.villa.petzh.interceptor.InterceptadorDeAcessos;
import br.com.villa.petzh.interceptor.InterceptadorDeAcessos.Acesso;

@RestController
@RequestMapping("acessos")
public class AcessosRest {

	@GetMapping
	public List<Acesso> getAcessos() {
		return InterceptadorDeAcessos.acessos;
	}
}
