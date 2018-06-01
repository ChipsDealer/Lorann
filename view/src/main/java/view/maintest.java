package view;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class maintest {

	public static void main(String[] args) {
		
		int x = 20;
		int y = 12;
		
		ViewFacade view = new ViewFacade();
		int test[][] = {{-1},{-1},{-1},{-1},{-1},{-1}};
		String test2[] = null;
		String test3[][] = new String[y][x];
		for (int i = 0; i < y; i++)
		{
			for (int j = 0; j < x; j++)
			{
				test3[i][j] = "/images/bone.png"; 
			}
		}
		view.createDisplay(test, test2, test3, 0, 11, x, y);
		
		while (true)
		{
			for (int i = 0; i < y; i++)
			{
				for (int j = 0; j < x; j++)
				{
					test3[i][j] = "images/crystal_ball.png"; 
				}
			}
			view.showDisplay(test, test2, test3, 500, 10);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			for (int i = 0; i < y; i++)
			{
				for (int j = 0; j < x; j++)
				{
					test3[i][j] = "images/bone.png"; 
				}
			}
			view.showDisplay(test, test2, test3, 500, 10);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
