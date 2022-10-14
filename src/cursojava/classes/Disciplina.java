package cursojava.classes;

import java.util.Objects;

public class Disciplina {
	private double n1;
	private String disciplina1;
	private double n2;
	private String disciplina2;
	private double n3;
	private String disciplina3;
	private double n4;
	private String disciplina4;
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1(String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public String getDisciplina2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public double getN4() {
		return n4;
	}
	public void setN4(double n4) {
		this.n4 = n4;
	}
	public String getDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	@Override
	public int hashCode() {
		return Objects.hash(disciplina1, disciplina2, disciplina3, disciplina4, n1, n2, n3, n4);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina1, other.disciplina1) && Objects.equals(disciplina2, other.disciplina2)
				&& Objects.equals(disciplina3, other.disciplina3) && Objects.equals(disciplina4, other.disciplina4)
				&& Double.doubleToLongBits(n1) == Double.doubleToLongBits(other.n1)
				&& Double.doubleToLongBits(n2) == Double.doubleToLongBits(other.n2)
				&& Double.doubleToLongBits(n3) == Double.doubleToLongBits(other.n3)
				&& Double.doubleToLongBits(n4) == Double.doubleToLongBits(other.n4);
	}
	@Override
	public String toString() {
		return "Disciplina [n1=" + n1 + ", disciplina1=" + disciplina1 + ", n2=" + n2 + ", disciplina2=" + disciplina2
				+ ", n3=" + n3 + ", disciplina3=" + disciplina3 + ", n4=" + n4 + ", disciplina4=" + disciplina4 + "]";
	}

}
