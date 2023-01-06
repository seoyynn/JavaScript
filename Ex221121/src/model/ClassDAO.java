package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClassDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	boolean result;
	int cnt = 0;

	public boolean login(String id, String pw) {

		connect();

		String sql = "select * from membership where id =? and pw=?";
		try {

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery(); // 테이블에 영향을 주지않는다면 query를 사용함

			if (rs.next()) {
				result = true;
			} else {
				result = false;
			}

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		close();
		return result;

	}

	public int insert(ClassDTO dto) {

		connect();

		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String nick = dto.getNick();
			int age = dto.getAge();

			String sql = "insert into membership values(?,?,?,?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);
			psmt.setInt(4, age);

			cnt = psmt.executeUpdate(); // 테이블에 영향을 주는 수정,삭제,추가는 update를 사용

		} catch (SQLException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

		close();
		return cnt;

	}

	private void connect() {

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";

			conn = DriverManager.getConnection(url, db_id, db_pw);

		} catch (ClassNotFoundException e) {

			System.out.println("동적로딩 실패");

		} catch (SQLException e) {

			System.out.println("sql 문제");

		}

	}

	private void close() {

		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
