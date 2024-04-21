package FoodOrdering;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class OrderingFrame extends JFrame {

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();

	JLabel coffee = new JLabel();
	JLabel pastries = new JLabel();
	JLabel smoothies = new JLabel();
	JLabel Add_ons = new JLabel();

	
	
	OrderingFrame(){
		
		
	ImageIcon bAndb = new ImageIcon("name.png");
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

	 
	 Image resizedImage_name = image_brew.getScaledInstance(1200,130, Image.SCALE_AREA_AVERAGING); 
	 ImageIcon resizedIcon_name = new ImageIcon(resizedImage_name);
	 JLabel name_bAb = new JLabel(resizedIcon_name); 
	 this.add(name_bAb);
	 name_bAb.setBounds(0,5,1200,130);
		
	 
	 
	 
	 
		
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
		 
		 
//______________________________Panel 3____________________________________________//
		
		panel3.setLayout(null);
		panel3.setBounds(800,150,380,600);
		panel3.setBackground(Color.decode("#904C24"));
		
		panel3.add(smoothies);
		panel3.add(Add_ons);


//------------------------------- Pastries
				
		smoothies.setBounds(10,10,360,80);
		smoothies.setText("Smoothies");
		smoothies.setBackground(Color.decode("#FEECE0"));
		smoothies.setOpaque(true);
		smoothies.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 50));
		smoothies.setForeground(Color.decode("#904C24"));
		smoothies.setHorizontalAlignment(SwingConstants.CENTER);
						

		
	
//------------------------------- Pastries
				
		Add_ons.setBounds(10,300,360,80);
		Add_ons.setText("Add_ons");
		Add_ons.setBackground(Color.decode("#FEECE0"));
		Add_ons.setOpaque(true);
		Add_ons.setFont(new Font("Inria Serif", Font.TRUETYPE_FONT , 50));
		Add_ons.setForeground(Color.decode("#904C24"));
		Add_ons.setHorizontalAlignment(SwingConstants.CENTER);
						


//______________________________Panel 4____________________________________________//
		
		
		panel4.setBounds(1210,30,300,720);
		panel4.setBackground(Color.decode("#904C24"));
		
		

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
}
