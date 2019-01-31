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

public class C_Holiday extends JPanel{
private static final long serialVersionUID = 1L;

	

	public static boolean isworked=false;

	C_Special special=new C_Special();

	

	BufferedImage backGround;

	File file1=new File("./src/images/���ǽǺ���.jpg");

	File file2=new File("./src/images/���ǽǺ���_C.jpg");

	File file3=new File("./src/images/���ǽǾ�.jpg");

	File file4=new File("./src/images/���ǽǾ�_C.jpg");

	File file5=new File("./src/images/�����Թ�.jpg");

	File file6=new File("./src/images/�����Թ�_C.jpg");

	File file7=new File("./src/images/ķ�۽�.jpg");

	File file8=new File("./src/images/ķ�۽�_C.jpg");

	private ImageIcon select1_1=new ImageIcon(Main.class.getResource("../images/������4-1.png"));

	private ImageIcon selectc1_1=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-1.png"));

	private ImageIcon select1_2=new ImageIcon(Main.class.getResource("../images/������4-2.png"));

	private ImageIcon selectc1_2=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-2.png"));

	private ImageIcon select1_3=new ImageIcon(Main.class.getResource("../images/������4-3.png"));

	private ImageIcon selectc1_3=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-3.png"));

	private ImageIcon select1_1_1=new ImageIcon(Main.class.getResource("../images/������4-1-1.png"));

	private ImageIcon selectc1_1_1=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-1-1.png"));

	private ImageIcon select1_1_2=new ImageIcon(Main.class.getResource("../images/������4-1-2.png"));

	private ImageIcon selectc1_1_2=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-1-2.png"));

	private ImageIcon select1_1_3=new ImageIcon(Main.class.getResource("../images/������4-1-3.png"));

	private ImageIcon selectc1_1_3=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-1-3.png"));

	private ImageIcon select1_3_1=new ImageIcon(Main.class.getResource("../images/������4-3-1.png"));

	private ImageIcon selectc1_3_1=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-3-1.png"));

	private ImageIcon select1_3_2=new ImageIcon(Main.class.getResource("../images/������4-3-2.png"));

	private ImageIcon selectc1_3_2=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-3-2.png"));

	private ImageIcon select1_3_3=new ImageIcon(Main.class.getResource("../images/������4-3-3.png"));

	private ImageIcon selectc1_3_3=new ImageIcon(Main.class.getResource("../images/������Ŭ��4-3-3.png"));

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

	private JButton selectButton1_3_1=new JButton(select1_3_1);

	private JButton selectButton1_3_2=new JButton(select1_3_2);

	private JButton selectButton1_3_3=new JButton(select1_3_3);

	private JButton upImage=new JButton(up);

	private JButton downImage=new JButton(down);

	private JButton maintainImage=new JButton(maintain);

	

	private JLabel professor=new JLabel("������ C");

	private JLabel situation1=new JLabel("�������� �������� �� �������� ���� �������� ����� ���δ�");

	String[] dialogue=ProfessorDialogue.getDialogue_C();

	

	JLabel d39=new JLabel(dialogue[39]);

	JLabel d40=new JLabel(dialogue[40]);

	JLabel d41=new JLabel(dialogue[41]);

	JLabel d42=new JLabel(dialogue[42]);

	JLabel d43=new JLabel(dialogue[43]);

	JLabel d44=new JLabel(dialogue[44]);

	JLabel d45=new JLabel(dialogue[45]);

	JLabel d46=new JLabel(dialogue[46]);

	JLabel d47=new JLabel(dialogue[47]);

	JLabel d48=new JLabel(dialogue[48]);

	

	public C_Holiday()

	{

		try {

			backGround=ImageIO.read(file7);

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

		

		d39.setBounds(30, 480, 1200, 100);

		super.add(d39);

		d39.setVisible(false);

		d39.setFont(new Font(null, Font.PLAIN, 40));

		

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

					backGround=ImageIO.read(file8);//����2�� �ٲ�鼭 ��ȭ �߻�

				}catch(IOException ex) {

					ex.printStackTrace();

				}

				repaint();	

				situation1.setVisible(false);

				d39.setVisible(true);

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

		d39.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d40.setBounds(30, 480, 1200, 100);

		super.add(d40);

		d40.setVisible(true);

		d40.setFont(new Font(null, Font.PLAIN, 40));

		

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

		d39.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d41.setBounds(30, 480, 1200, 100);

		super.add(d41);

		d41.setVisible(true);

		d41.setFont(new Font(null, Font.PLAIN, 40));

		

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
				Dialogue_C.isSpecialDialogue = true;
				End();

				repaint();

				
				//Ư����ȭ �ߵ� 

			}

		});

		add(nextButton);

	}

	

	public void Selected3()//������ �����

	{

		d39.setVisible(false);

		

		professor.setBounds(30, 385, 300, 100);

		super.add(professor);

		professor.setVisible(true);

		professor.setFont(new Font(null, Font.BOLD, 30));

		

		d42.setBounds(30, 480, 1200, 100);

		super.add(d42);

		d42.setVisible(true);

		d42.setFont(new Font(null, Font.PLAIN, 40));

		

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

				Select1_3();

			}

		});

		add(nextButton);

	}

	

	public void Select1_1()//�ι�° ������ ����

	{

		d39.setVisible(false);

		

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

		add(selectButton1_1_3);

		

	}

	

	

	public void Select1_3()//�ι�° ������ ����

	{

		d39.setVisible(false);

		

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

		add(selectButton1_3_3);

		

	}

	

	public void Last1()

	{

		professor.setVisible(true);

		d40.setVisible(false);

		GoodFeeling.teacher3FeelDown();

 

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

		

		d43.setBounds(30, 480, 1200, 100);

		super.add(d43);

		d43.setVisible(true);

		d43.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last2()

	{

		professor.setVisible(true);

		d40.setVisible(false);

		GoodFeeling.teacher3FeelUp();

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d44.setBounds(30, 480, 1200, 100);

		super.add(d44);

		d44.setVisible(true);

		d44.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last3()

	{

		professor.setVisible(true);

		d40.setVisible(false);

		GoodFeeling.teacher3FeelSame();

		

		selectButton1_1_1.setVisible(false);

		selectButton1_1_2.setVisible(false);

		selectButton1_1_3.setVisible(false);

 

		d45.setBounds(30, 480, 1200, 100);

		super.add(d45);

		d45.setVisible(true);

		d45.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	

	public void Last7()

	{

		professor.setVisible(true);

		d42.setVisible(false);

		GoodFeeling.teacher3FeelSame();

 

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

		

		d46.setBounds(30, 480, 1200, 100);

		super.add(d46);

		d46.setVisible(true);

		d46.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last8()

	{

		professor.setVisible(true);

		d42.setVisible(false);

		GoodFeeling.teacher3FeelDown();

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d47.setBounds(30, 480, 1200, 100);

		super.add(d47);

		d47.setVisible(true);

		d47.setFont(new Font(null, Font.PLAIN, 40));

	}

	

	public void Last9()

	{

		professor.setVisible(true);

		d42.setVisible(false);

		GoodFeeling.teacher3FeelDown();

		

		selectButton1_3_1.setVisible(false);

		selectButton1_3_2.setVisible(false);

		selectButton1_3_3.setVisible(false);

 

		d48.setBounds(30, 480, 1200, 100);

		super.add(d48);

		d48.setVisible(true);

		d48.setFont(new Font(null, Font.PLAIN, 40));

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
