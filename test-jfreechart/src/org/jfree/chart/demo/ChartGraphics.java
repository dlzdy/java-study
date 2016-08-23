package org.jfree.chart.demo;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGEncodeParam;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.awt.image.BufferedImage;
import java.awt.*;

public class ChartGraphics {

	BufferedImage image;
	int quality = 100;

	void createImage(String fileLocation) {
		try {
			FileOutputStream fos = new FileOutputStream(fileLocation);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);

			JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(image);    
			param.setQuality(1f, false);    
			encoder.setJPEGEncodeParam(param); 
			
//			JPEGEncodeParam param = encoder.getDefaultJPEGEncodeParam(image);
//			quality = Math.max(0, Math.min(quality, 100));
//			param.setQuality((float) quality / 100.0f, false);
//			encoder.setJPEGEncodeParam(param);

			encoder.encode(image);
			bos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void graphicsGeneration(String name, String id, String classname, String imgurl) {

		int imageWidth = 1600;// 图片的宽度

		int imageHeight = 1000;// 图片的高度

		image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.white);
		graphics.fillRect(0, 0, imageWidth, imageHeight);
		graphics.setColor(Color.BLACK);
		graphics.setFont(new Font("黑体", Font.BOLD, 72));
		
		//Font font = graphics.getFont().deriveFont(36f);
		//graphics.setFont(font);
        
		graphics.drawString("姓名 : " + name, 200, 250);
		graphics.drawString("学号 : " + id, 200, 400);
		graphics.drawString("班级 : " + classname, 200, 550);
		// ImageIcon imageIcon = new ImageIcon(imgurl);
		// graphics.drawImage(imageIcon.getImage(), 230, 0, null);

		// 改成这样:
		BufferedImage bimg = null;
		try {
			bimg = javax.imageio.ImageIO.read(new java.io.File(imgurl));
		} catch (Exception e) {
		}

		if (bimg != null)
			graphics.drawImage(bimg, 850, 200, null);
		graphics.dispose();

		createImage("E:\\hehe2.jpg");

	}

	public static void main(String[] args) {
		ChartGraphics cg = new ChartGraphics();
		try {
			cg.graphicsGeneration("张大宇", "学号测试", "班级测试", "E:\\qrtbig700.png");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}