package cursojava.classes;

import java.util.Objects;

public class Disciplina{

private double n1;
private String disciplina;
public double getN1() {
	return n1;
}
public void setN1(double n1) {
	this.n1 = n1;
}
public String getDisciplina1() {
	return disciplina;
}
public void setDisciplina1(String disciplina1) {
	this.disciplina = disciplina;
}
@Override
public int hashCode() {
	return Objects.hash(disciplina, n1);
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
	return Objects.equals(disciplina, other.disciplina)
			&& Double.doubleToLongBits(n1) == Double.doubleToLongBits(other.n1);
}
@Override
public String toString() {
	return "Disciplina [n1=" + n1 + ", disciplina1=" + disciplina + "]";
}


}