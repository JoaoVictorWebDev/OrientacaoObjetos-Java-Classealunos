package cursojava.classes;

public class Diretor extends Pessoa {
	protected String registroEducacao;
	protected String tempoDirecao;
	protected String titulacao;
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public String getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(String tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public String toString() {
		return "Diretor [registroEducacao=" + registroEducacao
				+ ", tempoDirecao=" + tempoDirecao + ", titulacao=" + titulacao
				+ "]";
	}
	
	public double salario(){
		
		return 3500*0.8;
	}
}
