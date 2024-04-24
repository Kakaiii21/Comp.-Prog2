package FoodOrdering;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.*;

public class OrderingFrame extends JFrame implements ActionListener {
	

	
	JPanel panel_name = new JPanel();
	JLabel name_brew = new JLabel("Brew And Baked Cafe", SwingConstants.CENTER);
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel_SP = new JPanel();

	
	
//--------Radio Buttons
	JRadioButton rbDineIn = new JRadioButton();
	JRadioButton rbTakeOut = new JRadioButton();
	ButtonGroup bgButton = new ButtonGroup();
	
	
	
//--------CheckBox for Coffee Panel

	JCheckBox[] cbCoffee = new JCheckBox[10];
	String[] menuCoffee = {"Latte", "Machiatto",
	"Irish Coffee", "Cafe Mocha", "Matcha Latte",
	"Affogato", "Hot Chocolate", "Cappuccino",
	"Americano", "Flat White"};
	
	double[] menuPrice = {50.00, 100.00, 150.00, 200.00, 250.00, 300.00, 350.00, 400.00, 450.00, 500.00};
	JLabel[] lblPrice = new JLabel[10];
	


	DefaultListModel<String> dlmItem1 = new DefaultListModel<String>();
	JList<String> lItem1 = new JList<String>(dlmItem1);

	DefaultListModel<String> dlmPrice1 = new DefaultListModel<String>();

	JScrollPane spScroll1 = new JScrollPane(lItem1);
	

//--------CheckBox for Pastries	Panel
	
	JCheckBox[] cbPastries = new JCheckBox[10];
	String[] menuPastries = {"Croissant", "Danish Pastry", "Muffin", 
			"Scone", "Cinnamon Roll", "Éclair", "Painau Chocolat", 
			"Turnover", "Macaron", "Palmier"};
	
	double[] menuPrice_Pastries = {50.00, 100.00, 150.00, 200.00, 250.00, 300.00, 350.00, 400.00, 450.00, 500.00};
	JLabel[] lblPastries = new JLabel[10];

	
	
//--------CheckBox for Smoothies Panel
	
		JCheckBox[] cbSmoothies = new JCheckBox[5];
		String[] menuSmoothies = {"Berry Blast", "Tropical Delight", "Green Detox", 
				"Banana", "Citrus Splash"};
		
		double[] menuPrice_Smoothies = {300.00, 350.00, 400.00, 450.00, 500.00};
		JLabel[] lblSmoothies = new JLabel[5];

//--------CheckBox for Pastries	Panel
		
		JCheckBox[] cbAdd_ons = new JCheckBox[5];
		String[] menuAdd_ons = {"Whipped Cream", "Extra Espresso Shot", "Flavored Syrup", 
				"Cinnamon Powder", "Chocolate Shavings"};
		
		double[] menuPrice_Add_ons = {300.00, 350.00, 400.00, 450.00, 500.00};
		JLabel[] lblAdd_ons = new JLabel[5];
		
//---------- Labels in Panel 1
		JLabel coffee = new JLabel();
	
//---------- Labels in Panel 2	

		JLabel pastries = new JLabel();
	
//---------- Labels in Panel 3	

		JLabel smoothies = new JLabel();
		JLabel Add_ons = new JLabel();
	

//---------- Labels in Panel 4	

		JLabel orderD = new JLabel();

	
		JLabel discount = new JLabel();
		JRadioButton studentD = new JRadioButton();
		JRadioButton seniorD = new JRadioButton();
		JRadioButton pwdD = new JRadioButton();
		ButtonGroup DisC_Button = new ButtonGroup();

		JLabel total = new JLabel();
		JLabel discounted = new JLabel();
		JLabel payment = new JLabel();
		JLabel change = new JLabel();

		JButton cancel = new JButton();
		JButton buy = new JButton();
	
//---------- TextFields in Panel 4	
	
		JTextField txtB_total = new JTextField();
		JTextField txtB_discounted = new JTextField();
		JTextField txtB_payment = new JTextField();
		JTextField txtB_change = new JTextField();


	
	
	OrderingFrame(){
		
		
		
		
	Image IconImage = new ImageIcon("Brew.png").getImage();
	this.setIconImage(IconImage);
		
		
	ImageIcon bAndb = new ImageIcon("bg.png");
	Image image_brew = bAndb.getImage(); 

//---------------Images in Panel 2
	ImageIcon image_latte = new ImageIcon("latte-10.jpg");
	Image imageLatte = image_latte.getImage(); 

	ImageIcon image_coffe = new ImageIcon("coffe.jpg");
	Image imageCoffe = image_coffe.getImage(); 
	 
//---------------Images in Panel 2
	ImageIcon image_muffins = new ImageIcon("Image.jpg");
	Image image = image_muffins.getImage(); 

	ImageIcon image1 = new ImageIcon("Image2.jpg");
	Image image_1 = image1.getImage(); 
	 
	 
	 
	 
//______________________________Brew And Baked Cafe____________________________________________//

	 

	 this.add(panel_name);
	 
	 panel_name.add(name_brew);

	 panel_name.setLayout(null);
	 panel_name.setBounds(200,20,800,110);
	 panel_name.setBackground(Color.decode("#904C24"));

	 name_brew.setBounds(10,10,780,85);
	 name_brew.setBackground(Color.decode("#FEECE0"));
	 name_brew.setOpaque(true);
	 name_brew.setForeground(Color.decode("#904C24"));
	 name_brew.setFont(new Font("Island Moments", Font.TRUETYPE_FONT , 80));

	 
	 
		
//______________________________Panel 1____________________________________________//
		
	 	panel1.setLayout(null);
		panel1.setBounds(20,150,380,600);
		panel1.setBackground(Color.decode("#904C24"));
		panel1.add(coffee);


//------------------------------- Pastries
		
		coffee.setBounds(10,10,360,80);
		coffee.setText("Coffee");
		coffee.setBackground(Color.decode("#FEECE0"));
		coffee.setOpaque(true);
		coffee.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 50));
		coffee.setForeground(Color.decode("#904C24"));
		coffee.setHorizontalAlignment(SwingConstants.CENTER);
				
//------------------------------- Image 1
				
		Image resizedImagelatte = imageLatte.getScaledInstance(200,250, imageLatte.SCALE_SMOOTH); 
		ImageIcon resizedIconlatte = new ImageIcon(resizedImagelatte);
		JLabel image1Labellatte = new JLabel(resizedIconlatte); 
		panel1.add(image1Labellatte);
				
		image1Labellatte.setBounds(215,95,155,120);

				 
//------------------------------- Image 2
		 Image resizedImage1coffe = imageCoffe.getScaledInstance(200,160, Image.SCALE_AREA_AVERAGING); 
		 ImageIcon resizedIconcoffe = new ImageIcon(resizedImage1coffe);
		 JLabel image1Labelcoffee = new JLabel(resizedIconcoffe); 
		 panel1.add(image1Labelcoffee);
					
		 image1Labelcoffee.setBounds(10,95,200,120);	

//=================================== CheckBox For Coffee =========================//
		 
//------loop1
		int y = 230;
		for(int i = 0; i < 10; i++){

//----------CheckBox for Coffee Menu
		cbCoffee[i] = new JCheckBox();
		cbCoffee[i].setBounds(20, y, 300, 30);
		cbCoffee[i].setText(menuCoffee[i]);
		cbCoffee[i].setFocusable(false);
		cbCoffee[i].setForeground(Color.decode("#FEECE0"));
		cbCoffee[i].setFont(new Font("Inria Serif", Font.PLAIN, 30));
		cbCoffee[i].setOpaque(false);
		cbCoffee[i].addActionListener(this);
		cbCoffee[i].setFocusable(false);
		
//----------CheckBox for Coffee Price
		lblPrice[i] = new JLabel();
		lblPrice[i].setBounds(280, y, 150, 30);
		lblPrice[i].setText( "₱ " + String.format("%.2f",  menuPrice[i]));
		lblPrice[i].setFont(new Font("Sans Serif", Font.PLAIN, 20));
		lblPrice[i].setForeground(Color.decode("#FEECE0"));
		lblPrice[i].setFocusable(false);




 //---------add
		panel1.add(cbCoffee[i]);
		panel1.add(lblPrice[i]);


		 y+=35;


			 }
		 
		 
		
//______________________________Panel 2____________________________________________//
		panel2.setLayout(null);

		panel2.setBounds(410,150,380,600);
		
		panel2.setBackground(Color.decode("#904C24"));
		panel2.add(pastries);
	
//------------------------------- Pastries
		
		pastries.setBounds(10,10,360,80);
		pastries.setText("Pastries");
		pastries.setBackground(Color.decode("#FEECE0"));
		pastries.setOpaque(true);
		pastries.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 50));
		pastries.setForeground(Color.decode("#904C24"));
		pastries.setHorizontalAlignment(SwingConstants.CENTER);
		
//------------------------------- Image 1
		
		 Image resizedImage = image_1.getScaledInstance(200,120, image_1.SCALE_SMOOTH); 
		 ImageIcon resizedIcon = new ImageIcon(resizedImage);
		 JLabel image1Label = new JLabel(resizedIcon); 
		 panel2.add(image1Label);
			
		 image1Label.setBounds(10,95,200,120);	
		 
		 
//------------------------------- Image 2
		 Image resizedImage1 = image.getScaledInstance(200,150, Image.SCALE_DEFAULT); 
		 ImageIcon resizedIcon1 = new ImageIcon(resizedImage1);
		 JLabel image1Label1 = new JLabel(resizedIcon1); 
		 panel2.add(image1Label1);
			
		 image1Label1.setBounds(215,95,155,120);
		 

//=================================== CheckBox For Pastries =========================//
		 
		int yp = 230;
		for(int i = 0; i < 10; i++){

//----------CheckBox for Pastries Menu
			cbPastries[i] = new JCheckBox();
			cbPastries[i].setBounds(20, yp, 300, 30);
			cbPastries[i].setText(menuPastries[i]);
			cbPastries[i].setFocusable(false);
			cbPastries[i].setForeground(Color.decode("#FEECE0"));
			cbPastries[i].setFont(new Font("Inria Serif", Font.PLAIN, 30));
			cbPastries[i].setOpaque(false);
			cbPastries[i].addActionListener(this);
			cbPastries[i].setFocusable(false);
					
//----------CheckBox for Pastries Price
			lblPastries[i] = new JLabel();
			lblPastries[i].setBounds(280, yp, 150, 30);
			lblPastries[i].setText( "₱ " + String.format("%.2f",  menuPrice[i]));
			lblPastries[i].setFont(new Font("Sans Serif", Font.PLAIN, 20));
			lblPastries[i].setForeground(Color.decode("#FEECE0"));
			lblPastries[i].setFocusable(false);




			 //---------add
					panel2.add(cbPastries[i]);
					panel2.add(lblPastries[i]);


					 yp+=35;


						 }
		 
//______________________________Panel 3____________________________________________//
		
		panel3.setLayout(null);
		panel3.setBounds(800,150,380,600);
		panel3.setBackground(Color.decode("#904C24"));
		
		panel3.add(smoothies);
		panel3.add(Add_ons);


//------------------------------- Smoothies
				
		smoothies.setBounds(10,10,360,80);
		smoothies.setText("Smoothies");
		smoothies.setBackground(Color.decode("#FEECE0"));
		smoothies.setOpaque(true);
		smoothies.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 50));
		smoothies.setForeground(Color.decode("#904C24"));
		smoothies.setHorizontalAlignment(SwingConstants.CENTER);
						

//=================================== CheckBox For Smoothies =========================//
	
				int ys = 100;
				for(int i = 0; i < 5; i++){

//----------CheckBox for Smoothies Menu
			cbSmoothies[i] = new JCheckBox();
			cbSmoothies[i].setBounds(20, ys, 300, 30);
			cbSmoothies[i].setText(menuSmoothies[i]);
			cbSmoothies[i].setFocusable(false);
			cbSmoothies[i].setForeground(Color.decode("#FEECE0"));
			cbSmoothies[i].setFont(new Font("Inria Serif", Font.PLAIN, 30));
			cbSmoothies[i].setOpaque(false);
			cbSmoothies[i].addActionListener(this);
			cbSmoothies[i].setFocusable(false);
							
//----------CheckBox for Smoothies Price
			lblSmoothies[i] = new JLabel();
			lblSmoothies[i].setBounds(280, ys, 150, 30);
			lblSmoothies[i].setText( "₱ " + String.format("%.2f",  menuPrice[i]));
			lblSmoothies[i].setFont(new Font("Sans Serif", Font.PLAIN, 20));
			lblSmoothies[i].setForeground(Color.decode("#FEECE0"));
			lblSmoothies[i].setFocusable(false);




		//---------add
			panel3.add(cbSmoothies[i]);
			panel3.add(lblSmoothies[i]);

			ys+=35;

								 }
				 		
	
//------------------------------- Add_ons
				
		Add_ons.setBounds(10,300,360,80);
		Add_ons.setText("Add_ons");
		Add_ons.setBackground(Color.decode("#FEECE0"));
		Add_ons.setOpaque(true);
		Add_ons.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 50));
		Add_ons.setForeground(Color.decode("#904C24"));
		Add_ons.setHorizontalAlignment(SwingConstants.CENTER);
		
//=================================== CheckBox For Add_ons =========================//
						
		int ya = 400;
		for(int i = 0; i < 5; i++){

//----------CheckBox for Add_ons Menu
			cbAdd_ons[i] = new JCheckBox();
			cbAdd_ons[i].setBounds(20, ya, 300, 30);
			cbAdd_ons[i].setText(menuAdd_ons[i]);
			cbAdd_ons[i].setFocusable(false);
			cbAdd_ons[i].setForeground(Color.decode("#FEECE0"));
			cbAdd_ons[i].setFont(new Font("Inria Serif", Font.PLAIN, 20));
			cbAdd_ons[i].setOpaque(false);
			cbAdd_ons[i].addActionListener(this);
			cbAdd_ons[i].setFocusable(false);
					
//----------CheckBox for Add_ons Price
			lblAdd_ons[i] = new JLabel();
			lblAdd_ons[i].setBounds(280, ya, 150, 30);
			lblAdd_ons[i].setText( "₱ " + String.format("%.2f",  menuPrice[i]));
			lblAdd_ons[i].setFont(new Font("Sans Serif", Font.PLAIN, 20));
			lblAdd_ons[i].setForeground(Color.decode("#FEECE0"));
			lblAdd_ons[i].setFocusable(false);




//---------add
	panel3.add(cbAdd_ons[i]);
	panel3.add(lblAdd_ons[i]);

	ya+=35;

						 }

//______________________________Panel 4____________________________________________//
		
		panel4.setLayout(null);
		panel4.setBounds(1210,30,300,720);
		panel4.setBackground(Color.decode("#904C24"));
		
		
		panel4.add(orderD);
		panel4.add(rbDineIn);
		panel4.add(rbTakeOut);

		panel4.add(discount);
		panel4.add(studentD);
		panel4.add(seniorD);
		panel4.add(pwdD);
		panel4.add(total);
		panel4.add(discounted);
		panel4.add(payment);
		panel4.add(change);
		panel4.add(cancel);
		panel4.add(buy);

		panel4.add(txtB_total);
		panel4.add(txtB_discounted);
		panel4.add(txtB_payment);
		panel4.add(txtB_change);

		
		
		
		
		orderD.setBounds(40,0,230,50); 
		orderD.setText("ORDER DETAILS");
		orderD.setBackground(Color.decode("#FEECE0"));
		orderD.setOpaque(true);
		orderD.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 30));
		orderD.setForeground(Color.decode("#904C24"));
		orderD.setHorizontalAlignment(SwingConstants.CENTER);
						
		

		 
//------Radio Button For Dine In
		 
		 rbDineIn.setBounds(50, 60, 100, 30);
		 rbDineIn.setText("Dine In");
		 rbDineIn.setFocusable(false);
		 rbDineIn.setFont(new Font("Italiana", Font.BOLD, 20));
		 rbDineIn.setForeground(Color.decode("#F8D8C3"));
		 rbDineIn.setOpaque(false);

//------Radio Button For Take Out

		 rbTakeOut.setBounds(150, 60, 150, 30);
		 rbTakeOut.setText("Take Out");
		 rbTakeOut.setFocusable(false);
		 rbTakeOut.setFont(new Font("Italiana", Font.BOLD, 20));
		 rbTakeOut.setForeground(Color.decode("#F8D8C3"));
		 rbTakeOut.setOpaque(false);
		 
//------ButtonGroup
		 
		 bgButton.add(rbDineIn);
		 bgButton.add(rbTakeOut);
		 
		 
	
		 
		 
//-----------Discount
		 discount.setBounds(20, 380, 150, 30);
		 discount.setText("Discount:");
		 discount.setFont(new Font("Italiana", Font.BOLD, 30));
		 discount.setForeground(Color.decode("#F8D8C3"));
		 discount.setOpaque(false);

//----------- Radio Buttons For Discount
		 
		 studentD.setBounds(15, 420, 100, 30);
		 studentD.setText("Student(3%)");
		 studentD.setFocusable(false);
		 studentD.setFont(new Font("Italiana", Font.BOLD, 13));
		 studentD.setForeground(Color.decode("#F8D8C3"));
		 studentD.setOpaque(false);
		 
		 
		 seniorD.setBounds(115, 420, 100, 30);
		 seniorD.setText("Senior(20%)");
		 seniorD.setFocusable(false);
		 seniorD.setFont(new Font("Italiana", Font.BOLD, 13));
		 seniorD.setForeground(Color.decode("#F8D8C3"));
		 seniorD.setOpaque(false);
		 
		 pwdD.setBounds(215, 420, 100, 30);
		 pwdD.setText("PWD(40%)");
		 pwdD.setFocusable(false);
		 pwdD.setFont(new Font("Italiana", Font.BOLD, 13));
		 pwdD.setForeground(Color.decode("#F8D8C3"));
		 pwdD.setOpaque(false);
		 
		 
		 DisC_Button.add(studentD);
		 DisC_Button.add(seniorD);
		 DisC_Button.add(pwdD);
		 
		 
//--------------------------Labels in Panel 4 -------------------------//
		 
//-----------total Label
		 
		 total.setBounds(20, 470, 150, 30);
		 total.setText("Total:");
		 total.setFont(new Font("Italiana", Font.BOLD, 30));
		 total.setForeground(Color.decode("#F8D8C3"));
		 total.setOpaque(false);
		 
		 
//-----------discounted Label
		 
		 discounted.setBounds(20, 510, 180, 30);
		 discounted.setText("Discounted:");
		 discounted.setFont(new Font("Italiana", Font.BOLD, 30));
		 discounted.setForeground(Color.decode("#F8D8C3"));
		 discounted.setOpaque(false);
		 
//-----------payment Label
		 
		 payment.setBounds(20, 550, 150, 30);
		 payment.setText("Payment:");
		 payment.setFont(new Font("Italiana", Font.BOLD, 30));
		 payment.setForeground(Color.decode("#F8D8C3"));
		 payment.setOpaque(false);
		 
//-----------change Label
		 
		 change.setBounds(20, 590, 150, 35);
		 change.setText("Change:");
		 change.setFont(new Font("Italiana", Font.BOLD, 30));
		 change.setForeground(Color.decode("#F8D8C3"));
		 change.setOpaque(false);
		 
//======== Total TextBox
		 txtB_total.setLayout(null);
		 txtB_total.setBounds( 110,470, 180, 30);
		 txtB_total.setFont(new Font("Italiana", Font.BOLD, 30));
		 txtB_total.setForeground(Color.decode("#904C24"));
		 txtB_total.setEnabled(false);
		 
//======== Discounted TextBox
		 txtB_discounted.setBounds( 190,510, 100, 30);
		 txtB_discounted.setFont(new Font("Italiana", Font.BOLD, 30));
		 txtB_discounted.setForeground(Color.decode("#904C24"));
		 txtB_discounted.setEnabled(false);
		 
//======== Payment TextBox
		 txtB_payment.setBounds( 160,550, 130, 30);
		 txtB_payment.setFont(new Font("Italiana", Font.BOLD, 30));
		 txtB_payment.setForeground(Color.decode("#904C24"));
		 
//======== Change TextBox
		 txtB_change.setBounds( 140, 590, 150, 30);
		 txtB_change.setFont(new Font("Italiana", Font.BOLD, 30));
		 txtB_change.setForeground(Color.decode("#904C24"));
		 txtB_change.setEnabled(false);
		 
		 
//======================= Button For Panel 4 =================================//
		 
//------------------Cancel Button
		 
		 cancel.setBounds(10,650,150,50);
		 cancel.setText("Cancel");
		 cancel.setForeground(Color.decode("#E80909"));
		 cancel.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 30));
		 cancel.setBackground(Color.white);
		 cancel.setFocusable(false);
		 		 
		 
//------------------Cancel Button
		 
		 buy.setBounds(170,650,125,50);
		 buy.setText("Buy");
		 buy.setForeground(Color.decode("#1E6F26"));
		 buy.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 30));
		 buy.setBackground(Color.white);
		 buy.setFocusable(false);
		 


		
//______________________________Panel For ScrollPane____________________________________________//
		
		spScroll1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // Set scroll policy
		spScroll1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel_SP.add(spScroll1);
		lItem1.setPreferredSize(new Dimension(200, 400)); // Adjust this as needed

		panel_SP.setLayout(new BorderLayout());

		panel_SP.add(spScroll1, BorderLayout.CENTER);
		panel_SP.setBounds(25,100,250,250);
		panel_SP.setBackground(Color.decode("#FFFFFF"));		
		
		panel_SP.setBorder(BorderFactory.createLineBorder(Color.black));


	

		lItem1.setFont(new Font("Italiana", Font.BOLD, 20));
		lItem1.setForeground(Color.decode("#904C24"));
		lItem1.setPreferredSize(new Dimension(200, 400)); 
		panel4.add(panel_SP);
//______________________________Frame____________________________________________//
		
		this.setSize(3000, 800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		this.getContentPane().setBackground(Color.decode("#FEECE0"));
		
		
//_______________________________Components in Frame_____________________________//
		
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
		this.add(panel4);

		


		

		this.setLayout(null);
		this.setVisible(true);
	}

	   double price = 0;


	@Override
	public void actionPerformed(ActionEvent e) {

		
//================== This is for Coffee CheckBox
		
		   for(int i = 0; i < menuCoffee.length; i++) {
			   if(e.getSource().equals(cbCoffee[i])) {
				   	if(cbCoffee[i].isSelected()) {
				   		dlmItem1.addElement(cbCoffee[i].getText());
				   		dlmPrice1.addElement(String.valueOf((menuPrice[i])));
				   		price += menuPrice[i];


		   } 
				   	else {
				   			dlmItem1.removeElement(cbCoffee[i].getText());
				   			dlmPrice1.removeElement(String.valueOf(menuPrice[i]));
				   			price -= menuPrice[i];

				   	}

				   		txtB_total.setText(String.valueOf(price));
			   }

		   }

	



		   for(int i = 0; i < menuPastries.length; i++) {
			   if(e.getSource().equals(cbPastries[i])) {
				   if(cbPastries[i].isSelected()) {
					   dlmItem1.addElement(cbPastries[i].getText());
					   dlmPrice1.addElement(String.valueOf((menuPrice_Pastries[i])));
					   price += menuPrice[i];


				   } 
		   	else {
		   			dlmItem1.removeElement(cbPastries[i].getText());
		   			dlmPrice1.removeElement(String.valueOf(menuPrice_Pastries[i]));
		   			price -= menuPrice[i];

		   	}

		   		txtB_total.setText(String.valueOf(price));
		   	
	   }

}
		   for(int i = 0; i < menuSmoothies.length; i++) {
			   if(e.getSource().equals(cbSmoothies[i])) {
				   if(cbSmoothies[i].isSelected()) {
					   dlmItem1.addElement(cbSmoothies[i].getText());
					   dlmPrice1.addElement(String.valueOf((menuPrice_Smoothies[i])));
					   price += menuPrice[i];


				   } 
		   	else {
		   			dlmItem1.removeElement(cbSmoothies[i].getText());
		   			dlmPrice1.removeElement(String.valueOf(menuPrice_Smoothies[i]));
		   			price -= menuPrice[i];

		   	}

		   		txtB_total.setText(String.valueOf(price));
		   	
	   }

}
		   for(int i = 0; i < menuAdd_ons.length; i++) {
			   if(e.getSource().equals(cbAdd_ons[i])) {
				   if(cbAdd_ons[i].isSelected()) {
					   dlmItem1.addElement(cbAdd_ons[i].getText());
					   dlmPrice1.addElement(String.valueOf((menuPrice_Add_ons[i])));
					   price += menuPrice[i];


				   } 
		   	else {
		   			dlmItem1.removeElement(cbAdd_ons[i].getText());
		   			dlmPrice1.removeElement(String.valueOf(menuPrice_Add_ons[i]));
		   			price -= menuPrice[i];

		   	}

		   		txtB_total.setText(String.valueOf(price));
		   	
	   }

}

}

}
		
		
	

