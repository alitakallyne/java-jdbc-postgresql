package pos_java_jdbc.pos_java_jdbc;

import org.junit.jupiter.api.Test;

import conexaojdbc.SingleConnection;

public class TesteBancoJdbc {

	@Test
	public void initBanco(){
	   SingleConnection.getConnection();
	}
}
