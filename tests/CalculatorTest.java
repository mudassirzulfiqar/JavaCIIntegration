import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by moodi on 12/06/2018.
 */

public class CalculatorTest {

    @Test
    public void sumShouldWork(){


        Assert.assertEquals(4 , Calculator.sum(2,2));
    }

}