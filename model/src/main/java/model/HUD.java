package model;


public abstract class HUD {
	
	protected int score = 0;
	protected int lifes = 11;
	

	private void setScore(final int score) {
		this.score = score;
	}
	
	public final int getScore() {
		return this.score;
	}
	
	
	private void setLifes(final int lifes) {
		this.lifes=lifes;
	}
	
	public final int getLifes() {
		return this.lifes;
	}
	
	private void addScore(final int score) {
		this.score = score + 200;
	}
	
	private void lessScore(final int score) {
		this.score = score-200;
	}
	
	private void addLifes(final int lifes) {
		this.lifes=lifes+1;
	}
	
	private void lessLifes(final int lifes) {
		this.lifes=lifes-1;
	}
}
