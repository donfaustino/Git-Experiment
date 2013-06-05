package com.don.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.don.git.GitMain;

public class GitTest {

	@Test
	public void test() {
		GitMain gitMain = new GitMain();
		assertEquals("Hello World",gitMain.helloWorld());
	}

}
