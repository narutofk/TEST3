package ui_test;

import java.awt.*;  
import javax.swing.*;  


public class MyExGUI extends JFrame{
	JMenuBar jmb;   //�˵������  
    JMenu menu1, menu2, menu3, menu4, menu5;//�˵�  
    JMenuItem item1, item2, item3, item4, item5, item6;//�˵���  
    JMenu build;    //�����˵�  
    JMenuItem file, project;  
    JTextArea jta;  
      
    JToolBar jtb;//������  
    JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7;  
      
    public MyExGUI()
    {  
        //�����˵�  
        jmb = new JMenuBar();  
          
        menu1 = new JMenu("�ļ�(F)");  
        menu1.setMnemonic('f'); //���Ƿ�  
        menu2 = new JMenu("�༭");  
        menu2.setMnemonic('E');  
        menu3 = new JMenu("��ʽ");  
        menu4 = new JMenu("�鿴");  
        menu5 = new JMenu("����");  
          
        build = new JMenu("�½�");  
          
        file = new JMenuItem("�ļ�");  
        project = new JMenuItem("����");  
        item1 = new JMenuItem("��");  
        item2 = new JMenuItem("����(S)");  
        item3 = new JMenuItem("���Ϊ");  
        item4 = new JMenuItem("ҳ������");  
        item5 = new JMenuItem("��ӡ");  
        item6 = new JMenuItem("�˳�");  
          
        jta = new JTextArea();  
          
            //��Ӳ˵������˵���  
        build.add(file);  
        build.add(project);  
          
        menu1.add(build);  
        menu1.add(item1);  
        menu1.add(item2);  
        menu1.add(item3);  
        menu1.addSeparator();  
        menu1.add(item4);  
        menu1.add(item5);  
        menu1.add(item6);  
            //���˵��������˵���  
        jmb.add(menu1);  
        jmb.add(menu2);  
        jmb.add(menu3);  
        jmb.add(menu4);  
        jmb.add(menu5);  
        //����������  
        jtb = new JToolBar();  
        jb1 = new JButton("�½�");  
        jb1.setToolTipText("�½�");//�����ͣ��ʾ��Ϣ  
        jb2 = new JButton("��");  
        jb3 = new JButton("����");  
        jb4 = new JButton("����");  
        jb5 = new JButton("��ӡ");  
        jtb.add(jb1);  
        jtb.add(jb2);  
        jtb.add(jb3);  
        jtb.add(jb4);  
        jtb.add(jb5);  
        jta = new JTextArea();  
            //���������  
        //JScrollPane jsp = new JScrollPane(jta);  
        //jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);  
          
        this.setJMenuBar(jmb);  //��Ӳ˵����������趨λ�ã����Զ��������ϲ�  
        //this.add(jtb, BorderLayout.NORTH);  //��ӹ�����  
        //this.add(jsp, BorderLayout.CENTER); //����ı���  
          
        this.setTitle("NotePad");  
        this.setSize(600, 500);  
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
	
	
}
