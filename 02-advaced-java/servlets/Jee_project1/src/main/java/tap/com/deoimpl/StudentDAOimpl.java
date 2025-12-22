package tap.com.deoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.tap.deo.StudentDAO;
import com.tap.models.Student;

public class StudentDAOimpl implements StudentDAO {

	private String URL="jdbc:mysql://localhost:3306/student";
	private String USERNAME="root";
	private String PASSWORD="root";
	private String INSERT="INSERT into `student` (`name`,`age`,`email`,`department`,`address`) values(?,?,?,?,?)";

	@Override
	public int addStudent(Student stu) {
		int  res=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
				
				PreparedStatement pstmt=con.prepareStatement(INSERT);
				
				pstmt.setString(1,stu.getName());
				pstmt.setInt(2,stu.getAge());
				pstmt.setString(3,stu.getEmail());
				pstmt.setString(4,stu.getDepartment());
				pstmt.setString(5,stu.getAddress());
				
				res=pstmt.executeUpdate();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return res;
	}

}
