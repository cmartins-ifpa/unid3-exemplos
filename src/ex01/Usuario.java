package ex01;

import java.util.Date;

public class Usuario {
	private String nome;
	private Date dataHoraLogin;

	public Usuario(String nome) {
		this.nome = nome;
		this.dataHoraLogin = new Date();
	}
    // get's e set's
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}

	public Date getDataHoraLogin() {return dataHoraLogin;}
	public void setDataHoraLogin(Date dataHoraLogin) {
		this.dataHoraLogin = dataHoraLogin;
	}

}
