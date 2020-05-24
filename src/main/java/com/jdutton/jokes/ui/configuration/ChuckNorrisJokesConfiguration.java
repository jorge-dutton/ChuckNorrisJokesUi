package com.jdutton.jokes.ui.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckNorrisJokesConfiguration {

	// @Bean
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}

}
