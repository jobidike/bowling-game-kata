package bowlinggame;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	
	
	BowlingGame game;
	
	@Before
	public void initialize() {
		game = new BowlingGame();
	}
	@Test
	public void canRollAGutterGame() {
		game = new BowlingGame();
		rollMany(0,20);
		assertEquals(0, game.getScore());	
	}
	@Test
	public void canCreateAGameWithAllOnes() {
		game = new BowlingGame();
		rollMany(1,20);
		assertEquals(20, game.getScore());
	}
	@Test
	public void shouldBeAbleToRollASpareGame() {
		game.roll(5);
		game.roll(5);
		game.roll(3);
		rollMany(0,17);
		assertEquals(16, game.getScore());
		
	}


	
	
	private void rollMany(int pinsDown, int rolls) {
		for(int i = 0; i < 20; i++) {
			game.roll(pinsDown);
		}
	}
	
//	@Test
//	public void canCreateAGame() {
//		BowlingGame game = new BowlingGame();
//	}
//	@Test
//	public void canRollAGutterGame() {
//		BowlingGame game = new BowlingGame();
//		for(int i=0; i < 20; i++) {
//			game.roll(0);
//		}
//		assertEquals(0, game.getScore());
//		
//	}
//	
//	@Test
//	public void canCreateAGameWithAllOnes() {
//		BowlingGame game = new BowlingGame();
//		for(int i=0; i < 20; i++) {
//			game.roll(1);
//		}
//		assertEquals(20, game.getScore());
//	}
	

}
