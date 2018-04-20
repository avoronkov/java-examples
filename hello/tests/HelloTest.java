import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import lab0.Hello;

public class HelloTest {
	@Test
	public void testHello() {
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		String content = "";
		try(PrintStream ps = new PrintStream(baos, true, "utf-8")) {
			Hello hello = new Hello();
			hello.printHello(ps);
			content = new String(baos.toByteArray(), StandardCharsets.UTF_8);
		}
		catch (UnsupportedEncodingException e) {
			fail(e.toString());
		}
		assertEquals(content, "Hello world!\n");
	}
}
