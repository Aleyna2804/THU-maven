package test;

import static org.junit.Assert.*;

import maven.Goodbye;

public class GoodbyeTest {
	
	public void test() {
		Goodbye goodbye = new Goodbye();
		assert(goodbye.isAlive());
	}
}
