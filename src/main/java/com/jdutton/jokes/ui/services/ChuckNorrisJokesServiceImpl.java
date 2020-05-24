package com.jdutton.jokes.ui.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ChuckNorrisJokesServiceImpl implements ChuckNorrisJokesService {
	
	//Más eficiente es crear ChuckNorrisQuotes como private final e inicializarlo en el 
	//constructor por defecto
	private final ChuckNorrisQuotes chukNorrisQuotes;
	
	public ChuckNorrisJokesServiceImpl() {
		chukNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	@Override
	public String getRandomJoke() {
		//ChuckNorrisQuotes chukNorrisQuotes = new ChuckNorrisQuotes();
		return chukNorrisQuotes.getRandomQuote();
	}

}
