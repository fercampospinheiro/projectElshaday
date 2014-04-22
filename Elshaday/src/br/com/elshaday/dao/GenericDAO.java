package br.com.elshaday.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.elshaday.factory.JpaUtil;
import bsh.This;

public abstract class GenericDAO<T> {

	private EntityManager em;
	private Class<T> entity ;
	
	public GenericDAO(Class<T> entity) {
		super();
		this.em = JpaUtil.getInstance();
		this.entity =entity;
	}
	
	
	@SuppressWarnings("hiding")
	public <T> void salvar (T t){
		
		try{
		
			if(t==null){
				
				System.out.println("cliente vazio..");
			
			}else{  em.persist(t);
					System.out.println("entidade foi persistida");
				}
			
		}catch(Exception e){
			
			System.out.println("entidade não foi persistida");
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("hiding")
	public <T> void atualizar (T t){
		
		try{
		
			if(t==null){
				
				System.out.println("cliente vazio..");
			
			}else{  em.merge(t);
					System.out.println("entidade foi persistida");
				}
			
		}catch(Exception e){
			
			System.out.println("entidade não foi persistida");
			e.printStackTrace();
		}
	}
	
	public T get(Long id){
		
		T t = null ;
		System.out.println("Entity está :"+(this.entity==null));
		try{
				
				t = (T) em.find(this.entity, id);
				System.out.println("entidade foi recuperada com sucesso");
		}catch(Exception e){
				
				System.out.println("entidade não foi recuperada");
				e.printStackTrace();
				e.getMessage();
		}
	return t; 
		
	}
	
	public List<T> list(String nameQuery){
		Query q = em.createNamedQuery(nameQuery);
		return q.getResultList();
	}
	
	
	
	public  void open(){
		em.getTransaction().begin();
	}
	
	public void commit(){
		em.getTransaction().commit();
	}
	
	public void flush(){
		em.flush();
	}
	
	public void close(){
		em.close();
	}
	
	public void rollBack(){
		em.getTransaction().rollback();
	}
}
