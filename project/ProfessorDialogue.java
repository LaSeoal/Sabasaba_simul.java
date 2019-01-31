package project;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProfessorDialogue {
	
	static BufferedReader br = null;
	private static String[] dialogue = new String[100];
	
	public static String[] getDialogue_B()
	{
		for(int i = 0; i < 100; i++)
		{
			dialogue[i] = ""; // String�� ������ ��ĭ���� ä��� (�̰� ������ NullPointerException �߻�)
		}
		
		try
		{
			br = new BufferedReader(new FileReader("./������ ���_B.txt")); // ������ ��� ������ �о�´�
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) // �� �̻� ���� ���� ���� �� ���� �� �پ� line�� String ���·� ����
			{
				dialogue[i] = line; // i��° ���� ��縦 dialogue �迭�� ����
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++)
		{
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // ���忡 "//"�ձ�����  �߶� ����
		}
		
		return dialogue; // ��� �迭���� ��ȯ�Ѵ�.
	}
	
	public static String[] getDialogue_A_Special()
	{	
		for(int i = 0; i < 100; i++)
		{
			dialogue[i] = ""; // String�� ������ ��ĭ���� ä��� (�̰� ������ NullPointerException �߻�)
		}
		
		try
		{
			br = new BufferedReader(new FileReader("./Ư��1-1.txt")); // ������ ��� ������ �о�´�
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) // �� �̻� ���� ���� ���� �� ���� �� �پ� line�� String ���·� ����
			{
				dialogue[i] = line; // i��° ���� ��縦 dialogue �迭�� ����
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++)
		{
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // ���忡 "//"�ձ�����  �߶� ����
		}
		
		return dialogue; // ��� �迭���� ��ȯ�Ѵ�.
	}
	
	public static String[] getDialogue_A_Normal1()
	{	
		for(int i = 0; i < 100; i++)
		{
			dialogue[i] = ""; // String�� ������ ��ĭ���� ä��� (�̰� ������ NullPointerException �߻�)
		}
		
		try
		{
			br = new BufferedReader(new FileReader("./�Ϲ�1-1.txt")); // ������ ��� ������ �о�´�
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) // �� �̻� ���� ���� ���� �� ���� �� �پ� line�� String ���·� ����
			{
				dialogue[i] = line; // i��° ���� ��縦 dialogue �迭�� ����
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++)
		{
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // ���忡 "//"�ձ�����  �߶� ����
		}
		
		return dialogue; // ��� �迭���� ��ȯ�Ѵ�.
	}
	
	public static String[] getDialogue_A_Normal2()
	{
		for(int i = 0; i < 100; i++)
		{
			dialogue[i] = ""; // String�� ������ ��ĭ���� ä��� (�̰� ������ NullPointerException �߻�)
		}
		
		try
		{
			br = new BufferedReader(new FileReader("./�Ϲ�2-1.txt")); // ������ ��� ������ �о�´�
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) // �� �̻� ���� ���� ���� �� ���� �� �پ� line�� String ���·� ����
			{
				dialogue[i] = line; // i��° ���� ��縦 dialogue �迭�� ����
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++)
		{
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // ���忡 "//"�ձ�����  �߶� ����
		}
		
		return dialogue; // ��� �迭���� ��ȯ�Ѵ�.
	}
	
	public static String[] getDialogue_A_Normal3()
	{
		for(int i = 0; i < 100; i++)
		{
			dialogue[i] = ""; // String�� ������ ��ĭ���� ä��� (�̰� ������ NullPointerException �߻�)
		}
		
		try
		{
			br = new BufferedReader(new FileReader("./�Ϲ�3-1.txt")); // ������ ��� ������ �о�´�
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) // �� �̻� ���� ���� ���� �� ���� �� �پ� line�� String ���·� ����
			{
				dialogue[i] = line; // i��° ���� ��縦 dialogue �迭�� ����
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++)
		{
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // ���忡 "//"�ձ�����  �߶� ����
		}
		
		return dialogue; // ��� �迭���� ��ȯ�Ѵ�.
	}
	
	public static String[] getDialogue_A_Holiday()
	{
		for(int i = 0; i < 100; i++)
		{
			dialogue[i] = ""; // String�� ������ ��ĭ���� ä��� (�̰� ������ NullPointerException �߻�)
		}
		
		try
		{
			br = new BufferedReader(new FileReader("./����.txt")); // ������ ��� ������ �о�´�
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) // �� �̻� ���� ���� ���� �� ���� �� �پ� line�� String ���·� ����
			{
				dialogue[i] = line; // i��° ���� ��縦 dialogue �迭�� ����
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++)
		{
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // ���忡 "//"�ձ�����  �߶� ����
		}
		
		return dialogue; // ��� �迭���� ��ȯ�Ѵ�.
	}
	
	public static String[] getDialogue_C()
	{
		for(int i = 0; i < 100; i++)
		{
			dialogue[i] = ""; // String�� ������ ��ĭ���� ä��� (�̰� ������ NullPointerException �߻�)
		}
		
		try
		{
			br = new BufferedReader(new FileReader("./������ ��ȭ.txt")); // ������ ��� ������ �о�´�
			String line;

			int i;
			for(i = 0 ; (line = br.readLine()) != null; i++) // �� �̻� ���� ���� ���� �� ���� �� �پ� line�� String ���·� ����
			{
				dialogue[i] = line; // i��° ���� ��縦 dialogue �迭�� ����
			}
		} catch(IOException e) {};
		
		for(int j = 0; j < 100; j++)
		{
			int k = dialogue[j].indexOf("//");
			if(k == -1)
				continue;
			dialogue[j] = dialogue[j].substring(0, k); // ���忡 "//"�ձ�����  �߶� ����
		}
		
		return dialogue; // ��� �迭���� ��ȯ�Ѵ�.
	}
}
