package monster.model;

public class MarshmallowMonster
{
	//Declaration section of data members
	
	private String name;
	private int eyeCount;
	private int armCount;
	private double tentacleAmount;
	private boolean hasBloop;
	
	
	public MarshmallowMonster()
	{
		//initializes everything to 0, false, or null
	}
	
	public MarshmallowMonster(String name, int eyeCount, int armCount, double tentacleAmount, boolean hasBloop)
	{
		this.name = name;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tentacleAmount = tentacleAmount;
		this.hasBloop = hasBloop;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setEyeCount(int eyeCount)
	{
		this.eyeCount = eyeCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public void setArmCount(int armCount)
	{
		this.armCount = armCount;
	}
	
	public int getArmCount()
	{
		return armCount;
	}
	
	public void setTentacleAmount(double tentacleAmount)
	{
		this.tentacleAmount = tentacleAmount;
	}
	
	public double getTentacleAmount()
	{
		return tentacleAmount;
	}
	
	public void setBloop(boolean hasBloop)
	{
		this.hasBloop = hasBloop;
	}
	
	public boolean getBloop()
	{
		return hasBloop;
	}
	
	public String toString()
	{
		String description = "I am a monster, my name is " + name + " I have " + eyeCount + " eyes and only " ;
		description +=  tentacleAmount + " tentacles, but I have " + armCount + " arms! It is also " + hasBloop + " I have a bloop";
		description += " My name is " + name + " because I was a pawn in chess and was named by my king, Calvin Harris.";
		description += " I was slain in battle by the opposing King Yael Amaya and have come back to serve my King once more.";
		return description;
	}
}
