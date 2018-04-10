package artView;
import javax.swing.*;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

import artController.ArtController;
public class ShapeCanvas extends JPanel
{
	
	private ArrayList<Polygon> triangleList;
	private ArrayList<Polygon> polygonList;
	private ArrayList<Ellipse2D> ellipseList;
	private ArrayList<Rectangle> rectangleList;
	private ArtController app;

	private BufferedImage canvasImage;

		public void ShapeCanvas(ArtController app)
		{
			
		}
		public void addShape(Shape current)
		{
			
		}
		public void clear()
		{
			
		}
		public void changeBackground()
		{
			
		}
		public void save ()
		{
			
		}
		public Color randomColor()
		{
			return null;
		}
		private void updateImage()
		{
			
		}
		protected void paintComponent(Graphics graphics)
		{
			
		}
	
}
