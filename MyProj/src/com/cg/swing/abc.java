package com.cg.swing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
 class abc extends JFrame implements ActionListener,ItemListener,AdjustmentListener
 {
   JFrame f;
   JScrollBar bar,bar1;
   JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
   JButton b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31;
   JComboBox month,year;
   JTextField date;
   String m1,y1;
   String d="1",winlook;
   GregorianCalendar gcalendar;
   Calendar calendar;
   String[] tmp={"January","March","May","July","August","October","December"};
   int mon,yr;

   public static void main(String args[])
   {
    abc date_Cal=new abc();
   }
      public abc()
     {
       super("DATE CALENDAR");
      try
        {
         winlook=UIManager.getSystemLookAndFeelClassName();
         UIManager.setLookAndFeel(winlook);
        }
        catch(Exception e)
        {
        }

       //setBounds(300,50,240,230);
       setSize(300,200);
	//setExtendedState(JFrame.MAXIMIZED_BOTH);
       //getContentPane().setLayout(new GridLayout(3,1,0,0) );
       getContentPane().setLayout(new FlowLayout() );
       //setResizable(false);
       //setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        JPanel scroll=new JPanel();
        //JPanel p=new  JPanel(new GridLayout(1,4,10,10));
        JPanel p=new  JPanel(new FlowLayout());

        year=new JComboBox();
        for(int i=1900;i<9999;i++)
        year.addItem(""+i);

        year.setToolTipText("Select year from here");
        p.add(year);
        year.addItemListener(this);

        bar=new JScrollBar(JScrollBar.VERTICAL,0,1,0,9999 );


        bar.addAdjustmentListener(this);
        p.add(bar);


        gcalendar=new GregorianCalendar();
       String[] m={"January","February","March","April","May","June","July","August","September","October","November","December"};
       month=new JComboBox(m);

       month.addItemListener(this);
       p.add(month);
       month.setToolTipText("Select month from here");

       mon=month.getSelectedIndex()+1;
       try
	{
       yr=Integer.parseInt(year.getSelectedItem().toString());
	}
	catch(NumberFormatException e)
	{
   	 System.out.println("Error1:"+e.getMessage());
	}
       calendar = Calendar.getInstance();

        bar1=new JScrollBar(JScrollBar.VERTICAL,0,1,0,12);

        bar1.addAdjustmentListener(this);

        p.add(bar1);






       scroll.add(p);
       getContentPane().add(scroll);



        JPanel btn1=new JPanel();
        JPanel p1=new  JPanel(new GridLayout(5,7,0,0));
         //JPanel p1=new  JPanel(new FlowLayout());

       b1=new JButton("1");
       p1.add(b1);
       b1.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==1)
       b1.setBackground(new Color(255,0,0));


       b2=new JButton("2");
       p1.add(b2);
       b2.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==2)
       b2.setBackground(new Color(255,0,0));


       b3=new JButton("3");
       p1.add(b3);
       b3.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==3)
       b3.setBackground(new Color(255,0,0));



       b4=new JButton("4");
       p1.add(b4);
       b4.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==4)
       b4.setBackground(new Color(255,0,0));

       b5=new JButton("5");
       p1.add(b5);
       b5.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==5)
       b5.setBackground(new Color(255,0,0));



       b6=new JButton("6");
       p1.add(b6);
       b6.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==6)
       b6.setBackground(new Color(255,0,0));

       b7=new JButton("7");
       p1.add(b7);
       b7.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==7)
       b7.setBackground(new Color(255,0,0));

       b8=new JButton("8");
       p1.add(b8);
       b8.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==8)
       b8.setBackground(new Color(255,0,0));

       b9=new JButton("9");
       p1.add(b9);
       b9.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==9)
       b9.setBackground(new Color(255,0,0));

       b10=new JButton("10");
       p1.add(b10);
       b10.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==10)
       b10.setBackground(new Color(255,0,0));



       b11=new JButton("11");
       p1.add(b11);
       b11.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==11)
       b11.setBackground(new Color(255,0,0));

       b12=new JButton("12");
       p1.add(b12);
       b12.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==12)
       b12.setBackground(new Color(255,0,0));

       b13=new JButton("13");
       p1.add(b13);
       b13.addActionListener(this);
        if(gcalendar.get(Calendar.DATE)==13)
       b13.setBackground(new Color(255,0,0));

       b14=new JButton("14");
       p1.add(b14);
       b14.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==14)
       b14.setBackground(new Color(255,0,0));



       b15=new JButton("15");
       p1.add(b15);
       b15.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==15)
       b15.setBackground(new Color(255,0,0));




       b16=new JButton("16");
       p1.add(b16);
       b16.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==16)
       b16.setBackground(new Color(255,0,0));



       b17=new JButton("17");
       p1.add(b17);
       b17.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==17)
       b17.setBackground(new Color(255,0,0));


       b18=new JButton("18");
       p1.add(b18);
       b18.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==18)
       b18.setBackground(new Color(255,0,0));


       b19=new JButton("19");
       p1.add(b19);
       b19.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==19)
       b19.setBackground(new Color(255,0,0));


       b20=new JButton("20");
       p1.add(b20);
       b20.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==20)
       b20.setBackground(new Color(255,0,0));


       b21=new JButton("21");
       p1.add(b21);
       b21.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==21)
       b21.setBackground(new Color(255,0,0));


       b22=new JButton("22");
       p1.add(b22);
       b22.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==22)
       b22.setBackground(new Color(255,0,0));


       b23=new JButton("23");
       p1.add(b23);
       b23.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==23)
       b23.setBackground(new Color(255,0,0));



       b24=new JButton("24");
       p1.add(b24);
       b24.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==24)
       b24.setBackground(new Color(255,0,0));


       b25=new JButton("25");
       p1.add(b25);
       b25.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==25)
       b25.setBackground(new Color(255,0,0));



       b26=new JButton("26");
       p1.add(b26);
       b26.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==26)
       b26.setBackground(new Color(255,0,0));


       b27=new JButton("27");
       p1.add(b27);
       b27.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==27)
       b27.setBackground(new Color(255,0,0));


       b28=new JButton("28");
       p1.add(b28);
       b28.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==28)
       b28.setBackground(new Color(255,0,0));



       b29=new JButton("29");
       p1.add(b29);
       b29.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==29)
       b29.setBackground(new Color(255,0,0));



       b30=new JButton("30");
       p1.add(b30);
       b30.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==30)
       b30.setBackground(new Color(255,0,0));


       b31=new JButton("31");
       p1.add(b31);
       b31.addActionListener(this);
       if(gcalendar.get(Calendar.DATE)==31)
       b31.setBackground(new Color(255,0,0));





       btn1.add(p1);
       getContentPane().add(btn1);


         JPanel txt=new JPanel();
        //JPanel p7=new  JPanel(new GridLayout(1,1,0,0));
         JPanel p7=new  JPanel(new FlowLayout());


         showToolTip();



       date=new JTextField(12);
       p7.add(date);

	try
	{
       m1=Integer.toString(gcalendar.get(Calendar.MONTH));
       y1=Integer.toString(gcalendar.get(Calendar.YEAR));
       d=Integer.toString(gcalendar.get(Calendar.DATE));
	}
	catch(NumberFormatException e)
	{
   	 System.out.println("Error2:"+e.getMessage());
	}
       month.setSelectedIndex(gcalendar.get(Calendar.MONTH));
       year.setSelectedItem(""+y1);

	//JOptionPane.showMessageDialog(null,"Month:"+(m1+1));
//	JOptionPane.showMessageDialog(null,"Day1:"+gcalendar.get(Calendar.DATE));
	//JOptionPane.showMessageDialog(null,"Year:"+y1);

       date.setText(m[gcalendar.get(Calendar.MONTH)]+" "+d+" "+y1);
       date.setEditable(false);



        txt.add(p7);
       getContentPane().add(txt);


        if(!m1.equals("February"))
          {
           b29.setEnabled(true);
           b30.setEnabled(true);
           int cnt=0;
           while(cnt < tmp.length)
           {
            if(m1.equals(tmp[cnt]))
                 b31.setEnabled(true);
            cnt++;
           }
          }

            if(m1.equals("February"))
          {
           b29.setEnabled(false);
           b30.setEnabled(false);
           b31.setEnabled(false);
          }
           if(gcalendar.isLeapYear(Integer.parseInt(y1)) && m1.equals("February"))
          {
           b29.setEnabled(true);
           b30.setEnabled(false);
           b31.setEnabled(false);
          }


       setVisible(true);

      }

      public void actionPerformed(ActionEvent ae)
      {
        d=(String)ae.getActionCommand();
        date.setText(m1+" "+d+" "+y1);
        date.setText(date.getText());
        dispose();
        setVisible(false);
      }
      public void itemStateChanged(ItemEvent ie)
      {
        b29.setEnabled(false);
        b30.setEnabled(false);
        b31.setEnabled(false);
        if(ie.getSource()==month)
        {

           m1=(String)ie.getItem();
          if(!m1.equals("February"))
          {
           b29.setEnabled(true);
           b30.setEnabled(true);
           int cnt=0;
           while(cnt < tmp.length)
           {
            if(m1.equals(tmp[cnt]))
                 b31.setEnabled(true);
            cnt++;
           }
          }

            if(m1.equals("February"))
          {
           b29.setEnabled(false);
           b30.setEnabled(false);
           b31.setEnabled(false);
          }
           if(gcalendar.isLeapYear(Integer.parseInt(y1)) && m1.equals("February"))
          {
           b29.setEnabled(true);
           b30.setEnabled(false);
           b31.setEnabled(false);
          }

          date.setText(m1+" "+d+" "+y1);
         showToolTip();
        }

       if(ie.getSource()==year)
       {
        y1=(String)ie.getItem();
         if(!m1.equals("February"))
          {
           b29.setEnabled(true);
           b30.setEnabled(true);
           b31.setEnabled(true);
          }

          if(m1.equals("February"))
          {
           b29.setEnabled(false);
           b30.setEnabled(false);
           b31.setEnabled(false);
          }

         if(gcalendar.isLeapYear(Integer.parseInt(y1)) && m1.equals("February"))
          {
           b29.setEnabled(true);
           b30.setEnabled(false);
           b31.setEnabled(false);
          }


         date.setText(m1+" "+d+" "+y1);
        showToolTip();
       }

      }
      public void adjustmentValueChanged(AdjustmentEvent ae)
       {
              if(ae.getSource()==bar)
              year.setSelectedIndex(bar.getValue());

              if(ae.getSource()==bar1)
              month.setSelectedIndex(bar1.getValue());

        }
        void showToolTip()
        {
          mon=month.getSelectedIndex();
          yr=Integer.parseInt(year.getSelectedItem().toString());

          calendar.set(yr,mon,1);
          b1.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,2);
          b2.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,3);
          b3.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,4);
          b4.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,5);
          b5.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,6);
          b6.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,7);
          b7.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,8);
          b8.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,9);
          b9.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,10);
          b10.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,11);
          b11.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,12);
          b12.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,13);
          b13.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,14);
          b14.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,15);
          b15.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,16);
          b16.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,17);
          b17.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,18);
          b18.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,19);
          b19.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,20);
          b20.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,21);
          b21.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,22);
          b22.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,23);
          b23.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,24);
          b24.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,25);
          b25.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,26);
          b26.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,27);
          b27.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          calendar.set(yr,mon,28);
          b28.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));

          if(b29.isEnabled())
          {
           calendar.set(yr,mon,29);
           b29.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));
          }
          else
           b29.setToolTipText("");

          if(b30.isEnabled())
           {
            calendar.set(yr,mon,30);
            b30.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));
           }
           else
           b30.setToolTipText("");

           if(b31.isEnabled())
           {
            calendar.set(yr,mon,31);
            b31.setToolTipText(Week_Day(calendar.get(Calendar.DAY_OF_WEEK)));
           }
           else
           b31.setToolTipText("");



        }

       String Week_Day(int day)
        {
         switch (day)
          {

            case 1:
              return "Sunday";
            case 2:
              return "Monday";
            case 3:
              return "Tuesday";
            case 4:
              return "Wednesday";
            case 5:
              return "Thursday";
	    case 6:
              return "Friday";
            case 7:
              return "Saturday";
          }
          return "";
        }
 }
