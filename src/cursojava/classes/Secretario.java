package cursojava.classes;

import com.interfaces.PermitirACESSO;

public class Secretario extends Pessoa implements PermitirACESSO {
	protected String registro;
	protected String nivelCargo;
	protected String experiencia;
	private String login;
	private String senha;

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}

	public String getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}

	public boolean autenticar() {
		// TODO Auto-generated method stub
		return login.equals("admin")&& senha.equals("admin");
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticar(String login, String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
