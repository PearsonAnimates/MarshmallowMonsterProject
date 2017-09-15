package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;

public class MonsterController
{

	public void start()
	{
		MarshmallowMonster basic = new MarshmallowMonster();
		System.out.println(basic);
		MarshmallowMonster Jerry = new MarshmallowMonster("Undead Marshmallow Jerry Pawn Zombie", 7, 4, 0.7, true);
		System.out.println(Jerry);
		System.out.println("I'm feeling hungry, I'm going to eat you Jerry... despite the fact you're a dead rotten corpse... MMM I CAN TASTE THE CALORIES, SO DELICIOUS!!!");
		Jerry.setEyeCount(Jerry.getEyeCount() - 1);
		System.out.println("Why would you do this!? I only have " + Jerry.getEyeCount() + " eyes now!!!");
		
		interactWithMonster(Jerry);
		
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
		System.out.println(currentMonster.getName() + " Says: How many of my eyes will you eat!? Geez!!! (write number)");
		int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		System.out.println(currentMonster.getName() + " Says: I only have " + currentMonster.getEyeCount() + " eyes now... ouch, it hurts so much!!! Please don't take anything else!!!");
		System.out.println("Bye Jerry. *nom* *nom* nom* *nom* *nom*");
		currentMonster.setEyeCount(0);
		currentMonster.setArmCount(0);
		currentMonster.setTentacleAmount(0.0);
		currentMonster.setBloop(false);
		System.out.println(currentMonster.getName() + " is now completely eaten");
		
		
		myScanner.close();
	}
}
