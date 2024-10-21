package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.jupiter.api.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.UserPosJava;

public class TesteBancoJdbc {

	@Test
	public void initBanco(){
	   //SingleConnection.getConnection();
		
		UserPosDAO userPosDAO = new UserPosDAO();
		UserPosJava  userPosJava = new UserPosJava();
		
		userPosJava.setId(4L);
		userPosJava.setNome("maria");
		userPosJava.setEmail("maria@gamil.com");
		
		userPosDAO.salvar(userPosJava);
	}
	
	@Test
	public void initListar() {
		UserPosDAO userPosDAO = new UserPosDAO();
		
		try {
			List<UserPosJava> listar = userPosDAO.listar();
			
			for (UserPosJava userPosJava : listar) {
				System.out.println(userPosJava);
				System.out.println("--------------------------------------------------------");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initBuscar() {
		UserPosDAO userPosDAO = new UserPosDAO();
		
		try {
			UserPosJava userPosJava = userPosDAO.buscar(6L);
			
					System.out.println(userPosJava);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void initAtualizar() {
		
		try {
			UserPosDAO userPosDAO = new UserPosDAO();
			
			UserPosJava objetoBanco = userPosDAO.buscar(5L);
			
			objetoBanco.setNome("nome atualizado");
			
			userPosDAO.atualizar(objetoBanco);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
