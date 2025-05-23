package com.example.rockpaperscissors.model;

public class Game {
  private String playerChoice;
  private String computerChoice;
  private String result;
  private int playerScore;
  private int computerScore;

  public Game() {
    this.playerScore = 0;
    this.computerScore = 0;
  }

  public String getPlayerChoice() {
    return playerChoice;
  }

  public void setPlayerChoice(String playerChoice) {
    this.playerChoice = playerChoice;
  }

  public String getComputerChoice() {
    return computerChoice;
  }

  public void setComputerChoice(String computerChoice) {
    this.computerChoice = computerChoice;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public int getPlayerScore() {
    return playerScore;
  }

  public void setPlayerScore(int playerScore) {
    this.playerScore = playerScore;
  }

  public int getComputerScore() {
    return computerScore;
  }

  public void setComputerScore(int computerScore) {
    this.computerScore = computerScore;
  }

  public void play() {
    String[] choices = { "ROCK", "PAPER", "SCISSORS" };
    int computerIndex = (int) (Math.random() * 3);
    computerChoice = choices[computerIndex];

    if (playerChoice.equals(computerChoice)) {
      result = "It's a tie!";
    } else if ((playerChoice.equals("ROCK") && computerChoice.equals("SCISSORS")) ||
        (playerChoice.equals("PAPER") && computerChoice.equals("ROCK")) ||
        (playerChoice.equals("SCISSORS") && computerChoice.equals("PAPER"))) {
      result = "You win!";
      playerScore++;
    } else {
      result = "Computer wins!";
      computerScore++;
    }
  }
}