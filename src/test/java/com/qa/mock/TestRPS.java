
package com.qa.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Random;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import rps.RockPaperScissors;
import rps.validRPSMoves;

@ExtendWith(MockitoExtension.class) // enables mockito for these tests
public class TestRPS {

	@Mock // create the mock Random object
	private Random rand;

	@InjectMocks // inserts the mock into the Simulator
	private RockPaperScissors rpsSim;

	@Test
	void testRockvsRock() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.ROCK), "DRAW");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testRockvsPaper() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.ROCK), "LOSS");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testRockvsScissors() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.ROCK), "WIN");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testPapervsRock() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.PAPER), "WIN");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testPapervsPaper() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.PAPER), "DRAW");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testPapervsScissors() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.PAPER), "LOSS");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testScissorsvsRock() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(0);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.SCISSORS), "LOSS");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testScissorsvsPaper() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(1);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.SCISSORS), "WIN");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}

	@Test
	void testScissorsvsScissors() {
		Mockito.when(this.rand.nextInt(3)).thenReturn(2);
		for (int i = 0; i < 10; i++)
			assertEquals(this.rpsSim.rpsFight(validRPSMoves.SCISSORS), "DRAW");

		Mockito.verify(this.rand, Mockito.times(10)).nextInt(3);
	}
}