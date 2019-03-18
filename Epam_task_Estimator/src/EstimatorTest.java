import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

class EstimatorTest {

	@Test
	void testHouseEstimator() {
		Estimator a=new Estimator();
		assertEquals(5000,a.houseEstimator("High standard", 2, "YES") );
	}

}
