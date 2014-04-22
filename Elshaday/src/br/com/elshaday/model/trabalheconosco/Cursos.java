package br.com.elshaday.model.trabalheconosco;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;


@Entity()
@XmlRootElement
@Table(name="tb_cursos")
public class Cursos {

	@Id @GeneratedValue
	private Long id;
	private String nome;
	private String instituicao;
	private Calendar data;
	private int qtdHoras;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public Calendar getData() {
		return data;
	}
	public void setData(Calendar data) {
		this.data = data;
	}
	public int getQtdHoras() {
		return qtdHoras;
	}
	public void setQtdHoras(int qtdHoras) {
		this.qtdHoras = qtdHoras;
	}
	@Override
	public String toString() {
		return "Cursos [id=" + id + ", nome=" + nome + ", instituicao="
				+ instituicao + ", data=" + data + ", qtdHoras=" + qtdHoras
				+ "]";
	}
	
	
	
}