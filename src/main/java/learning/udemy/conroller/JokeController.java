package learning.udemy.conroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import learning.udemy.service.JokeService;
import learning.udemy.service.JokeServiceImpl;

@Controller
public class JokeController {
	private final JokeService jokeService;
	
	

	public JokeController(JokeService jokeService) {
		super();
		this.jokeService = jokeService;
	}



	@RequestMapping("/")
	public String func(Model model) {
		model.addAttribute("joke",jokeService.getJoke());
		return "index";
	}
}
