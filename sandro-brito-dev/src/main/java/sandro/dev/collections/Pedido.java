package sandro.dev.collections;

public class Pedido {

	private String status;
	private String produto;

	public Pedido(String status, String produto) {
		super();
		this.status = status;
		this.produto = produto;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Pedido [status=" + status + ", produto=" + produto + "]";
	}

}
