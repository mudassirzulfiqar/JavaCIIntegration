import org.junit.Assert;
import org.junit.Test;

/**
 * Created by moodi on 13/06/2018.
 */
public class CalculatorTest {
    @Test
    public void sumShouldWork() {


        Assert.assertEquals(4, Calculator.sum(3, 2));
    }
}
