import java.sql.*; 

public class mysql_homework7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{ 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con=DriverManager.getConnection(
			"jdbc:mysql://ip주소:포트번호/madang","username","비번"); 
			
			Statement stmt=con.createStatement(); 
			//삽입
			//stmt.executeUpdate("INSERT INTO Book(bookid, bookname, publisher) VALUES(30, '추가된책', 'gminj');");
			//삭제
			stmt.executeUpdate("DELETE FROM Book WHERE bookid = '30';");
			ResultSet rs=stmt.executeQuery("SELECT * FROM Book"); 
			while(rs.next()) 
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+
			" "+rs.getString(3)); 
			con.close(); 
			}catch(Exception e){ System.out.println(e);} 
	}

}
