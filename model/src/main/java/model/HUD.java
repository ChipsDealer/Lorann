package model;

/**
 * <h1>The Class HUD provides a class to .</h1>
 *
 * @author Nathan Beer nathan.beer@viacesi.fr, Léo Thommes leo.thommes@cesi.fr, Frost
 * @version 1.0
 * @since jdk1.8.0_171
 * @see HUD
 */
public abstract class HUD {
	/*
	 * The width of the map
	 */
	private static int mapX;
	/*
	 * The length of the map
	 */
	private static int mapY;
	/*
	 * The score of the game
	 */
	private static int score = 0;
	/*
	 * The number of Lorann life
	 */
	private static int lifes = 11;
	/*
	 * The status of the game
	 */
	private static boolean gameRunning = true;
	
	/*
	 * The setter of the game score
	 * @param int
	 */
	public static void setScore(final int score) {
		HUD.score = score;
	}
	
	/*
	 * The getter of the game score
	 * @return int
	 */
	public static int getScore() {
		return HUD.score;
	}
	
	/*
	 * The setter of the Lorann lifes
	 * @param int
	 */
	public static void setLifes(final int lifes) {
		HUD.lifes=lifes;
	}
	
	/*
	 * The getter of the Lorann lifes
	 * @return int
	 */
	public static int getLifes() {
		return HUD.lifes;
	}
	
	/*
	 * Add 200 points to the score
	 * No parameters
	 */
	public static void addScore() {
		HUD.score = HUD.score + 200;
	}
	
	/*
	 * Remove 200 points to the score
	 * No parameters
	 */
	public static void lessScore() {
		HUD.score = HUD.score-200;
	}
	
	/*
	 * Add one more life to Lorann
	 * No parameters
	 */
	public static void addLifes() {
		HUD.lifes=HUD.lifes+1;
	}
	
	/*
	 * Remove one life to Lorann
	 * No parameters
	 */
	public static void lessLifes() {
		HUD.lifes=HUD.lifes-1;
	}

	/*
	 * Return the game status
	 * if gameRunning = true, then the game is still running
	 * @return boolean
	 * No parameters
	 */
	public static boolean isGameRunning() {
		return gameRunning;
	}

	/*
	 * Set the game status
	 * @param boolean
	 */
	public static void setGameRunning(boolean gameRunning) {
		HUD.gameRunning = gameRunning;
	}

	/*
	 * The getter of the width of the Map
	 * @return int
	 */
	public static int getMapX() {
		return mapX;
	}

	/*
	 * The setter of the width of the Map
	 * @param int
	 */
	public static void setMapX(int mapX) {
		HUD.mapX = mapX;
	}

	/*
	 * The getter of the length of the Map
	 * @return int
	 */
	public static int getMapY() {
		return mapY;
	}

	/*
	 *  The setter of the length of the Map
	 *  @param int
	 */
	public static void setMapY(int mapY) {
		HUD.mapY = mapY;
	}
}
