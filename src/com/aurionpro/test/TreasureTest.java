package com.aurionpro.test;

import java.util.Scanner;

public class TreasureTest {

	public static void main(String[] args) {
		
		System.out.println("\nWelcome to Treasure Island.\nYour mission is to find the treasure\n");
		
		findTheTreasure();
		
		System.out.println("Do you want to play again..(Y or N)?");
		Scanner sc = new Scanner(System.in);
		String decision =sc.nextLine();
		
		while(decision.toUpperCase().equals("Y"))
		{
	
				findTheTreasure();
				System.out.println("Do you want to play again..(Y or N)?");
				decision =sc.nextLine();
		}
		
		if(decision.equals("N"))
		{
			System.exit(0);
		}

	}

	private static void findTheTreasure() {
		
		System.out.println("-----------------------------------------------------\n");

		System.out.println("Here the game starts...\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Left or Right (enter l for left & r for right):\n");
		String directionChoosen =sc.nextLine();

		if(directionChoosen.toLowerCase().equals("r"))
		{
			System.out.println("\nFall into a hole.\nGame Over.\n");	
			
			
		}
		else if(directionChoosen.toLowerCase().equals("l"))
		{
			System.out.println("\nSwim or Wait? (enter s for swim & w for wait):");
			String choosen = sc.next();
			
			if(choosen.toLowerCase().equals("s"))
			{
				System.out.println("\nAttacked by trout.\nGame over.\n");
			}
			else if(choosen.toLowerCase().equals("w"))
			{
				System.out.println("\nWhich door - Red, Blue or Yellow..?\n");
				
				Scanner sc1 = new Scanner(System.in);
				String doorChosen =sc1.nextLine();
				
				if(doorChosen.toLowerCase().equals("blue"))
				{
					System.out.println("\nEaten by beast.\nGame over.\n");
				}
				else if(doorChosen.toLowerCase().equals("red"))
				{
					System.out.println("\nBurned by fire.\nGame over.\n");
				}
				else if(doorChosen.toLowerCase().equals("yellow"))
				{
					System.out.println("\nCongratulations!!\nYou win!");
				}
				else
				{
					System.out.println("Game over.");
				}
			}
		}
		
	}

}

