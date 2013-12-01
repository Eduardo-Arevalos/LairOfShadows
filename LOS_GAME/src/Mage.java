public class Mage extends Player {
	protected int Mana;
	
	public Mage(){
		this.Health=110;
		this.AttackForce=20;
		this.Defense=10;
		this.Mana=200; //place holder
		this.Level=0;
		this.XP=0;
	}
	
	public Mage(Mage m){
		Health=m.Health;
		AttackForce=m.AttackForce;
		Defense=m.Defense;
		Mana=m.Mana;
		Level=m.Level;
		XP=m.XP;
	}
	
	//used to create bot with randomly generated values comparable to our player
	public Mage(int h, int af, int d, int m)
	{
		this.Health = h;
		this.AttackForce = af;
		this.Defense = d;
		this.Mana = m;
	}
	
	public void adjMana(int m){this.Mana += m;}
	public void setMana(int m){this.Mana = m;}
	public int getMana(){return this.Mana;}
	public int getSpecialStat(){return getMana();};
	
	public void levelUp()
	{
		//If the layer has leveled, increase their attributes by 25%
		int newHealth = this.getHealth();
		newHealth *= 1.25;
		int newDefense = this.getDefense();
		newDefense*=1.25;
		int newAF = this.getAttackForce();
		newAF *=1.25;
		int newMana = this.getMana();
		newMana *= 1.25;
		
		this.setHealth(newHealth);
		this.setDefense(newDefense);
		this.setAttackForce(newAF);
		this.setMana(newMana);
	}
}