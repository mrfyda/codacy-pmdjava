Since: PMD 4.0

In JUnit4, use the @Test(expected) annotation to denote tests that should throw exceptions.

Example(s):
```
public class MyTest {
	@Test
    public void testBad() {
        try {
            doSomething();
            fail("should have thrown an exception");
        } catch (Exception e) {
        }
    }

	@Test(expected=Exception.class)
    public void testGood() {
        doSomething();
    }
}
```
