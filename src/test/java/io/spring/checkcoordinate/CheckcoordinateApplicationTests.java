package io.spring.checkcoordinate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CheckcoordinateApplicationTests {



	@Test
	void contextLoads(){
		CheckcoordinateApplication app = new CheckcoordinateApplication();
		Assertions.assertEquals("Yep", app.checkCoordinate().apply("50,50"));
		Assertions.assertEquals( "Nope", app.checkCoordinate().apply("blahblah"));
	}

}
