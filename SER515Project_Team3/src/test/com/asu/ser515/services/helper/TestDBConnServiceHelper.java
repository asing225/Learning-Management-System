package test.com.asu.ser515.services.helper;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.asu.ser515.services.helper.DBConnServiceHelper;
/**
 * @author anurag933103
 * @date 10/27/2019
 * 
 * JUnit test class to test AdminServletHelper class.
 * */
class TestDBConnServiceHelper {
	private DBConnServiceHelper dbHelper = new DBConnServiceHelper();
	private String userType;
	private int numUserType;

	@Test
	void testMapAdminToDBConnSuccess() {
		userType = "admin";
		int connValue = dbHelper.mapUserTypeToDB(userType);
		assertEquals(1, connValue);
	}
	
	@Test
	void testMapTeacherToDBConnSuccess() {
		userType = "teacher";
		int connValue = dbHelper.mapUserTypeToDB(userType);
		assertEquals(2, connValue);
	}
	
	@Test
	void testMapStudent1ToDBConnSuccess() {
		userType = "studentGrade_1";
		int connValue = dbHelper.mapUserTypeToDB(userType);
		assertEquals(3, connValue);
	}
	
	@Test
	void testMapStudent6ToDBConnSuccess() {
		userType = "studentGrade_6";
		int connValue = dbHelper.mapUserTypeToDB(userType);
		assertEquals(4, connValue);
	}
	
	@Test
	void testMapDBToAdminConnSuccess() {
		numUserType = 1;
		String dbValue = dbHelper.mapDBtoUsertype(numUserType);
		assertEquals("admin", dbValue);
	}
	
	@Test
	void testMapDBToTeacherConnSuccess() {
		numUserType = 2;
		String dbValue = dbHelper.mapDBtoUsertype(numUserType);
		assertEquals("teacher", dbValue);
	}
	
	@Test
	void testMapDBToStudent1ConnSuccess() {
		numUserType = 3;
		String dbValue = dbHelper.mapDBtoUsertype(numUserType);
		assertEquals("studentGrade_1", dbValue);
	}
	
	@Test
	void testMapDBToStudent6ConnSuccess() {
		numUserType = 4;
		String dbValue = dbHelper.mapDBtoUsertype(numUserType);
		assertEquals("studentGrade_6", dbValue);
	}
}
