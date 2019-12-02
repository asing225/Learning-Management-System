package test.com.asu.ser515.services.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.asu.ser515.services.helper.AdminServletHelper;
/**
 * @author anurag933103
 * @date 11/27/2019
 * 
 * JUnit test class to test AdminServletHelper class.
 * */
class TestAdminServletHelper {
	private AdminServletHelper adminHelper = new AdminServletHelper();
    private int userType;
    
    @Test
	void testMapAdminToPage_success() {
    	userType = 1;
		String adminPage = adminHelper.mapAdminToPage(userType);
		assertEquals("/admin.html", adminPage);
	}

}
