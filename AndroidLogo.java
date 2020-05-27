import java.awt.*;
public class AndroidLogo extends java.applet.Applet{

	public void paint(Graphics g) {
		// TODO Auto-generated method stub

		g.setColor(Color.green);
		g.drawArc(50, 25, 100, 100, 0, 180);
		g.drawLine(50, 75, 150, 75);
		g.drawRect(50, 80, 100, 70);
		g.drawLine(45, 80, 45, 150);
		g.drawLine(25, 80, 25, 150);
		g.drawLine(155, 80, 155, 150);
		g.drawLine(175, 80, 175, 150);
		g.drawArc(25, 65, 20, 40, 0, 180);
		g.drawArc(155, 65, 20, 40, 0, 180);
		g.drawArc(25, 125, 20, 40, 0, -180);
		g.drawArc(155, 125, 20, 40, 0, -180);
		g.drawRect(65, 150, 25, 40);
		g.drawRect(110, 150, 25, 40);
		g.drawArc(70, 45, 15, 15, 0, 360);
		g.drawArc(115, 45, 15, 15, 0, 360);
		g.drawLine(65, 5, 80, 30);
		g.drawLine(125, 30, 140, 5);
		
	}

}
