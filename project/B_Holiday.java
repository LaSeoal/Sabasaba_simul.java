package project;

import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

public class B_Holiday extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	public static boolean isWorked = false;
	
	BufferedImage background;
	File file1 = new File("./src/images/ķ�۽�.jpg");
	File file2 = new File("./src/images/ķ�۽�_B.jpg");
	
	JButton nextBtn1 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn2 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn3 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn4 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn5 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn6 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn7 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn8 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn9 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn10 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn11 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	//JButton nextBtn12 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtn13 = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtnEnd = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton nextBtnExit = new JButton(new ImageIcon(Main.class.getResource("../images/��ư1.png")));
	JButton up = new JButton(new ImageIcon(Main.class.getResource("../images/ȣ���� ���.png")));
	JButton same = new JButton(new ImageIcon(Main.class.getResource("../images/ȣ���� ����.png")));
	JButton down = new JButton(new ImageIcon(Main.class.getResource("../images/ȣ���� �϶�.png")));
	
	JButton c1_1 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_1_1.png")));
	JButton c1_2 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_1_2.png")));
	JButton c1_3 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_1_3.png")));
	JButton c2_1 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_2_1.png")));
	JButton c2_2 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_2_2.png")));
	JButton c2_3 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_2_3.png")));
	JButton c3_1 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_3_1.png")));
	JButton c3_2 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_3_2.png")));
	JButton c3_3 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_3_3.png")));
	JButton c3_1_1 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_3_1_1.png")));
	JButton c3_1_2 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_3_1_2.png")));
	JButton c3_1_3 = new JButton(new ImageIcon(Main.class.getResource("../images/������_����_3_1_3.png")));
	JButton doIt = new JButton(new ImageIcon(Main.class.getResource("../images/������_����.png")));
	JButton notDoIt = new JButton(new ImageIcon(Main.class.getResource("../images/������_��������.png")));
	
	JLabel name = new JLabel("������B");
	JLabel label1 = new JLabel("(������ Ǯ���������� ��¼�� �б��� ���ԵǾ��µ�");
	JLabel label2 = new JLabel("�ٷ� �տ� �������� �ɾ� ���� ��̴�.)");
	JLabel label3 = new JLabel("(�������� ƼŸ���� ���� ��ż�");
	JLabel label4 = new JLabel("���� �����ϰ� �ִ� �� �𸣽Ű� ����.)");
	JLabel label5 = new JLabel("(�������� ��� ������ ��� �ִ� Ŀ������");
	JLabel label6 = new JLabel("��ġ�̰� �״�� �ʿ� �����̴�.)");
	JLabel label7 = new JLabel("(�������� ��� ���� �� ������");
	JLabel label8 = new JLabel("�����̵� Ŀ������ ��ġ���� �ʾҴ�.)");
	JLabel label9 = new JLabel("(���������ؼ� �����԰� ���� �ɾ�Եƴ�..)");
	JLabel label10 = new JLabel("(�������� �⳪�� Ŀ�� ������ �����鼭");
	JLabel label11 = new JLabel("��ħ�� �������� ������ �� �����Բ� �λ��ߴ�.)");
	JLabel label12 = new JLabel("(�����Ե� �� �̾߱⸦ �� ����༭ �����");
	JLabel label13 = new JLabel("�������ŵ� �ϴ�.)");
	
	String[] dialogue = ProfessorDialogue.getDialogue_B(); // ������B ��縦 �� �پ� ��� String �迭�� ����
	JLabel d60 = new JLabel(dialogue[60]);
	JLabel d61 = new JLabel(dialogue[61]);
	JLabel d62 = new JLabel(dialogue[62]);
	JLabel d63 = new JLabel(dialogue[63]);
	JLabel d64 = new JLabel(dialogue[64]);
	JLabel d65 = new JLabel(dialogue[65]);
	JLabel d66 = new JLabel(dialogue[66]);
	JLabel d67 = new JLabel(dialogue[67]);
	JLabel d68 = new JLabel(dialogue[68]);
	JLabel d69 = new JLabel(dialogue[69]);
	JLabel d70 = new JLabel(dialogue[70]);
	JLabel d71 = new JLabel(dialogue[71]);
	JLabel d72 = new JLabel(dialogue[72]);
	JLabel d73 = new JLabel(dialogue[73]);
	JLabel d74 = new JLabel(dialogue[74]);
	
	private ImageIcon nextBtnEnteredImage = new ImageIcon(Main.class.getResource("../images/��ư1_Ŭ��.png"));
	private ImageIcon nextBtnBasicImage = new ImageIcon(Main.class.getResource("../images/��ư1.png"));
	private ImageIcon c1_1EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_1_1_clk.png"));
	private ImageIcon c1_1BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_1_1.png"));
	private ImageIcon c1_2EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_1_2_clk.png"));
	private ImageIcon c1_2BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_1_2.png"));
	private ImageIcon c1_3EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_1_3_clk.png"));
	private ImageIcon c1_3BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_1_3.png"));
	private ImageIcon c2_1EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_2_1_clk.png"));
	private ImageIcon c2_1BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_2_1.png"));
	private ImageIcon c2_2EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_2_2_clk.png"));
	private ImageIcon c2_2BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_2_2.png"));
	private ImageIcon c2_3EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_2_3_clk.png"));
	private ImageIcon c2_3BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_2_3.png"));
	private ImageIcon c3_1EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1_clk.png"));
	private ImageIcon c3_1BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1.png"));
	private ImageIcon c3_2EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_3_2_clk.png"));
	private ImageIcon c3_2BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_3_2.png"));
	private ImageIcon c3_3EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_3_3_clk.png"));
	private ImageIcon c3_3BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_3_3.png"));
	private ImageIcon c3_1_1EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1_1_clk.png"));
	private ImageIcon c3_1_1BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1_1.png"));
	private ImageIcon c3_1_2EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1_2_clk.png"));
	private ImageIcon c3_1_2BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1_2.png"));
	private ImageIcon c3_1_3EnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1_3_clk.png"));
	private ImageIcon c3_1_3BasicImage = new ImageIcon(Main.class.getResource("../images/������_����_3_1_3.png"));
	private ImageIcon doItEnteredImage = new ImageIcon(Main.class.getResource("../images/������_����_clk.png"));
	private ImageIcon doItBasicImage = new ImageIcon(Main.class.getResource("../images/������_����.png"));
	private ImageIcon notDoItEnteredImage = new ImageIcon(Main.class.getResource("../images/������_��������_clk.png"));
	private ImageIcon notDoItBasicImage = new ImageIcon(Main.class.getResource("../images/������_��������.png"));
	
	public B_Holiday()
	{
		try
		{
			background = ImageIO.read(file1);
		} catch (IOException e) {}
		
		super.setLayout(null);
		
		label1.setBounds(30, 480, 1200, 100);
		label1.setFont(new Font("���� ���", Font.PLAIN, 40));
		label2.setBounds(30, 550, 1200, 100);
		label2.setFont(new Font("���� ���", Font.PLAIN, 40));
		super.add(label1);
		super.add(label2);
		
		nextBtn1.setBounds(1000,400,300,60);
		nextBtn1.setBorderPainted(false);
		nextBtn1.setContentAreaFilled(false);
		nextBtn1.setFocusPainted(false);
		
		super.add(nextBtn1);
		nextBtn1.addActionListener(this);
		nextBtn1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				nextBtn1.setIcon(nextBtnEnteredImage);
				nextBtn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				nextBtn1.setIcon(nextBtnBasicImage);
				nextBtn1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		up.setBounds(160,100,100,250);
		up.setBorderPainted(false);
		up.setContentAreaFilled(false);
		up.setFocusPainted(false);
		same.setBounds(160,100,100,250);
		same.setBorderPainted(false);
		same.setContentAreaFilled(false);
		same.setFocusPainted(false);
		down.setBounds(160,100,100,250);
		down.setBorderPainted(false);
		down.setContentAreaFilled(false);
		down.setFocusPainted(false);
		super.add(up);
		super.add(same);
		super.add(down);
		up.setVisible(false);
		same.setVisible(false);
		down.setVisible(false);
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(background, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		nextBtnEnd.setBounds(1000,400,300,60);
		nextBtnEnd.setBorderPainted(false);
		nextBtnEnd.setContentAreaFilled(false);
		nextBtnEnd.setFocusPainted(false);
		nextBtnEnd.addActionListener(this);
		nextBtnEnd.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent e)
			{
				nextBtnEnd.setIcon(nextBtnEnteredImage);
				nextBtnEnd.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e)
			{
				nextBtnEnd.setIcon(nextBtnBasicImage);
				nextBtnEnd.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		
		if(e.getSource() == nextBtn1)
		{
			nextBtn1.setVisible(false);
			label1.setVisible(false);
			label2.setVisible(false);
			
			label3.setBounds(30, 480, 1200, 100);
			label3.setFont(new Font("���� ���", Font.PLAIN, 40));
			label4.setBounds(30, 550, 1200, 100);
			label4.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label3);
			super.add(label4);
			
			nextBtn2.setBounds(1000,400,300,60);
			nextBtn2.setBorderPainted(false);
			nextBtn2.setContentAreaFilled(false);
			nextBtn2.setFocusPainted(false);
			
			super.add(nextBtn2);
			nextBtn2.addActionListener(this);
			nextBtn2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn2.setIcon(nextBtnEnteredImage);
					nextBtn2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn2.setIcon(nextBtnBasicImage);
					nextBtn2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == nextBtn2)
		{
			nextBtn2.setVisible(false);
			
			c1_1.setBounds(820,325,500,100);
			c1_1.setBorderPainted(false);
			c1_1.setContentAreaFilled(false);
			c1_1.setFocusPainted(false);
			
			super.add(c1_1);
			c1_1.setVisible(true);
			c1_1.addActionListener(this);
			c1_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c1_1.setIcon(c1_1EnteredImage);
					c1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c1_1.setIcon(c1_1BasicImage);
					c1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c1_2.setBounds(820,450,500,100);
			c1_2.setBorderPainted(false);
			c1_2.setContentAreaFilled(false);
			c1_2.setFocusPainted(false);
			
			super.add(c1_2);
			c1_2.setVisible(true);
			c1_2.addActionListener(this);
			c1_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c1_2.setIcon(c1_2EnteredImage);
					c1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c1_2.setIcon(c1_2BasicImage);
					c1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c1_3.setBounds(820,575,500,100);
			c1_3.setBorderPainted(false);
			c1_3.setContentAreaFilled(false);
			c1_3.setFocusPainted(false);
			
			super.add(c1_3);
			c1_3.setVisible(true);
			c1_3.addActionListener(this);
			c1_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c1_3.setIcon(c1_3EnteredImage);
					c1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c1_3.setIcon(c1_3BasicImage);
					c1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == c1_1 || e.getSource() == c1_2 || e.getSource() == c1_3)
		{
			try
			{
				background = ImageIO.read(file2);
			} catch (IOException e1) {}
			
			c1_1.setVisible(false);
			c1_2.setVisible(false);
			c1_3.setVisible(false);
			label3.setVisible(false);
			label4.setVisible(false);
			
			name.setBounds(30, 385, 300, 100);
			name.setFont(new Font("���� ���", Font.BOLD, 30));
			super.add(name);
			
			if(e.getSource() == c1_1 || e.getSource() == c1_2)
			{
				d60.setBounds(30, 480, 1200, 100);
				d60.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d60);
				
				nextBtn3.setBounds(1000,400,300,60);
				nextBtn3.setBorderPainted(false);
				nextBtn3.setContentAreaFilled(false);
				nextBtn3.setFocusPainted(false);
				
				super.add(nextBtn3);
				nextBtn3.addActionListener(this);
				nextBtn3.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn3.setIcon(nextBtnEnteredImage);
						nextBtn3.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn3.setIcon(nextBtnBasicImage);
						nextBtn3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else
			{
				d61.setBounds(30, 480, 1200, 100);
				d61.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d61);
				
				nextBtn4.setBounds(1000,400,300,60);
				nextBtn4.setBorderPainted(false);
				nextBtn4.setContentAreaFilled(false);
				nextBtn4.setFocusPainted(false);
				
				super.add(nextBtn4);
				nextBtn4.addActionListener(this);
				nextBtn4.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn4.setIcon(nextBtnEnteredImage);
						nextBtn4.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn4.setIcon(nextBtnBasicImage);
						nextBtn4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			repaint();
		}
		
		if(e.getSource() == nextBtn3)
		{
			nextBtn3.setVisible(false);
			d60.setVisible(false);
			
			//ȣ���� -1
			GoodFeeling.teacher2FeelDown();
			down.setVisible(true);
			
			label5.setBounds(30, 480, 1200, 100);
			label5.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label5);
			label6.setBounds(30, 550, 1200, 100);
			label6.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label6);
			
			nextBtn5.setBounds(1000,400,300,60);
			nextBtn5.setBorderPainted(false);
			nextBtn5.setContentAreaFilled(false);
			nextBtn5.setFocusPainted(false);
			
			super.add(nextBtn5);
			nextBtn5.addActionListener(this);
			nextBtn5.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn5.setIcon(nextBtnEnteredImage);
					nextBtn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn5.setIcon(nextBtnBasicImage);
					nextBtn5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn4)
		{
			nextBtn4.setVisible(false);
			d61.setVisible(false);
			
			//ȣ���� +0
			GoodFeeling.teacher2FeelSame();
			same.setVisible(true);
			
			label7.setBounds(30, 480, 1200, 100);
			label7.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label7);
			label8.setBounds(30, 550, 1200, 100);
			label8.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label8);
			
			nextBtn5.setBounds(1000,400,300,60);
			nextBtn5.setBorderPainted(false);
			nextBtn5.setContentAreaFilled(false);
			nextBtn5.setFocusPainted(false);
			
			super.add(nextBtn5);
			nextBtn5.addActionListener(this);
			nextBtn5.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn5.setIcon(nextBtnEnteredImage);
					nextBtn5.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn5.setIcon(nextBtnBasicImage);
					nextBtn5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn5)
		{
			nextBtn5.setVisible(false);
			label5.setVisible(false);
			label6.setVisible(false);
			label7.setVisible(false);
			label8.setVisible(false);
			down.setVisible(false);
			same.setVisible(false);
			name.setVisible(false);
			
			label9.setBounds(30, 480, 1200, 100);
			label9.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label9);
			
			nextBtn6.setBounds(1000,400,300,60);
			nextBtn6.setBorderPainted(false);
			nextBtn6.setContentAreaFilled(false);
			nextBtn6.setFocusPainted(false);
			
			super.add(nextBtn6);
			nextBtn6.addActionListener(this);
			nextBtn6.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn6.setIcon(nextBtnEnteredImage);
					nextBtn6.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn6.setIcon(nextBtnBasicImage);
					nextBtn6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn6)
		{
			nextBtn6.setVisible(false);
			label9.setVisible(false);
			
			name.setVisible(true);
			d62.setBounds(30, 480, 1200, 100);
			d62.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(d62);
			
			nextBtn7.setBounds(1000,400,300,60);
			nextBtn7.setBorderPainted(false);
			nextBtn7.setContentAreaFilled(false);
			nextBtn7.setFocusPainted(false);
			
			super.add(nextBtn7);
			nextBtn7.addActionListener(this);
			nextBtn7.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn7.setIcon(nextBtnEnteredImage);
					nextBtn7.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn7.setIcon(nextBtnBasicImage);
					nextBtn7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn7)
		{
			nextBtn7.setVisible(false);
			
			c2_1.setBounds(820,325,500,100);
			c2_1.setBorderPainted(false);
			c2_1.setContentAreaFilled(false);
			c2_1.setFocusPainted(false);
			
			super.add(c2_1);
			c2_1.setVisible(true);
			c2_1.addActionListener(this);
			c2_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_1.setIcon(c2_1EnteredImage);
					c2_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_1.setIcon(c2_1BasicImage);
					c2_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_2.setBounds(820,450,500,100);
			c2_2.setBorderPainted(false);
			c2_2.setContentAreaFilled(false);
			c2_2.setFocusPainted(false);
			
			super.add(c2_2);
			c2_2.setVisible(true);
			c2_2.addActionListener(this);
			c2_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_2.setIcon(c2_2EnteredImage);
					c2_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_2.setIcon(c2_2BasicImage);
					c2_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c2_3.setBounds(820,575,500,100);
			c2_3.setBorderPainted(false);
			c2_3.setContentAreaFilled(false);
			c2_3.setFocusPainted(false);
			
			super.add(c2_3);
			c2_3.setVisible(true);
			c2_3.addActionListener(this);
			c2_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c2_3.setIcon(c2_3EnteredImage);
					c2_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c2_3.setIcon(c2_3BasicImage);
					c2_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == c2_1 || e.getSource() == c2_2 || e.getSource() == c2_3)
		{
			c2_1.setVisible(false);
			c2_2.setVisible(false);
			c2_3.setVisible(false);
			d62.setVisible(false);
			
			if(e.getSource() == c2_1)
			{
				//ȣ���� +1
				GoodFeeling.teacher2FeelUp();
				up.setVisible(true);
				
				d63.setBounds(30, 480, 1200, 100);
				d63.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d63);
				d64.setBounds(30, 550, 1200, 100);
				d64.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d64);
			}
			else if(e.getSource() == c2_2)
			{
				//ȣ���� +0
				GoodFeeling.teacher2FeelSame();
				same.setVisible(true);
				
				d65.setBounds(30, 480, 1200, 100);
				d65.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d65);
				d66.setBounds(30, 550, 1200, 100);
				d66.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d66);
			}
			else
			{
				//ȣ���� -1
				GoodFeeling.teacher2FeelDown();
				down.setVisible(true);
				
				d67.setBounds(30, 480, 1200, 100);
				d67.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d67);
			}
			
			nextBtn8.setBounds(1000,400,300,60);
			nextBtn8.setBorderPainted(false);
			nextBtn8.setContentAreaFilled(false);
			nextBtn8.setFocusPainted(false);
			
			super.add(nextBtn8);
			nextBtn8.addActionListener(this);
			nextBtn8.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn8.setIcon(nextBtnEnteredImage);
					nextBtn8.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn8.setIcon(nextBtnBasicImage);
					nextBtn8.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == nextBtn8)
		{
			nextBtn8.setVisible(false);
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			d63.setVisible(false);
			d64.setVisible(false);
			d65.setVisible(false);
			d66.setVisible(false);
			d67.setVisible(false);
			
			d68.setBounds(30, 480, 1200, 100);
			d68.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(d68);
			
			nextBtn9.setBounds(1000,400,300,60);
			nextBtn9.setBorderPainted(false);
			nextBtn9.setContentAreaFilled(false);
			nextBtn9.setFocusPainted(false);
			
			super.add(nextBtn9);
			nextBtn9.addActionListener(this);
			nextBtn9.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn9.setIcon(nextBtnEnteredImage);
					nextBtn9.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn9.setIcon(nextBtnBasicImage);
					nextBtn9.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			repaint();
		}
		
		if(e.getSource() == nextBtn9)
		{
			nextBtn9.setVisible(false);
			
			c3_1.setBounds(820,325,500,100);
			c3_1.setBorderPainted(false);
			c3_1.setContentAreaFilled(false);
			c3_1.setFocusPainted(false);
			
			super.add(c3_1);
			c3_1.setVisible(true);
			c3_1.addActionListener(this);
			c3_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_1.setIcon(c3_1EnteredImage);
					c3_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_1.setIcon(c3_1BasicImage);
					c3_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c3_2.setBounds(820,450,500,100);
			c3_2.setBorderPainted(false);
			c3_2.setContentAreaFilled(false);
			c3_2.setFocusPainted(false);
			
			super.add(c3_2);
			c3_2.setVisible(true);
			c3_2.addActionListener(this);
			c3_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_2.setIcon(c3_2EnteredImage);
					c3_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_2.setIcon(c3_2BasicImage);
					c3_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c3_3.setBounds(820,575,500,100);
			c3_3.setBorderPainted(false);
			c3_3.setContentAreaFilled(false);
			c3_3.setFocusPainted(false);
			
			super.add(c3_3);
			c3_3.setVisible(true);
			c3_3.addActionListener(this);
			c3_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_3.setIcon(c3_3EnteredImage);
					c3_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_3.setIcon(c3_3BasicImage);
					c3_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c3_1 || e.getSource() == c3_2 || e.getSource() == c3_3)
		{
			c3_1.setVisible(false);
			c3_2.setVisible(false);
			c3_3.setVisible(false);
			d68.setVisible(false);
			
			if(e.getSource() == c3_1)
			{
				//ȣ���� +1
				GoodFeeling.teacher2FeelUp();
				up.setVisible(true);
				
				d69.setBounds(30, 480, 1200, 100);
				d69.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d69);
				d70.setBounds(30, 550, 1200, 100);
				d70.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d70);
				
				nextBtn10.setBounds(1000,400,300,60);
				nextBtn10.setBorderPainted(false);
				nextBtn10.setContentAreaFilled(false);
				nextBtn10.setFocusPainted(false);
				
				super.add(nextBtn10);
				nextBtn10.addActionListener(this);
				nextBtn10.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn10.setIcon(nextBtnEnteredImage);
						nextBtn10.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn10.setIcon(nextBtnBasicImage);
						nextBtn10.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else if(e.getSource() == c3_2)
			{
				//ȣ���� +0
				GoodFeeling.teacher2FeelSame();
				same.setVisible(true);
				
				nextBtn11.setBounds(1000,400,300,60);
				nextBtn11.setBorderPainted(false);
				nextBtn11.setContentAreaFilled(false);
				nextBtn11.setFocusPainted(false);
				
				super.add(nextBtn11);
				nextBtn11.addActionListener(this);
				nextBtn11.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnEnteredImage);
						nextBtn11.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnBasicImage);
						nextBtn11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else
			{
				//ȣ���� -1
				GoodFeeling.teacher2FeelDown();
				down.setVisible(true);
				
				nextBtn11.setBounds(1000,400,300,60);
				nextBtn11.setBorderPainted(false);
				nextBtn11.setContentAreaFilled(false);
				nextBtn11.setFocusPainted(false);
				
				super.add(nextBtn11);
				nextBtn11.addActionListener(this);
				nextBtn11.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnEnteredImage);
						nextBtn11.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnBasicImage);
						nextBtn11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			
			repaint();
		}
		
		if(e.getSource() == nextBtn10)
		{
			up.setVisible(false);
			nextBtn10.setVisible(false);
			d69.setVisible(false);
			d70.setVisible(false);
			
			doIt.setBounds(820,325,500,100);
			doIt.setBorderPainted(false);
			doIt.setContentAreaFilled(false);
			doIt.setFocusPainted(false);
			
			super.add(doIt);
			doIt.setVisible(true);
			doIt.addActionListener(this);
			doIt.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					doIt.setIcon(doItEnteredImage);
					doIt.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					doIt.setIcon(doItBasicImage);
					doIt.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			notDoIt.setBounds(820,575,500,100);
			notDoIt.setBorderPainted(false);
			notDoIt.setContentAreaFilled(false);
			notDoIt.setFocusPainted(false);
			
			super.add(notDoIt);
			notDoIt.setVisible(true);
			notDoIt.addActionListener(this);
			notDoIt.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					notDoIt.setIcon(notDoItEnteredImage);
					notDoIt.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					notDoIt.setIcon(notDoItBasicImage);
					notDoIt.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == doIt || e.getSource() == notDoIt)
		{
			doIt.setVisible(false);
			notDoIt.setVisible(false);
			
			if(e.getSource() == doIt)
			{
				d71.setBounds(30, 480, 1200, 100);
				d71.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d71);
				d72.setBounds(30, 550, 1200, 100);
				d72.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d72);
				
				nextBtn13.setBounds(1000,400,300,60);
				nextBtn13.setBorderPainted(false);
				nextBtn13.setContentAreaFilled(false);
				nextBtn13.setFocusPainted(false);
				
				super.add(nextBtn13);
				nextBtn13.addActionListener(this);
				nextBtn13.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn13.setIcon(nextBtnEnteredImage);
						nextBtn13.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn13.setIcon(nextBtnBasicImage);
						nextBtn13.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			else
			{
				nextBtn11.setBounds(1000,400,300,60);
				nextBtn11.setBorderPainted(false);
				nextBtn11.setContentAreaFilled(false);
				nextBtn11.setFocusPainted(false);
				
				super.add(nextBtn11);
				nextBtn11.addActionListener(this);
				nextBtn11.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseEntered(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnEnteredImage);
						nextBtn11.setCursor(new Cursor(Cursor.HAND_CURSOR));
					}
					@Override
					public void mouseExited(MouseEvent e)
					{
						nextBtn11.setIcon(nextBtnBasicImage);
						nextBtn11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
					}
				});
			}
			
			repaint();
		}
		
		if(e.getSource() == nextBtn13)
		{
			nextBtn13.setVisible(false);
			
			c3_1_1.setBounds(820,325,500,100);
			c3_1_1.setBorderPainted(false);
			c3_1_1.setContentAreaFilled(false);
			c3_1_1.setFocusPainted(false);
			
			super.add(c3_1_1);
			c3_1_1.setVisible(true);
			c3_1_1.addActionListener(this);
			c3_1_1.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_1_1.setIcon(c3_1_1EnteredImage);
					c3_1_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_1_1.setIcon(c3_1_1BasicImage);
					c3_1_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c3_1_2.setBounds(820,450,500,100);
			c3_1_2.setBorderPainted(false);
			c3_1_2.setContentAreaFilled(false);
			c3_1_2.setFocusPainted(false);
			
			super.add(c3_1_2);
			c3_1_2.setVisible(true);
			c3_1_2.addActionListener(this);
			c3_1_2.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_1_2.setIcon(c3_1_2EnteredImage);
					c3_1_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_1_2.setIcon(c3_1_2BasicImage);
					c3_1_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			c3_1_3.setBounds(820,575,500,100);
			c3_1_3.setBorderPainted(false);
			c3_1_3.setContentAreaFilled(false);
			c3_1_3.setFocusPainted(false);
			
			super.add(c3_1_3);
			c3_1_3.setVisible(true);
			c3_1_3.addActionListener(this);
			c3_1_3.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					c3_1_3.setIcon(c3_1_3EnteredImage);
					c3_1_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					c3_1_3.setIcon(c3_1_3BasicImage);
					c3_1_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == c3_1_1 || e.getSource() == c3_1_2 || e.getSource() == c3_1_3)
		{
			c3_1_1.setVisible(false);
			c3_1_2.setVisible(false);
			c3_1_3.setVisible(false);
			d71.setVisible(false);
			d72.setVisible(false);
			
			if(e.getSource() == c3_1_2)
			{
				GoodFeeling.teacher2FeelUp();//ȣ���� +1
				up.setVisible(true);
				
				d73.setBounds(30, 480, 1200, 100);
				d73.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d73);
			}
			else
			{
				GoodFeeling.teacher2FeelDown();//ȣ���� -1
				down.setVisible(true);
				
				d74.setBounds(30, 480, 1200, 100);
				d74.setFont(new Font("���� ���", Font.PLAIN, 40));
				super.add(d74);
			}
			
			nextBtn11.setBounds(1000,400,300,60);
			nextBtn11.setBorderPainted(false);
			nextBtn11.setContentAreaFilled(false);
			nextBtn11.setFocusPainted(false);
			
			super.add(nextBtn11);
			nextBtn11.addActionListener(this);
			nextBtn11.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtn11.setIcon(nextBtnEnteredImage);
					nextBtn11.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtn11.setIcon(nextBtnBasicImage);
					nextBtn11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == nextBtn11)
		{
			nextBtn11.setVisible(false);
			up.setVisible(false);
			same.setVisible(false);
			down.setVisible(false);
			name.setVisible(false);
			d73.setVisible(false);
			d74.setVisible(false);
			
			label10.setBounds(30, 480, 1200, 100);
			label10.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label10);
			label11.setBounds(30, 550, 1200, 100);
			label11.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label11);
			
			super.add(nextBtnEnd);
			repaint();
		}
		
		if(e.getSource() == nextBtnEnd)
		{
			nextBtnEnd.setVisible(false);
			label10.setVisible(false);
			label11.setVisible(false);
			
			label12.setBounds(30, 480, 1200, 100);
			label12.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label12);
			label13.setBounds(30, 550, 1200, 100);
			label13.setFont(new Font("���� ���", Font.PLAIN, 40));
			super.add(label13);
			
			//ȣ���� +1
			GoodFeeling.teacher2FeelUp();
			up.setVisible(true);
			
			nextBtnExit.setBounds(1000,400,300,60);
			nextBtnExit.setBorderPainted(false);
			nextBtnExit.setContentAreaFilled(false);
			nextBtnExit.setFocusPainted(false);
			
			super.add(nextBtnExit);
			nextBtnExit.addActionListener(this);
			nextBtnExit.addMouseListener(new MouseAdapter()
			{
				@Override
				public void mouseEntered(MouseEvent e)
				{
					nextBtnExit.setIcon(nextBtnEnteredImage);
					nextBtnExit.setCursor(new Cursor(Cursor.HAND_CURSOR));
				}
				@Override
				public void mouseExited(MouseEvent e)
				{
					nextBtnExit.setIcon(nextBtnBasicImage);
					nextBtnExit.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
				}
			});
			
			repaint();
		}
		
		if(e.getSource() == nextBtnExit)
		{
			super.setVisible(false);
			isWorked = true;
		}
	}
}
