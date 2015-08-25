//#Patterns: rulesets_java_junit.xml_JUnitTestContainsTooManyAsserts

public class MyTestCase extends TestCase {
    // Ok
    public void testMyCaseWithOneAssert() {
        boolean myVar = false;
        assertFalse("should be false", myVar);
    }
    // Bad, too many asserts (assuming max=1)
    //#Warn: rulesets_java_junit.xml_JUnitTestContainsTooManyAsserts
    public void testMyCaseWithMoreAsserts() {
        boolean myVar = false;
        assertFalse("myVar should be false", myVar);
        assertEquals("should equals false", false, myVar);
    }
}