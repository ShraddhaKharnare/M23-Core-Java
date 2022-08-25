package com.cg.Testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledMethodDemo
{
	@Test
    void display()
	{
		System.out.println("Not disabled");
	}
	@Disabled
	void accept()
	{
		System.out.println("disabled");
	}
}
