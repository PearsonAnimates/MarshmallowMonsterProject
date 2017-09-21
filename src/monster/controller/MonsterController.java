package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;

import java.util.Scanner;

public class MonsterController
{
	private MonsterDisplay popup;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
	}

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
		System.out.println(currentMonster);
		
		System.out.println("Please leave my arms alone! Or I'll bite you! I've only got " + currentMonster.getArmCount());
		//consumed = myScannerInt();
		int armEat = myScanner.nextInt();
		
		if(armEat == 0)
		{
			System.out.println("Thank you for letting me keep my arms!!!");
		}
		else if(armEat > 0)
		{
			System.out.println("Eating negative arms huh? Not possible exactly possible. Reality mus be hard to understand for you!!! XD");
		}
		else if(armEat - currentMonster.getArmCount() > 0)
		{
			System.out.println("I don't have that many arms smart one.");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			System.out.println("Ouch!!! That hurts... I've only got " + currentMonster.getArmCount() + " arms left");
		}
		
		System.out.println("... don't do that, don't look at my edible and delicous tentacles like that, I'm not food!!!");
		System.out.println("Console: Input a number of how many tentacles you'd like to eat (must be a double, Eg: 1.1, 0.0, 3.7, etc.)");
		System.out.println("Jerry has " + currentMonster.getTentacleAmount() + " tentacles.");
		double tentacleEat = myScanner.nextDouble();
		
		if(tentacleEat == 0.0)
		{
			System.out.println("YYYYYYYAAAAAAASSSSSSSS!!!! I still have my tentacle(s)!!!! :D");
		}
		else if(tentacleEat > 0.0)
		{
			System.out.println("You know wha- I'm not even gonn- no. no... hmm. NO. Y U B SO DUM!? YOU CAN'T EAT A NEGATIVE AMOU-- GRGAERASD!! -_- *applause*");
		}
		else if(tentacleEat - currentMonster.getTentacleAmount() < 0.0)
		{
			System.out.println("I don't even have that many tentacles... No comment... :|");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacleEat);
			System.out.println("OH MY GOD THE PAIN!!! IT HURTS SO MUCH!!! AHHHAHAHAHAHAHAHHA!!!! T.T");
			System.out.println("Jerry only has " + currentMonster.getTentacleAmount() + "tentacle(s) left");
		}
		
		popup.displayText("Hi there, ready to play???");
		String answer = popup.getResponse("Can you fart?");
		System.out.println(answer);
		
		myScanner.close();
	}
}
