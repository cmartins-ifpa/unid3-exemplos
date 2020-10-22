package ex02;
import java.util.ArrayList;
import java.util.List;

public class Rendimento {
	private float valor;
	private String tipoAplicacao;
	private int meses;
	private List<RendimentoMes> rendMensais;
	private float rendimentoFinal;

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getTipoAplicacao() {
		return tipoAplicacao;
	}

	public void setTipoAplicacao(String tipoAplicacao) {
		this.tipoAplicacao = tipoAplicacao;
	}

	public int getMeses() {
		return meses;
	}

	public void setMeses(int meses) {
		this.meses = meses;
	}

 	public float getRendimentoFinal() {
		return rendimentoFinal;
	}

	public void setRendimentoFinal(float rendimentoFinal) {
		this.rendimentoFinal = rendimentoFinal;
	}

	public List<RendimentoMes> getRendMensais() {
		calcula() ;
		return this.rendMensais;
	}

	/** método para  calcular mes a mes o rendimento da aplicacao. */	
	private void calcula() {		
		// instanciar o atributo de rendimentos mensais (uma lista)
		this.rendMensais = new ArrayList<RendimentoMes>();
		
		float valorAcumulado = valor;   // acumulador 
		for (int i = 0; i < meses; i++) {
			if (tipoAplicacao.equals("POUPANCA"))
			valorAcumulado = valorAcumulado * 0.005f + valorAcumulado;
			else 
				valorAcumulado = valorAcumulado * 0.008f + valorAcumulado;
			RendimentoMes rendMes = new RendimentoMes(i+1, valorAcumulado);
			// armazena o rendimento do mês na Lista
			this.rendMensais.add(rendMes);
		} // fim-for
		this.rendimentoFinal = valorAcumulado;
	}  

}
