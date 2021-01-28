package kmitl.singleton;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class CompanyManagetTest {

    @Test
    public void testDoSth() {
        CompanyManager.doSth();
        assertEquals("failure - strings are not equal", "Sth", CompanyManager.doSth());
    }
}
