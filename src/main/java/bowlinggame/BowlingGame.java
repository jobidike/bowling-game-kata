package bowlinggame;

public class BowlingGame {

	private int currentRoll = 0;
	private int [] rolls = new int[21];

	
	
	
	public void roll(int pinsDown) {
		rolls[currentRoll++] = pinsDown;
	}
	

	public int getScore() {
		int score = 0;
		int rollIndex = 0;
		for(int frameIndex = 0; frameIndex < 10; frameIndex++) {
			if (isSpare(rollIndex)) {
				score += getSpareScore(rollIndex);
			}else {
				score += getNormalScore(rollIndex);
			}
			rollIndex += 2;
		}
		return score;
	}

	private int getNormalScore(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex + 1];
	}

	private int getSpareScore(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex + 1] + rolls[rollIndex + 2];
	}

	private boolean isSpare(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex + 1] == 10;
	}


//	public void roll(int pinsDown) {
//		score += pinsDown;
//	}
	
	

}
