package project;

//import java.awt.Toolkit;
import javax.swing.JFrame;

public class mainFrame extends JFrame{

	private static final long serialVersionUID = 1L;

	public mainFrame()
	{
		//Toolkit kit = Toolkit.getDefaultToolkit();
		setSize(1280, 720);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������ ��ٻ�� �ùķ��̼�");
		setVisible(true);
		setResizable(false); // ȭ�� ũ�� ���� ���� �Ұ�
		setLocationRelativeTo(null); // ȭ�� ���߾ӿ� ����
		//Image gameIcon - kit.getImage("icon.gif");
		//setIconImage(gameIcon);
	}
	
	public void exitFrame()
	{
		setVisible(false);
	}
	
}
