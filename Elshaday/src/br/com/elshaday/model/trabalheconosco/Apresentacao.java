package br.com.elshaday.model.trabalheconosco;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="tb_apresentacao")
@XmlRootElement
public class Apresentacao {
	@Id @GeneratedValue
	private Long id;
	private String titulo;
	private String descricao;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Apresentacao [id=" + id + ", titulo=" + titulo + ", descricao="
				+ descricao + "]";
	}
	

	
}
