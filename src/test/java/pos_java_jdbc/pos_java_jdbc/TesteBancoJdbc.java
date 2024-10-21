package pos_java_jdbc.pos_java_jdbc;

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
}
