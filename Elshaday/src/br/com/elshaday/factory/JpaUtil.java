package br.com.elshaday.factory;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil{

	private static EntityManager instance ;
	
	
	public static EntityManager getInstance(){
		if(instance==null){
			instance= createEM();
		}
		
		return instance;
	}
	
	private JpaUtil(){}
	
	
	private static EntityManager createEM(){
		
		EntityManager em= null;
		try{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu-elshaday");	
		em = emf.createEntityManager();
		
		}catch(Exception e){
			System.out.println("não foi possivel criar entity manager");
			e.printStackTrace();
		}
	return em;
	}
	
	
}
