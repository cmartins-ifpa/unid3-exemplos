package ex02;

public class RendimentoMes {
	private int   mes;
	private float valor;
	public RendimentoMes() {	}
	
	public RendimentoMes(int mes, float valor) {
		this.mes = mes;
		this.valor = valor;
	}

	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
