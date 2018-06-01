package artView;

import javax.swing.JFrame;
import artController.ArtController;
public class ArtFrame extends JFrame
{
	private ArtPanel appPanel;
	public ArtFrame(ArtController app)
	{
		super();
		appPanel= new ArtPanel(app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1200, 700);
		this.setTitle("DrawingProject");
		this.setContentPane(appPanel);
		this.setVisible(true);
		
	}
}
