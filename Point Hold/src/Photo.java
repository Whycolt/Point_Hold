

/***********************************************
 * Assignment: Assignment Final - Point Hold
 * Description: Game of Blackjack 
 * Name: Colt Ma
 * Date: 1/18/2016
 * Course: ICS3U1
 **********************************************/
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

@SuppressWarnings("unused")
public class Photo {
	/****************************************************
	 * Variable Dictionary menuImage - Used to store main menu image bulletImage
	 * - Used to store the image of enemy bullets nameImage - Used to store the
	 * name menu image typeImage - Used to store the game type menu image
	 * scoresImage - Used to store the score menu image instImage - Used to
	 * store the instruction menu image vicImage - Used to store the victory
	 * menu image defImage - Used to store the defeat menu image shotImage -
	 * Used to store the image of friendly bullets gameImage - Used to store the
	 * image of the game background playerImage - Used to store the image of the
	 * player shooter1Image - Used to store full health shooter image
	 * shooter2Image - Used to store 2/3 health shooter image shooter3Image -
	 * Used to store 1/3 health shooter image bomb1Image - Used to store full
	 * health shooter image bomb2Image - Used to store 6/7 health shooter image
	 * bomb3Image - Used to store 5/7 health shooter image bomb4Image - Used to
	 * store 4/7 health shooter image bomb5Image - Used to store 3/7 health
	 * shooter image bomb6Image - Used to store 2/7 health shooter image
	 * bomb7Image - Used to store 1/7 health shooter image filePath - Used to
	 * store src file path
	 ****************************************************/
	// initiating variables
	public static BufferedImage menuImage;
	public static BufferedImage bulletImage;
	public static BufferedImage nameImage;
	public static BufferedImage typeImage;
	public static BufferedImage scoreImage;
	public static BufferedImage instImage;
	public static BufferedImage vicImage;
	public static BufferedImage defImage;
	public static BufferedImage shotImage;
	public static BufferedImage gameImage;
	public static BufferedImage playerImage;
	public static BufferedImage shooter1Image;
	public static BufferedImage shooter2Image;
	public static BufferedImage shooter3Image;
	public static BufferedImage bomb1Image;
	public static BufferedImage bomb2Image;
	public static BufferedImage bomb3Image;
	public static BufferedImage bomb4Image;
	public static BufferedImage bomb5Image;
	public static BufferedImage bomb6Image;
	public static BufferedImage bomb7Image;
	
	public Photo(){
		
	}
	
	public void loadAll() {
		try {
			// Storing images in variables
			vicImage = ImageIO.read(getClass().getResourceAsStream("vicImage.png"));
			defImage = ImageIO.read(getClass().getResourceAsStream("defImage.png"));
			typeImage = ImageIO.read(getClass().getResourceAsStream("typeImage.png"));
			nameImage = ImageIO.read(getClass().getResourceAsStream("nameImage.png"));
			menuImage = ImageIO.read(getClass().getResourceAsStream("menuImage.png"));
			gameImage = ImageIO.read(getClass().getResourceAsStream("gameImage.png"));
			shooter1Image = ImageIO.read(getClass().getResourceAsStream("shooter1Image.png"));
			shooter2Image = ImageIO.read(getClass().getResourceAsStream("shooter2Image.png"));
			shooter3Image = ImageIO.read(getClass().getResourceAsStream("shooter3Image.png"));
			bulletImage = ImageIO.read(getClass().getResourceAsStream("bulletImage.png"));
			bomb1Image = ImageIO.read(getClass().getResourceAsStream("bomb1Image.png"));
			bomb2Image = ImageIO.read(getClass().getResourceAsStream("bomb2Image.png"));
			bomb3Image = ImageIO.read(getClass().getResourceAsStream("bomb3Image.png"));
			bomb4Image = ImageIO.read(getClass().getResourceAsStream("bomb4Image.png"));
			bomb5Image = ImageIO.read(getClass().getResourceAsStream("bomb5Image.png"));
			bomb6Image = ImageIO.read(getClass().getResourceAsStream("bomb6Image.png"));
			bomb7Image = ImageIO.read(getClass().getResourceAsStream("bomb7Image.png"));
			shotImage = ImageIO.read(getClass().getResourceAsStream("shotImage.png"));
			playerImage = ImageIO.read(getClass().getResourceAsStream("playerImage.png"));
			scoreImage = ImageIO.read(getClass().getResourceAsStream("scoreImage.png"));
			instImage = ImageIO.read(getClass().getResourceAsStream("instImage.png"));

		} catch (IOException e) {
		} // end of catch exception

	}// end of loadAll
}// end of class Test1Photo
