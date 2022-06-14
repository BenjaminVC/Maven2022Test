import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    //true iff all letters in the word are uppercase | word starts with uppercase
    // | all letters are lowercase
    @Test
    public void detectCapitalUseTest1() {
       fail("Not yet implemented");

    }
    @Test
    public void detectCapitalUseTest2() {
        fail("Not yet implemented");
    }


}
