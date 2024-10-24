package pos_java_jdbc.pos_java_jdbc;

import java.util.List;

import org.junit.jupiter.api.Test;

import conexaojdbc.SingleConnection;
import dao.UserPosDAO;
import model.BeanUserFone;
import model.Telefone;
import model.UserPosJava;

public class TesteBancoJdbc {

	@Test
	public void initBanco(){
	   //SingleConnection.getConnection();
		
		UserPosDAO userPosDAO = new UserPosDAO();
		UserPosJava  userPosJava = new UserPosJava();
		
		//userPosJava.setId(4L);
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
	
	@Test
	public void initDeletar() {
		
		try {
			
			UserPosDAO dao = new UserPosDAO();
			dao.deletar(4L);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testeInsertTelefone(){
		Telefone telefone = new Telefone();
	
		telefone.setNumero("564684658");
		telefone.setTipo("Casa");
		telefone.setUsuario(15L);
		
		UserPosDAO dao = new UserPosDAO();
		dao.salvarTelefone(telefone);
	}
	
	@Test
	public void testeCarregaFonesUser() {


		UserPosDAO dao = new UserPosDAO();


		List<BeanUserFone> beanUserFones = dao.listaUserFone(16L);


		for (BeanUserFone beanUserFone : beanUserFones) {
			System.out.println(beanUserFone);
			System.out.println("---------------------------------------------");
		}


	}


	@Test
	public void testeDeleteUserFone() {


		UserPosDAO dao = new UserPosDAO();
		dao.deleteFonesPorUser(15L);


	}

}
