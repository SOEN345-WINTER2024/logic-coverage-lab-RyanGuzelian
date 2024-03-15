import org.junit.Test;
import static org.junit.Assert.*;

public class checkItTest {

    @Test
    public void testCheckItPredicateCoverage1() {
        assertTrue(CheckIt.checkIt(true, false, false));
    }

    @Test
    public void testCheckItPredicateCoverage2() {
        assertFalse(CheckIt.checkIt(false, true, false));
    }
    
}
