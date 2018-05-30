package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel{

	private String[] motionMapImages;
	private int[][] motionMapDimension;
	private String[][] motionlessMap;
	private int score;
	private int life;
	private int mapWidth;
	private int mapLength;
	
	public Panel(int[][] motionMapDimension,String[] motionMapImages, String[][] motionlessMap, int score, int life, int width, int length)
	{
		this.motionlessMap = motionlessMap;
		this.motionMapDimension = motionMapDimension;
		this.motionMapImages = motionMapImages;
		this.score = score;
		this.life = life;
		this.mapWidth = width;
		this.mapLength = length;
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int[][] getmotionMapDimension() {
		return motionMapDimension;
	}

	public void setmotionMapDimension(int[][] motionMap) {
		this.motionMapDimension = motionMap;
	}

	public String[][] getMotionlessMap() {
		return motionlessMap;
	}

	public void setMotionlessMap(String[][] motionlessMap) {
		this.motionlessMap = motionlessMap;
	}
	
	public String[] getMotionMapImages() {
		return motionMapImages;
	}

	public void setMotionMapImages(String[] motionMapImages) {
		this.motionMapImages = motionMapImages;
	}
	
	public void paintComponent(Graphics g)
	{
		/*
		Image img;
		//Load motionlessMap
		for (int i = 0; i < this.mapLength; i++)
		{
			for (int j = 0; j < this.mapWidth; j++)
			{
				try {
				      img = ImageIO.read(new File(this.motionlessMap[i][j]));
				      g.drawImage(img, j*32, i*32, this);
				    } catch (IOException e) {
				      e.printStackTrace();
				    } 
			}
		}
		
		//Load motionMap
		for (int i = 0; i < 5; i++)
		{
			try {
			      img = ImageIO.read(new File(this.motionMapImages[i]));
			      g.drawImage(img, this.motionMapDimension[i][1], this.motionMapDimension[i][2], this);
			    } catch (IOException e) {
			      e.printStackTrace();
			    } 
		}
		*/
		//loadHud (not necessary but it's better for having more fun)
	    g.setColor(Color.red);
	    g.drawString("Lifes : " + this.life + "  -  Score : " + this.score, 10, (this.mapLength * 32));
	    
	}

}
