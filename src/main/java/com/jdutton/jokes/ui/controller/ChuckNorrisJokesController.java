package com.jdutton.jokes.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdutton.jokes.ui.services.ChuckNorrisJokesService;

@Controller
@RequestMapping("/jokes")
public class ChuckNorrisJokesController {

	private final ChuckNorrisJokesService chuckNorrisJokesService;

	public ChuckNorrisJokesController(
			ChuckNorrisJokesService chuckNorrisJokesService) {
		super();
		this.chuckNorrisJokesService = chuckNorrisJokesService;
	}

	@GetMapping
	public String getRandomJoke(final Model model) {
		model.addAttribute("joke", chuckNorrisJokesService.getRandomJoke());
		return "chucknorris";
	}
}
