package model;


public abstract class HUD {
	
	private static int mapX;
	private static int mapY;
	private static int score = 0;
	private static int lifes = 11;
	private static boolean gameRunning = true;
	

	public static void setScore(final int score) {
		HUD.score = score;
	}
	
	public static int getScore() {
		return HUD.score;
	}
	
	
	public static void setLifes(final int lifes) {
		HUD.lifes=lifes;
	}
	
	public static int getLifes() {
		return HUD.lifes;
	}
	
	public static void addScore() {
		HUD.score = HUD.score + 200;
	}
	
	public static void lessScore() {
		HUD.score = HUD.score-200;
	}
	
	public static void addLifes() {
		HUD.lifes=HUD.lifes+1;
	}
	
	public static void lessLifes() {
		HUD.lifes=HUD.lifes-1;
	}

	public static boolean isGameRunning() {
		return gameRunning;
	}

	public static void setGameRunning(boolean gameRunning) {
		HUD.gameRunning = gameRunning;
	}

	public static int getMapX() {
		return mapX;
	}

	public static void setMapX(int mapX) {
		HUD.mapX = mapX;
	}

	public static int getMapY() {
		return mapY;
	}

	public static void setMapY(int mapY) {
		HUD.mapY = mapY;
	}
}
