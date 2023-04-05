package com.Game;
import java .util.Random;
import java .util.Scanner;

public class Game {
	 public static void main(String...args)
	  {  Random rnd = new Random();
	     int numberToGuess = rnd.nextInt(100);
	     int numberOfTries = 0;
	     Scanner input = new Scanner(System.in);
	     int guess;
	     boolean win = false;
	     while (win == false)
	     {  System.out.println("Guess a number between 1 and 100: ");
	         guess = input.nextInt();
	         numberOfTries++;
	         if( guess== numberToGuess)
	         { win = true; }
	         else if (guess < numberToGuess)
	         { System.out.println("Your guess is too low"); }
	          else if (guess > numberToGuess)
	         { System.out.println("Your guess is too high"); }
	      }
	       System.out.println("You Win!!");
	        System.out.println("The number was "+ numberToGuess);
	         System.out.println("It took you "+ numberOfTries + " tries.");
	   }
	}
