package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class MenuDao {

	Connection conn = null;
	PreparedStatement psmt = null;
	boolean result;
	ResultSet rs = null;
	int cnt = 0;

	// 3. SQL문 작성
	// [1] 로그인 메소드
	public boolean login(String id, String pw) {
		connect();

		try {
			String sql = "select * from zombie where id =? and pw =?";
			psmt = conn.prepareCall(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);

			rs = psmt.executeQuery();

			if (rs.next()) {
				result = true;
			} else {
				result = false;
			}

		} catch (SQLException e) {
		}
		close();
		return result;
	}

	// [2] 회원가입 메소드
	public int insert(MenuDto mDto) {

		try {
			connect();
			String id = mDto.getId();
			String pw = mDto.getPw();
			String nick = mDto.getNick();

			String sql = "insert into zombie values(?, ?, ?)";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
		}

		close();

		return cnt;

	}

	// connect 메소드
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
			System.out.println("DB연결 실패");
		}

	}

	// close 메소드
	public void close() {
		try {
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
		}
	}

}
