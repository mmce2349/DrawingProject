package artController;
import java.awt.Component;
import java.io.IOException;

import javax.swing.JOptionPane;
import artView.*;
public class ArtController 
{
	private ArtFrame appFrame;
	public ArtController()
	{
		appFrame = new ArtFrame(null);
	}
	public void start()
	{
		
		JOptionPane.showMessageDialog(appFrame, "Welcome to art!");
	}
	public void handleErrors(IOException error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	public Component getFrame() {
		// TODO Auto-generated method stub
		return null;
	}
}
