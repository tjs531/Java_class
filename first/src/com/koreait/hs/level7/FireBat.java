package com.koreait.hs.level7;

public class FireBat extends Unit implements AttackUnit{
	private int damage;
	
	public FireBat() {
		super("파이어뱃",60);	//이름, 최대피
		damage = 7;
	}
	
	@Override
	public void attack(Unit u) {
		if(u==this) {return;}
		System.out.println("퐈이어");
		u.getDamage(damage);
	}
}
