package br.com.elshaday.model.trabalheconosco;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@Table(name="tb_experiencia")
@XmlRootElement
public class Experiencia {

	@Id @GeneratedValue
	private Long id;
	private String empresa;
	private String funcao;
	private Calendar admissao;
	private Calendar demissao;
	private String descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public Calendar getAdmissao() {
		return admissao;
	}
	public void setAdmissao(Calendar admissao) {
		this.admissao = admissao;
	}
	public Calendar getDemissao() {
		return demissao;
	}
	public void setDemissao(Calendar demissao) {
		this.demissao = demissao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Experiencia [id=" + id + ", empresa=" + empresa + ", funcao="
				+ funcao + ", admissao=" + admissao + ", demissao=" + demissao
				+ ", descricao=" + descricao + "]";
	}

	
}
