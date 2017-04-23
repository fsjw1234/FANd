package pers.cheer2017.fand0422;

import javax.swing.JFrame;

public class JFrameTest {
	public static void main(String[] args){
		new DemoFrame();
	}
}
class DemoFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DemoFrame(){
		this.setTitle("hello world");
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}