package project;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_Normal_2 extends JPanel{

private static final long serialVersionUID = 1L;

	

	public static boolean isworked=false;


	BufferedImage backGround;

	File file1=new File("./src/images/���ǽǺ���.jpg");

	File file2=new File("./src/images/���ǽǺ���_C.jpg");

	File file3=new File("./src/images/���ǽǾ�.jpg");

	File file4=new File("./src/images/���ǽǾ�_C.jpg");

	File file5=new File("./src/images/�����Թ�.jpg");

	File file6=new File("./src/images/�����Թ�_C.jpg");

	File file7=new File("./src/images/ķ�۽�.jpg");

	File file8=new File("./src/images/ķ�۽�_C.jpg");

	private ImageIcon select1_1=new ImageIcon(Main.class.getResource("../images/������2-1.png"));

	private ImageIcon selectc1_1=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-1.png"));

	private ImageIcon select1_2=new ImageIcon(Main.class.getResource("../images/������2-2.png"));

	private ImageIcon selectc1_2=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-2.png"));

	private ImageIcon select1_3=new ImageIcon(Main.class.getResource("../images/������2-3.png"));

	private ImageIcon selectc1_3=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-3.png"));

	private ImageIcon select1_1_1=new ImageIcon(Main.class.getResource("../images/������2-1-1.png"));

	private ImageIcon selectc1_1_1=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-1-1.png"));

	private ImageIcon select1_1_2=new ImageIcon(Main.class.getResource("../images/������2-1-2.png"));

	private ImageIcon selectc1_1_2=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-1-2.png"));

	private ImageIcon select1_1_3=new ImageIcon(Main.class.getResource("../images/������2-1-3.png"));

	private ImageIcon selectc1_1_3=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-1-3.png"));

	private ImageIcon select1_2_1=new ImageIcon(Main.class.getResource("../images/������2-2-1.png"));

	private ImageIcon selectc1_2_1=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-2-1.png"));

	private ImageIcon select1_2_2=new ImageIcon(Main.class.getResource("../images/������2-2-2.png"));

	private ImageIcon selectc1_2_2=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-2-2.png"));

	private ImageIcon select1_2_3=new ImageIcon(Main.class.getResource("../images/������2-2-3.png"));

	private ImageIcon selectc1_2_3=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-2-3.png"));

	private ImageIcon select1_3_1=new ImageIcon(Main.class.getResource("../images/������2-3-1.png"));

	private ImageIcon selectc1_3_1=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-3-1.png"));

	private ImageIcon select1_3_2=new ImageIcon(Main.class.getResource("../images/������2-3-2.png"));

	private ImageIcon selectc1_3_2=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-3-2.png"));

	private ImageIcon select1_3_3=new ImageIcon(Main.class.getResource("../images/������2-3-3.png"));

	private ImageIcon selectc1_3_3=new ImageIcon(Main.class.getResource("../images/������Ŭ��2-3-3.png"));

	private ImageIcon nextButtonBasicImage=new ImageIcon(Main.class.getResource("../images/��ư1.png"));

	private ImageIcon nextButtonEnteredImage=new ImageIcon(Main.class.getResource("../images/��ư1_Ŭ��.png"));

	private ImageIcon up=new ImageIcon(Main.class.getResource("../images/ȣ���� ���.png"));

	private ImageIcon down=new ImageIcon(Main.class.getResource("../images/ȣ���� �϶�.png"));

	private ImageIcon maintain=new ImageIcon(Main.class.getResource("../images/ȣ���� ����.png"));

		

	private JButton nextButton=new JButton(nextButtonBasicImage);

	private JButton selectButton1_1=new JButton(select1_1);

	private JButton selectButton1_2=new JButton(select1_2);

	private JButton selectButton1_3=new JButton(select1_3);

	private JButton selectButton1_1_1=new JButton(select1_1_1);

	private JButton selectButton1_1_2=new JButton(select1_1_2);

	private JButton selectButton1_1_3=new JButton(select1_1_3);

	private JButton selectButton1_2_1=new JButton(select1_2_1);

	private JButton selectButton1_2_2=new JButton(select1_2_2);

	private JButton selectButton1_2_3=new JButton(select1_2_3);

	private JButton selectButton1_3_1=new JButton(select1_3_1);

	private JButton selectButton1_3_2=new JButton(select1_3_2);

	private JButton selectButton1_3_3=new JButton(select1_3_3);

	private JButton upImage=new JButton(up);

	private JButton downImage=new JButton(down);

	private JButton maintainImage=new JButton(maintain);

	

	private JLabel professor=new JLabel("������ C");

	private JLabel situation1=new JLabel("���� ���� �����Բ��� ��ݾ��� ������ �ϼ̴�");

	String[] dialogue=ProfessorDialogue.getDialogue_C();

	

	JLabel d13=new JLabel(dialogue[13]);

	JLabel d14=new JLabel(dialogue[14]);

	JLabel d15=new JLabel(dialogue[15]);

	JLabel d16=new JLabel(dialogue[16]);

	JLabel d17=new JLabel(dialogue[17]);

	JLabel d18=new JLabel(dialogue[18]);

	JLabel d19=new JLabel(dialogue[19]);

	JLabel d20=new JLabel(dialogue[20]);

	JLabel d21=new JLabel(dialogue[21]);

	JLabel d22=new JLabel(dialogue[22]);

	JLabel d23=new JLabel(dialogue[23]);

	JLabel d24=new JLabel(dialogue[24]);

	JLabel d25=new JLabel(dialogue[25]);

	

	public C_Normal_2()

	{

		try {

			backGround=ImageIO.read(file3);

		}catch(IOException ex) {

			ex.printStackTrace();

		}

		repaint();

		

		

		/*setTitle("�����Բ� ��ٻ���ϴ� �ùķ��̼� ����");

		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);

		setResizable(false);

		setLocationRelativeTo(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);*/

		setLayout(null);

		

		situation1.setBounds(30, 480, 1200, 100);

		super.add(situation1);

		situation1.setVisible(true);

		situation1.setFont(new Font(null, Font.PLAIN, 40));

		

		d13.setBounds(30, 480, 1200, 100);

		super.add(d13);

		d13.setVisible(false);

		d13.setFont(new Font(null, Font.PLAIN, 40));

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(false);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		upImage.setBounds(160, 100, 100, 250);
		upImage.setBorderPainted(false);
		upImage.setContentAreaFilled(false);
		upImage.setFocusPainted(false);
		super.add(upImage);
		upImage.setVisible(false);
		downImage.setBounds(160, 100, 100, 250);
		downImage.setBorderPainted(false);
		downImage.setContentAreaFilled(false);
		downImage.setFocusPainted(false);
		super.add(downImage);
		downImage.setVisible(false);
		maintainImage.setBounds(160, 100, 100, 250);
		maintainImage.setBorderPainted(false);
		maintainImage.setContentAreaFilled(false);
		maintainImage.setFocusPainted(false);
		super.add(maintainImage);
		maintainImage.setVisible(false);

 

		nextButton.setBounds(1000, 400, 300, 60);

		nextButton.setBorderPainted(false);

		nextButton.setContentAreaFilled(false);

		nextButton.setFocusPainted(false);

		nextButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				nextButton.setIcon(nextButtonEnteredImage);

				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				nextButton.setIcon(nextButtonBasicImage);

				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				

				try {

					backGround=ImageIO.read(file4);//����2�� �ٲ�鼭 ��ȭ �߻�

				}catch(IOException ex) {

					ex.printStackTrace();

				}

				repaint();	

				situation1.setVisible(false);

				d13.setVisible(true);

				repaint();

				professor.setVisible(true);

				

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

						Select1();

						repaint();	

					}

				});

				add(nextButton);

				repaint();

				

			}

		});

		add(nextButton);

		repaint();

		

	}

	

	public void Select1()//ó�������� ����

	{

		professor.setVisible(false);

		selectButton1_1.setBounds(820, 325, 500, 100);

		selectButton1_1.setBorderPainted(false);

		selectButton1_1.setContentAreaFilled(false);

		selectButton1_1.setFocusPainted(false);

		selectButton1_1.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_1.setIcon(selectc1_1);

				selectButton1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_1.setIcon(select1_1);

				selectButton1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				selectButton1_1.setVisible(false);

				selectButton1_2.setVisible(false);

				selectButton1_3.setVisible(false);

 

				repaint();

				

				Selected1();

			}

		});

		add(selectButton1_1);

		

		selectButton1_2.setBounds(820, 450, 500, 100);

		selectButton1_2.setBorderPainted(false);

		selectButton1_2.setContentAreaFilled(false);

		selectButton1_2.setFocusPainted(false);

		selectButton1_2.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_2.setIcon(selectc1_2);

				selectButton1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_2.setIcon(select1_2);

				selectButton1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				selectButton1_1.setVisible(false);

				selectButton1_2.setVisible(false);

				selectButton1_3.setVisible(false);

 

				repaint();

				

				Selected2();

			}

		});

		add(selectButton1_2);

		

		selectButton1_3.setBounds(820, 575, 500, 100);

		selectButton1_3.setBorderPainted(false);

		selectButton1_3.setContentAreaFilled(false);

		selectButton1_3.setFocusPainted(false);

		selectButton1_3.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_3.setIcon(selectc1_3);

				selectButton1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_3.setIcon(select1_3);

				selectButton1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				selectButton1_1.setVisible(false);

				selectButton1_2.setVisible(false);

				selectButton1_3.setVisible(false);

 

				repaint();

				

				Selected3();

			}

		});

		add(selectButton1_3);

		

	}

	

	public void Selected1()//������ �����

	{

		d13.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d14.setBounds(30, 480, 1200, 100);

		super.add(d14);

		d14.setVisible(true);

		d14.setFont(new Font(null, Font.PLAIN, 40));

		

		upImage.setVisible(true);

		GoodFeeling.teacher3FeelUp();

		

		nextButton.setVisible(true);

		nextButton.setBounds(1000, 400, 300, 60);

		nextButton.setBorderPainted(false);

		nextButton.setContentAreaFilled(false);

		nextButton.setFocusPainted(false);

		nextButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				nextButton.setIcon(nextButtonEnteredImage);

				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				nextButton.setIcon(nextButtonBasicImage);

				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				nextButton.setVisible(false);

 

				repaint();

				Select1_1();

			}

		});

		add(nextButton);

	}

	

	public void Selected2()//������ �����

	{

		d13.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d15.setBounds(30, 480, 1200, 100);

		super.add(d15);

		d15.setVisible(true);

		d15.setFont(new Font(null, Font.PLAIN, 40));

		

		downImage.setVisible(true);

		GoodFeeling.teacher3FeelDown();

		

		nextButton.setVisible(true);

		nextButton.setBounds(1000, 400, 300, 60);

		nextButton.setBorderPainted(false);

		nextButton.setContentAreaFilled(false);

		nextButton.setFocusPainted(false);

		nextButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				nextButton.setIcon(nextButtonEnteredImage);

				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				nextButton.setIcon(nextButtonBasicImage);

				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				nextButton.setVisible(false);

 

				repaint();

				Select1_2();

			}

		});

		add(nextButton);

	}

	

	public void Selected3()//������ �����

	{

		d13.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d16.setBounds(30, 480, 1200, 100);

		super.add(d16);

		d16.setVisible(true);

		d16.setFont(new Font(null, Font.PLAIN, 40));

		

		maintainImage.setVisible(true);

		GoodFeeling.teacher3FeelSame();

		

		nextButton.setVisible(true);

		nextButton.setBounds(1000, 400, 300, 60);

		nextButton.setBorderPainted(false);

		nextButton.setContentAreaFilled(false);

		nextButton.setFocusPainted(false);

		nextButton.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				nextButton.setIcon(nextButtonEnteredImage);

				nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				nextButton.setIcon(nextButtonBasicImage);

				nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				nextButton.setVisible(false);

 

				repaint();

				Select1_3();

			}

		});

		add(nextButton);

	}

	

	public void Select1_1()//�ι�° ������ ����

	{

		d13.setVisible(false);

		

		downImage.setVisible(false);

		upImage.setVisible(false);

		maintainImage.setVisible(false);

 

		professor.setVisible(false);

		selectButton1_1_1.setVisible(true);

		selectButton1_1_1.setBounds(820, 325, 500, 100);

		selectButton1_1_1.setBorderPainted(false);

		selectButton1_1_1.setContentAreaFilled(false);

		selectButton1_1_1.setFocusPainted(false);

		selectButton1_1_1.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_1_1.setIcon(selectc1_1_1);

				selectButton1_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_1_1.setIcon(select1_1_1);

				selectButton1_1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last1();

				maintainImage.setVisible(true);

 

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

 

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_1_1);

		

		selectButton1_1_2.setVisible(true);

		selectButton1_1_2.setBounds(820, 450, 500, 100);

		selectButton1_1_2.setBorderPainted(false);

		selectButton1_1_2.setContentAreaFilled(false);

		selectButton1_1_2.setFocusPainted(false);

		selectButton1_1_2.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_1_2.setIcon(selectc1_1_2);

				selectButton1_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_1_2.setIcon(select1_1_2);

				selectButton1_1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last2();

				maintainImage.setVisible(true);

 

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

	

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_1_2);

		

		selectButton1_1_3.setVisible(true);

		selectButton1_1_3.setBounds(820, 575, 500, 100);

		selectButton1_1_3.setBorderPainted(false);

		selectButton1_1_3.setContentAreaFilled(false);

		selectButton1_1_3.setFocusPainted(false);

		selectButton1_1_3.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_1_3.setIcon(selectc1_1_3);

				selectButton1_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_1_3.setIcon(select1_1_3);

				selectButton1_1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last3();

				downImage.setVisible(true);

 

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

 

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_1_3);

		

	}

	

	public void Select1_2()//�ι�° ������ ����

	{

		d13.setVisible(false);

		

		downImage.setVisible(false);

		upImage.setVisible(false);

		maintainImage.setVisible(false);

		

		professor.setVisible(false);

		selectButton1_2_1.setVisible(true);

		selectButton1_2_2.setVisible(true);

		selectButton1_2_3.setVisible(true);

		selectButton1_2_1.setBounds(820, 325, 500, 100);

		selectButton1_2_1.setBorderPainted(false);

		selectButton1_2_1.setContentAreaFilled(false);

		selectButton1_2_1.setFocusPainted(false);

		selectButton1_2_1.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_2_1.setIcon(selectc1_2_1);

				selectButton1_2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_2_1.setIcon(select1_2_1);

				selectButton1_2_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				Last4();

				downImage.setVisible(true);

 

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

 

						End();

					}

				});

				add(nextButton);

 

			}

		});

		add(selectButton1_2_1);

		

		selectButton1_2_2.setBounds(820, 450, 500, 100);

		selectButton1_2_2.setBorderPainted(false);

		selectButton1_2_2.setContentAreaFilled(false);

		selectButton1_2_2.setFocusPainted(false);

		selectButton1_2_2.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_2_2.setIcon(selectc1_2_2);

				selectButton1_2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_2_2.setIcon(select1_2_2);

				selectButton1_2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				

				Last5();

				maintainImage.setVisible(true);

 

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

 

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_2_2);

		

		selectButton1_2_3.setBounds(820, 575, 500, 100);

		selectButton1_2_3.setBorderPainted(false);

		selectButton1_2_3.setContentAreaFilled(false);

		selectButton1_2_3.setFocusPainted(false);

		selectButton1_2_3.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_2_3.setIcon(selectc1_2_3);

				selectButton1_2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_2_3.setIcon(select1_2_3);

				selectButton1_2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				

				Last6();

				downImage.setVisible(true);

 

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

	

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_2_3);

		

	}

	

	

	public void Select1_3()//�ι�° ������ ����

	{

		d13.setVisible(false);

		

		downImage.setVisible(false);

		upImage.setVisible(false);

		maintainImage.setVisible(false);

		

		professor.setVisible(false);

		selectButton1_3_1.setVisible(true);

		selectButton1_3_2.setVisible(true);

		selectButton1_3_3.setVisible(true);

		selectButton1_3_1.setBounds(820, 325, 500, 100);

		selectButton1_3_1.setBorderPainted(false);

		selectButton1_3_1.setContentAreaFilled(false);

		selectButton1_3_1.setFocusPainted(false);

		selectButton1_3_1.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_3_1.setIcon(selectc1_3_1);

				selectButton1_3_1.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_3_1.setIcon(select1_3_1);

				selectButton1_3_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				

				Last7();

				downImage.setVisible(true);

 

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

 

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_3_1);

		

		selectButton1_3_2.setBounds(820, 450, 500, 100);

		selectButton1_3_2.setBorderPainted(false);

		selectButton1_3_2.setContentAreaFilled(false);

		selectButton1_3_2.setFocusPainted(false);

		selectButton1_3_2.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_3_2.setIcon(selectc1_3_2);

				selectButton1_3_2.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_3_2.setIcon(select1_3_2);

				selectButton1_3_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				

				Last8();

				downImage.setVisible(true);

 

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

 

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_3_2);

		

		selectButton1_3_3.setBounds(820, 575, 500, 100);

		selectButton1_3_3.setBorderPainted(false);

		selectButton1_3_3.setContentAreaFilled(false);

		selectButton1_3_3.setFocusPainted(false);

		selectButton1_3_3.addMouseListener(new MouseAdapter() {

			@Override

			public void mouseEntered(MouseEvent e) {

				selectButton1_3_3.setIcon(selectc1_3_3);

				selectButton1_3_3.setCursor(new Cursor(Cursor.HAND_CURSOR));

			}

			@Override

			public void mouseExited(MouseEvent e) {

				selectButton1_3_3.setIcon(select1_3_3);

				selectButton1_3_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

			}

			@Override

			public void mousePressed(MouseEvent e) {

				try {

					Thread.sleep(50);

				}catch(InterruptedException ex) {

					ex.printStackTrace();

				}

				

				Last9();

				upImage.setVisible(true);

				

				nextButton.setVisible(true);

				nextButton.setBounds(1000, 400, 300, 60);

				nextButton.setBorderPainted(false);

				nextButton.setContentAreaFilled(false);

				nextButton.setFocusPainted(false);

				nextButton.addMouseListener(new MouseAdapter() {

					@Override

					public void mouseEntered(MouseEvent e) {

						nextButton.setIcon(nextButtonEnteredImage);

						nextButton.setCursor(new Cursor(Cursor.HAND_CURSOR));

					}

					@Override

					public void mouseExited(MouseEvent e) {

						nextButton.setIcon(nextButtonBasicImage);

						nextButton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

					}

					@Override

					public void mousePressed(MouseEvent e) {

						nextButton.setVisible(false);

 

						End();

					}

				});

				add(nextButton);

			}

		});

		add(selectButton1_3_3);

		

	}

	

	public void Last1()

	{

		professor.setVisible(true);

		d14.setVisible(false);

		GoodFeeling.teacher3FeelSame();

 

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

		

		d17.setBounds(30, 480, 1200, 100);

		super.add(d17);

		d17.setVisible(true);

		d17.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last2()

	{

		professor.setVisible(true);

		d14.setVisible(false);

		GoodFeeling.teacher3FeelSame();

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d18.setBounds(30, 480, 1200, 100);

		super.add(d18);

		d18.setVisible(true);

		d18.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last3()

	{

		professor.setVisible(true);

		d14.setVisible(false);

		GoodFeeling.teacher3FeelDown();

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d19.setBounds(30, 480, 1200, 100);

		super.add(d19);

		d19.setVisible(true);

		d19.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last4()

	{

		professor.setVisible(true);

		d15.setVisible(false);

		GoodFeeling.teacher3FeelDown();

 

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

		

		d20.setBounds(30, 480, 1200, 100);

		super.add(d20);

		d20.setVisible(true);

		d20.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last5()

	{

		professor.setVisible(true);

		d15.setVisible(false);

		GoodFeeling.teacher3FeelSame();

		

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

 

		d21.setBounds(30, 480, 1200, 100);

		super.add(d21);

		d21.setVisible(true);

		d21.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last6()

	{

		professor.setVisible(true);

		d15.setVisible(false);

		GoodFeeling.teacher3FeelDown();

		

		selectButton1_2_1.setVisible(false);

		selectButton1_2_2.setVisible(false);

		selectButton1_2_3.setVisible(false);

 

		d22.setBounds(30, 480, 1200, 100);

		super.add(d22);

		d22.setVisible(true);

		d22.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last7()

	{

		professor.setVisible(true);

		d16.setVisible(false);

		GoodFeeling.teacher3FeelDown();

 

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

		

		d23.setBounds(30, 480, 1200, 100);

		super.add(d23);

		d23.setVisible(true);

		d23.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last8()

	{

		professor.setVisible(true);

		d16.setVisible(false);

		GoodFeeling.teacher3FeelDown();

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d24.setBounds(30, 480, 1200, 100);

		super.add(d24);

		d24.setVisible(true);

		d24.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last9()

	{

		professor.setVisible(true);

		d16.setVisible(false);

		GoodFeeling.teacher3FeelUp();

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d25.setBounds(30, 480, 1200, 100);

		super.add(d25);

		d25.setVisible(true);

		d25.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void End()

	{

		super.setVisible(false);

		isworked=true;

	}

	

	public void paintComponent(Graphics g)

	{

		g.drawImage(backGround, 0, 0, this);

		paintComponents(g);

		repaint();

	}
	
}
