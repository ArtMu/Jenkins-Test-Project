import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Logger;

/**
 * Created by amujunen on 5/10/17.
 */
public class JenkinsTestTest {
    static Logger logger = Logger.getLogger("JenkinsTestTest");
    @Test
    public void subtract() throws Exception {
        int result = JenkinsTest.subtract(10, 2);
        Assert.assertEquals("### Wrong Subtract result: ", 5, result); 
        logger.info("#### Subtract PASS");
    }

    @Test
    public void multiply() throws Exception {
        int result = JenkinsTest.multiply(10, 2);
        Assert.assertEquals("### Wrong Multiply result: ", 5, result);    // False failure
        logger.info("#### Multiply PASS");
    }

}