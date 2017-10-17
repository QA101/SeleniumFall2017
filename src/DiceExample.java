package src;

import java.util.Random;

public class DiceExample {

	static final int ROLLS = 1000;
	static final int NUM_SIDES = 20;
	int[] dice = new int[NUM_SIDES];
	Random rand = new Random(System.currentTimeMillis());
	
	public static void main(String[] args) {
		DiceExample program = new DiceExample();
		for(int i =0; i< ROLLS; i++) {
			program.dice[program.Roll()] +=1;
		}
		program.PrintOutput();
	}
	
	public int Roll() {
		return rand.nextInt(NUM_SIDES);
	}
	
	public void PrintOutput() {
		for(int i = 0; i<dice.length; i++) {
			System.out.printf("SIDE: %d TIMES: %d\n", i+1, dice[i]);
		}
	}
}
