package monster.controller;

import monster.model.MarshmallowMonster;
import monster.view.MonsterDisplay;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class MonsterController
{
	private MonsterDisplay popup;
	private List<MarshmallowMonster> monsterList;
	
	public MonsterController()
	{
		popup = new MonsterDisplay();
		monsterList = new ArrayList<MarshmallowMonster>();
	}

	public void start()
	{
//		int count = 0;
//		while(count < 10)
//		{
//			popup.displayText("I hate you, enjoy this popup, it will never go away, unless you hit the ok button enough times");
//			count +=2;
//		}
		
//		for(int loop = 0; loop < 10; loop =+1)
//		{
//			popup.displayText("This is loop #" + (loop +1) + " of ten");
//		}
		
		
		
		
		
		MarshmallowMonster basic = new MarshmallowMonster();
//		System.out.println(basic);
		popup.displayText(basic.toString());
		MarshmallowMonster Jerry = new MarshmallowMonster("Undead Marshmallow Jerry Pawn Zombie", 7, 4, 0.7, true);
//		System.out.println(Jerry);
		popup.displayText(Jerry.toString());
//		System.out.println("I'm feeling hungry, I'm going to eat you Jerry... despite the fact you're a dead rotten corpse... MMM I CAN TASTE THE CALORIES, SO DELICIOUS!!!");
		popup.displayText("I'm feeling hungry, I'm going to eat you Jerry... despite the fact you're a dead rotten corpse... MMM I CAN TASTE THE CALORIES, SO DELICIOUS!!!");
		Jerry.setEyeCount(Jerry.getEyeCount() - 1);
//		System.out.println("Why would you do this!? I only have " + Jerry.getEyeCount() + " eyes now!!!");
		popup.displayText("Why would you do this!? I only have " + Jerry.getEyeCount() + " eyes now!!!");
		
		monsterList.add(basic);
		monsterList.add(Jerry);
		useList();
		
		interactWithMonster(Jerry);
		
	}
	
	private void useList()
	{
		for (int index = 0; index <monsterList.size(); index++)
		{
			MarshmallowMonster currentMonster = monsterList.get(index);
			popup.displayText(currentMonster.getName());
			String updateName = popup.getResponse("Want to name me? What should it be?");
			currentMonster.setName(updateName + "(rude joke here)");
			popup.displayText("My new name is now " + currentMonster.getName() + "... that is a terrible name you gave me!!! D:<");
		}
		for (MarshmallowMonster current : monsterList)
		{
			popup.displayText("My new name is " + current.getName());
		}
	}
	
	private void interactWithMonster(MarshmallowMonster currentMonster)
	{
		Scanner myScanner = new Scanner(System.in);
//		System.out.println(currentMonster.getName() + " Says: How many of my eyes will you eat!? Geez!!! (write number)");
		int consumed = 0; 
		String response = popup.getResponse(currentMonster.getName() + " Says: How many of my eyes will you eat!? Geez!!! (write number)");
		
		while(!isValidInteger(response))
		{
			popup.displayText("Type an integer. Like any number you learned in first grade.");
			response = popup.getResponse("now put in an integer");
		}
		consumed = Integer.parseInt(response);
		
		
//		if(isValidInteger(response))
//		{
//			consumed = Integer.parseInt(response);
//		}
				
		//int consumed = myScanner.nextInt();
		currentMonster.setEyeCount(currentMonster.getEyeCount() - consumed);
		//System.out.println(currentMonster);
		popup.displayText(currentMonster.toString());
		//System.out.println("LEAVE MY ARMS ALONE!!! Or I'll bite you! I've only got " + currentMonster.getArmCount() + " arms left!");
		popup.displayText("LEAVE MY ARMS ALONE!!! Or I'll bite you! I've only got " + currentMonster.getArmCount() + " arms left!");
		//consumed = myScannerInt();
		int armEat = 0;
		String response1 = popup.getResponse("Console: type in the amount of arms you want to eat. Must be a number, 0 is valid.");
		
		while(!isValidInteger(response1))
		{
			popup.displayText("Type an integer. Like any number you learned in first grade.");
			response1 = popup.getResponse("now put in an integer");
		}
		armEat = Integer.parseInt(response1);
		
//		if(isValidInteger(response1))
//		{
//			armEat = Integer.parseInt(response1);
//		}
		
		if(armEat == 0)
		{
			//System.out.println("That's a relief... still go all my arms... phew...");
			popup.displayText("That's a relief... still go all my arms... phew...");
		}
		else if(armEat < 0)
		{
			//System.out.println("Eating negative arms huh? Not possible exactly possible. Reality must be hard to understand for you!!! XD");
			popup.displayText("Eating negative arms huh? Not possible exactly possible. Reality must be hard to understand for you!!! XD");
		}
		else if(armEat - currentMonster.getArmCount() < 0)
		{
			//System.out.println("I don't have that many arms smart one.");
			popup.displayText("I don't have that many arms smart one.");
		}
		else
		{
			currentMonster.setArmCount(currentMonster.getArmCount() - armEat);
			//System.out.println("Ouch!!! That hurts... I've only got " + currentMonster.getArmCount() + " arms left");
			popup.displayText("Ouch!!! That hurts... I've only got " + currentMonster.getArmCount() + " arms left");
		}
		
		//System.out.println("... don't do that, don't look at my edible and delicious tentacles like that, I'm not food!!!");
		popup.displayText("... don't do that, don't look at my edible and delicious tentacles like that, I'm not food!!!");
		//System.out.println("Console: Input a number of how many tentacles you'd like to eat (must be a double, Eg: 1.1, 0.0, 3.7, etc.)");
		popup.displayText("Console: Input a number of how many tentacles you'd like to eat (must be a double, Eg: 1.1, 0.0, 3.7, etc.)");
		//System.out.println("Jerry has " + currentMonster.getTentacleAmount() + " tentacles.");
		popup.displayText("Jerry has " + currentMonster.getTentacleAmount() + " tentacles.");
		
		double tentacleEat = 0.0;
		String tentacleResponse = popup.getResponse("Console: type in the amount of tentacles you want to eat. Must be a number, 0.0 is valid.");
		
		while(!isValidDouble(tentacleResponse))
		{
			popup.displayText("Type an double. Like 0.0");
			tentacleResponse = popup.getResponse("Now enter a double");
		}
		tentacleEat = Double.parseDouble(tentacleResponse);
		
//		if(isValidDouble(tentacleResponse))
//		{
//			tentacleEat = Double.parseDouble(tentacleResponse);
//		}
				
		if(tentacleEat == 0.0)
		{
			//System.out.println("YYYYYYYAAAAAAASSSSSSSS!!!! I still have my tentacle(s)!!!! :D");
			popup.displayText("YYYYYYYAAAAAAASSSSSSSS!!!! I still have my tentacle(s)!!!! :D");
		}
		else if(tentacleEat < 0.0)
		{
			//System.out.println("You know wha- I'm not even gonn- no. no... hmm. NO. Y U B SO DUM!? YOU CAN'T EAT A NEGATIVE AMOU-- GRGAERASD!! -_- *applause*");
			popup.displayText("You know wha- I'm not even gonn- no. no... hmm. NO. Y U B SO DUM!? YOU CAN'T EAT A NEGATIVE AMOU-- GRGAERASD!! -_- *applause*");
		}
		else if(tentacleEat - currentMonster.getTentacleAmount() < 0.0)
		{
			//System.out.println("I don't even have that many tentacles... No comment... :|");
			popup.displayText("I don't even have that many... ugh... :|");
		}
		else
		{
			currentMonster.setTentacleAmount(currentMonster.getTentacleAmount() - tentacleEat);
			//System.out.println("OH MY GOD THE PAIN!!! IT HURTS SO MUCH!!! AHHHAHAHAHAHAHAHHA!!!! T.T");
			popup.displayText("OH MY GOD THE PAIN!!! IT HURTS SO MUCH!!! AHHHAHAHAHAHAHAHHA!!!! T.T");
			//System.out.println("Jerry only has " + currentMonster.getTentacleAmount() + "tentacle(s) left");
			popup.displayText("Jerry only has " + currentMonster.getTentacleAmount() + " tentacle(s) left");
		}
		
		popup.displayText(currentMonster.getName() + " says: leave ma bloop alone!");
		int eatBloop = 0;
		String Eat = popup.getResponse("Console: will you eat " + currentMonster.getName() + "'s Bloop? 1 - Yes 2 - No");
		
		while(!isValidInteger(Eat))
		{
			popup.getResponse(currentMonster.getName() + " says: Type an integer. Like any number you learned in first grade.");
			Eat = popup.getResponse("now enter an integer, 1 - yes 2 - no. Stop being dumb");
		}
		eatBloop = Integer.parseInt(Eat);
		
//		if(isValidInteger(Eat))
//		{
//			eatBloop = Integer.parseInt(Eat);
//		}
		
		if(eatBloop == 1)
		{
			currentMonster.setBloop(false);
			popup.displayText("Ouch! That hurts!!! T.T");
			if(currentMonster.getArmCount() == 0 && currentMonster.getEyeCount() == 0 && currentMonster.getTentacleAmount() == 0)
			{
				popup.displayText(currentMonster.getName() + " is now dead.");
				popup.displayText(currentMonster.getName() + "'s ghost: you killed me... Want to play? >:) Now...");
				popup.getResponse("Can you fart?");
				popup.displayText("Cool! Bye. :]");
			}
			else
			{
				popup.displayText(currentMonster.getName() + " still lives!!! :D");
			}
		}
		else
		{
			popup.displayText(currentMonster.getName() + " still lives!!! :D");
		}
		
		myScanner.close();
	}
	
	//Helper methods
	private boolean isValidInteger(String sample)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(sample);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to input an int, " + sample + " is not valid.");
		}
		
		return valid;
	}
	
	private boolean isValidDouble(String sampleDouble)
	{
		boolean valid = false;
		try
		{
			Double.parseDouble(sampleDouble);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("You need to type in a double, " + sampleDouble + " is not a valid answer.");
		}
		return valid;
	}
	
	private boolean isValidBoolean(String sampleBoolean)
	{
		boolean valid = false;
		
		try
		{
			Boolean.parseBoolean(sampleBoolean);
			valid = true;
		}
		catch(NumberFormatException error)
		{
			popup.displayText("Type in a boolean value, " + sampleBoolean + " does not count.");
		}
		
		return valid;
	}
}