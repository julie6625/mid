package com.fju.mid;

import java.util.Random;

public class DiceRoller {

	public static void main(String[] args) {
		
		Random r = new Random();
		int n1 = r.nextInt(6)+1;
		int n2 = r.nextInt(6)+1;
		int n3 = r.nextInt(6)+1;
		for(int i = 1; i<6; i++){
			boolean dice = true;{
				for (int a = 1 ; a<=10;a++){
					if(n1==n2){
						System.out.print(n1+" ");
						System.out.print(n2+" ");
						System.out.println(n3+" ");
						dice = false;
						break;
					}	
				}
			}
			if(dice){
				System.out.println("stop");
			}
			
		}
	}

}
