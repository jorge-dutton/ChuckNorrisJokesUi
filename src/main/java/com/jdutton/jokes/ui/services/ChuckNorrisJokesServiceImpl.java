package com.jdutton.jokes.ui.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokesServiceImpl implements ChuckNorrisJokesService {

	private final ChuckNorrisQuotes chukNorrisQuotes;

	public ChuckNorrisJokesServiceImpl(
			final ChuckNorrisQuotes chukNorrisQuotes) {
		super();
		this.chukNorrisQuotes = chukNorrisQuotes;
	}

	@Override
	public String getRandomJoke() {
		return chukNorrisQuotes.getRandomQuote();
	}

}
