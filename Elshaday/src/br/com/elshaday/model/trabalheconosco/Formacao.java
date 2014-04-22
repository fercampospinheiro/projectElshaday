package br.com.elshaday.model.trabalheconosco;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="tb_formacao")
@XmlRootElement
public class Formacao {

	@Id @GeneratedValue
	private Long id;
	private String instituicao;
	private String tipo;
	private String curso;
	private Calendar inicio;
	private String situacao;
	private Calendar fim;
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getInstituicao() {
		return instituicao;
	}



	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public Calendar getInicio() {
		return inicio;
	}



	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}



	public String getSituacao() {
		return situacao;
	}



	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}



	public Calendar getFim() {
		return fim;
	}



	public void setFim(Calendar fim) {
		this.fim = fim;
	}



	@Override
	public String toString() {
		return "Formacao [id=" + id + ", instituicao=" + instituicao
				+ ", tipo=" + tipo + ", curso=" + curso + ", inicio=" + inicio
				+ ", situacao=" + situacao + ", fim=" + fim + "]";
	}
	
	

}
