Since: PMD 4.2.6

Statements in a catch block that invoke accessors on the exception without using the information
only add to code size.  Either remove the invocation, or use the return result.

Example(s):
```
public void bar() {
	try {
		// do something
	} catch (SomeException se) {
		se.getMessage();
	}
}
```
