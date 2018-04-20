package lab0;

import java.io.PrintStream;

public class Hello {
	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.printHello(System.out);
	}

	public void printHello(PrintStream out) {
		out.println("Hello world!");
	}
}
