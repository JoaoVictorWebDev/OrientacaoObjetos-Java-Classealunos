package cursojava.classes;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends Pessoa {

	protected String nomeEscola;
	protected String serieMatriculado;
	protected String Disciplinas;
	protected String dataMatricula;

	
	private Disciplina disciplina = new Disciplina();

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return this.dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public Aluno() {

	}

	public Aluno(String nomePadrao) {
		nome = nomePadrao;

	}

	public Aluno(String nomePadrao, int idadePadrao) {

		nome = nomePadrao;
		idade = idadePadrao;

	}

	// Métodos Getter and Setter.

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getMediaNota() {
		double somaNotas = 0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getN1();

		}
		return somaNotas / disciplinas.size();

	}

	public boolean getAlunoAprovado() {

		double media = this.getMediaNota();
		if (media >= 70) {
			return true;

		} else {
			return false;
		}
	}

	public String getAlunoAprovado2() {
		double media = this.getMediaNota();

		if (media >= 60) {

			return "Aluno aprovado";
		}

		else {
			return "Reprovado";
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome)
				&& Objects.equals(numeroCpf, other.numeroCpf);
	}

	public void setDisciplinas(String disciplinas) {
		Disciplinas = disciplinas;
	}

	@Override
	public String toString() {
		return "Aluno [idade=" + idade + ", dataNascimento=" + dataNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf="
				+ numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola="
				+ nomeEscola + ", serieMatriculado=" + serieMatriculado
				+ ", nome=" + nome + ", disciplina=" + disciplina + "]";
	}
	
	public boolean pessoamaiorIdade(){
		return super.idade >= 18;
		
	}
	
	public 	String msgMaiordeIdade(){
		return this.pessoamaiorIdade()? "Aluno maior de Idade" : "Aluno não é maior de idade";
	}
 public double salario(){
	
	 
	 return 1500.90;
 }
}
