package SamHour15;

import java.awt.*;

import javax.swing.*;

public class MainFrame extends JFrame {

	public MainFrame() {
		super("Main Frame");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flo = new FlowLayout();
		setLayout(flo);
		JButton button = new JButton("Loi");
		add(button);
		setVisible(true);
	}
	public static void main(String[] args) {
		MainFrame mf = new MainFrame();
	}
}
