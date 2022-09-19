package com.cg.Testing;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;



class ParameterizedTestDemo 
{	
	@ParameterizedTest
	@ValueSource(strings= {"shraddha","shreya"})
	void print(String word)
	{
		assertNotNull(word);
	}
	
}
