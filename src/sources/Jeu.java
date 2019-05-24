package sources;

import java.io.IOException;

import javax.swing.ImageIcon;

public class Jeu {
	
	private ImageIcon[] images;
	
	public Jeu() throws IOException 
	{
		images[0] = ResourceUtility.loadImage("images/vide.png");
		images[1] = ResourceUtility.loadImage("images/drapeau.png");
		images[2] = ResourceUtility.loadImage("images/mine.png");
		images[3] = ResourceUtility.loadImage("images/surprise.png");
		
	}
	
	public ImageIcon getImgVide()
	{
		return images[0];
	}
	
	public ImageIcon getImgDrapeau()
	{
		return images[1];
	}
	public ImageIcon getImgMine()
	{
		return images[2];
	}
	public ImageIcon getImgSurprise()
	{
		return images[3];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
