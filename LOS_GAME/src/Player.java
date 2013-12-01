//This document requires comments
public class Player {
	protected int Health=0;
	protected int AttackForce=0;
	protected int Defense=0;
	protected int XP=0;
	protected int Level=0;
	protected Weapon playerWeapon;
	
	protected boolean ranAway = false;
	
	public Player(){};
	
	//Useful for creating custom character and/or Boss characters
	public Player(int h, int aF, int d, int lvl){
		this.Health=h;
		this.AttackForce=aF;
		this.Defense=d;
		this.Level=lvl;
	}
	
	//Set methods to adjust player stats
	public void adjHealth(int h){this.Health+=h;}
	public void adjAttackForce(int a){this.AttackForce+=a;}
	public void adjDefense(int d){this.Defense+=d;}
	public void incXP(int exp){this.XP+=exp;}
	public void adjRanAway(boolean bool){this.ranAway = bool;};
	
	public void setHealth(int h){this.Health = h;}
	public void setAttackForce(int a){this.AttackForce = a;}
	public void setDefense(int d){this.Defense = d;}
	
	//Look more into this
	public void calculateLevel(){this.Level=(this.XP/(20));}
		
	//Used for game events
	public int getHealth(){return new Integer(Health);}
	public int getAttackForce(){return new Integer(AttackForce);}
	public int getDefense(){return new Integer(Defense);}
	public int getXP(){return new Integer(XP);}
	public int getLevel(){return new Integer(Level);}
	public int getSpecialStat(){return 0;};
	
	public void levelUp(){}

 	public void addWeapon(Weapon x){
		playerWeapon=new Weapon(x);
		this.Health+=x.gethealthStat();
		this.AttackForce+=x.getafStat();
		this.Defense+=x.getdefenseStat();
	}
	public void removeWeapon(Weapon x){
	playerWeapon=null;
	Health-=x.gethealthStat();
	AttackForce-=x.getafStat();
	Defense-=x.getdefenseStat();
	}
	
}