package com.example.rockpaperscissors.controller;

import com.example.rockpaperscissors.model.Game;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("game")
public class GameController {

  @GetMapping("/")
  public String home(Model model) {
    if (!model.containsAttribute("game")) {
      model.addAttribute("game", new Game());
    }
    return "index";
  }

  @PostMapping("/play")
  public String play(@RequestParam String choice, Game game, Model model) {
    game.setPlayerChoice(choice.toUpperCase());
    game.play();
    model.addAttribute("game", game);
    return "index";
  }

  @PostMapping("/reset")
  public String reset(Model model) {
    model.addAttribute("game", new Game());
    return "index";
  }
}