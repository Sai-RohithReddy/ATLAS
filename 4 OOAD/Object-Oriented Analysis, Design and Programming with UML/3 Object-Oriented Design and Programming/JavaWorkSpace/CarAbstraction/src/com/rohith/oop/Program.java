package com.rohith.oop;

public class Program {
	private static Player player = new Player();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FireHydrant fh = new FireHydrant();
		fh.setName("FireHydrant");
		fh.setDamage(100);
		
		GameObject go = fh;
		go.setName("FireHydrant - 2");
		
		System.out.println(fh.getName());
		
		DoCollision(fh);
		DoCollision(new GameObject());
	}
	private static void DoCollision(GameObject go) {
		go.onCollision(player);
	}
}
