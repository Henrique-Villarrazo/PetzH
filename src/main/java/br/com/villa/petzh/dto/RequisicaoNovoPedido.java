package br.com.villa.petzh.dto;

import javax.validation.constraints.NotBlank;

import br.com.villa.petzh.modelo.Pedido;
import br.com.villa.petzh.modelo.StatusPedido;

public class RequisicaoNovoPedido {

	@NotBlank
	private String tipoPet;
	
	@NotBlank
	private String raca;
	
	@NotBlank
	private String urlImagem;
	private String descricao;

	public String getTipoPet() {
		return tipoPet;
	}

	public void setTipoPet(String tipoPet) {
		this.tipoPet = tipoPet;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getUrlImagem() {
		return urlImagem;
	}

	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setTipoPet(tipoPet);
		pedido.setDescricao(descricao);
		pedido.setUrlImagem(urlImagem);
		pedido.setRaca(raca);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		return pedido;
	}

}
