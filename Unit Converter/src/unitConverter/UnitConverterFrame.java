package unitConverter;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class UnitConverterFrame extends JFrame {

	
    JComboBox<String> unit;
	JComboBox<String> FirstUnit;
	JComboBox<String> SecondUnit;
	
	JTextField FirstU_value = new JTextField();
	JTextField SecondU_value = new JTextField();

	JButton btn_UnitConvertion = new JButton();
	
	
	UnitConverterFrame(){
		
		
/////////// Frame Icon
		Image IconImage = new ImageIcon("Icon.png").getImage();
		this.setIconImage(IconImage);
/////////// Combo Box For First Unit
		
	String[] metric1 = {}; 
	FirstUnit = new JComboBox<>(metric1);
	FirstUnit.setBounds(50,200,150,30);


	

/////////// Combo Box For Second Unit

	String[] metric2 = {}; 
	SecondUnit = new JComboBox<>(metric2);
	SecondUnit.setBounds(300,200,150,30);
	
/////////// TextBox For First Unit
	
	FirstU_value.setBounds(50 ,250,150,30);


/////////// TextBox For Second Unit

	SecondU_value.setBounds(300 ,250,150,30);
	
	
/////////// The Convert Button
	
	btn_UnitConvertion.setBounds(150,350,200,70);
	btn_UnitConvertion.setLayout(null);
	btn_UnitConvertion.setFocusable(false);
	btn_UnitConvertion.setText("CONVERT");
    btn_UnitConvertion.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {

			  
		    String from_Unit = (String) FirstUnit.getSelectedItem();
		    String To_Unit = (String) SecondUnit.getSelectedItem();


		    
		    String first_Unit_value = FirstU_value.getText();
		    
		    double from_value = Double.parseDouble(first_Unit_value);

		    switch (from_Unit) {
		    	case "Inch(s)":
		    		
		    		switch (To_Unit) {
		    		case "Kilometer":
		    			double converted_value = from_value / 39370.00;

		    			
		    			
		    			DecimalFormat df = new DecimalFormat("0.00E0");
		    			String formattedValue = df.format(converted_value);
		    			
		    			String kilo = String.valueOf(formattedValue);
		    			SecondU_value.setText(kilo);
		    			
		    			break;
		    			
		    		case "Metre":
		    			double Mconverted_value = from_value / 39.37;

		    			
		    			
		    			DecimalFormat Mdf = new DecimalFormat("0.0000");
		    			String MformattedValue = Mdf.format(Mconverted_value);
		    			
		    			String metre = String.valueOf(MformattedValue);
		    			SecondU_value.setText(metre);
		    			
		    			break;
		    		
		    		
		    		case "Centimetre":
		    			double Cconverted_value = from_value * 2.54;

		    			
		    			
		    			DecimalFormat Cdf = new DecimalFormat("0.00");
		    			String CformattedValue = Cdf.format(Cconverted_value);
		    			
		    			String centi = String.valueOf(CformattedValue);
		    			SecondU_value.setText(centi);
		    			
		    			break;
		    			
		    		case "Foot":
		    			double Fconverted_value = from_value / 12;

		    			
		    			
		    			DecimalFormat Fdf = new DecimalFormat("0.0000");
		    			String FformattedValue = Fdf.format(Fconverted_value);
		    			
		    			String foot = String.valueOf(FformattedValue);
		    			SecondU_value.setText(foot);
		    			
		    			break;
	    		}
		    	break;	
		    
		    	case "Kilometer":
		    		
		    		switch (To_Unit) {
		    		case "Inch(s)":
		    			double converted_value = from_value * 39370.00;

		    			
		    			
		    			DecimalFormat df = new DecimalFormat("0.0");
		    			String formattedValue = df.format(converted_value);
		    			
		    			String kilo = String.valueOf(formattedValue);
		    			SecondU_value.setText(kilo);
		    			
		    			break;
		    			
		    		case "Metre":
		    			double Mconverted_value = from_value * 1000;

		    			
		    			
		    			
		    			String metre = String.valueOf(Mconverted_value);
		    			SecondU_value.setText(metre);
		    			
		    			break;
		    		
		    		
		    		case "Centimetre":
		    			double Cconverted_value = from_value * 100000;

		    		
		    			String centi = String.valueOf(Cconverted_value);
		    			SecondU_value.setText(centi);
		    			
		    			break;
		    			
		    		case "Foot":
		    			double Fconverted_value = from_value * 3281 ;

		    			
		    			
		   
		    			String foot = String.valueOf(Fconverted_value);
		    			SecondU_value.setText(foot);
		    			
		    			break;
	    		}
		    	break;	
		    	
		    case "Metre":
		    		
		    		switch (To_Unit) {
		    		case "Inch(s)":
		    			double converted_value = from_value * 39.37;

		    			
		    			
		    			DecimalFormat df = new DecimalFormat("0.0");
		    			String formattedValue = df.format(converted_value);
		    			
		    			String inch = String.valueOf(formattedValue);
		    			SecondU_value.setText(inch);
		    			
		    			break;
		    			
		    		case "Kilometre":
		    			double Kconverted_value = from_value / 1000;

		    			DecimalFormat Kdf = new DecimalFormat("0.00000");
		    			String KformattedValue = Kdf.format(Kconverted_value);
		    			
		    			
		    			
		    			String kilo = String.valueOf(KformattedValue);
		    			SecondU_value.setText(kilo);
		    			
		    			break;
		    		
		    		
		    		case "Centimetre":
		    			double Cconverted_value = from_value * 100;

		    		
		    			String centi = String.valueOf(Cconverted_value);
		    			SecondU_value.setText(centi);
		    			
		    			break;
		    			
		    		case "Foot":
		    			double Fconverted_value = from_value * 3.281 ;

		    			
		    			
		    			DecimalFormat Fdf = new DecimalFormat("0.00000");
		    			String FformattedValue = Fdf.format(Fconverted_value);
		    			
		    			
		    			
		    			String foot = String.valueOf(FformattedValue);
		    			SecondU_value.setText(foot);
		    			
		    			break;
	    		}
		    	break;
		    	
		  	case "Centimetre":
	    		
	    		switch (To_Unit) {
	    		case "Kilometer":
	    			double converted_value = from_value / 39370.00;

	    			
	    			
	    			DecimalFormat df = new DecimalFormat("0.00E0");
	    			String formattedValue = df.format(converted_value);
	    			
	    			String kilo = String.valueOf(formattedValue);
	    			SecondU_value.setText(kilo);
	    			
	    			break;
	    			
	    		case "Metre":
	    			double Mconverted_value = from_value / 39.37;

	    			
	    			
	    			DecimalFormat Mdf = new DecimalFormat("0.0000");
	    			String MformattedValue = Mdf.format(Mconverted_value);
	    			
	    			String metre = String.valueOf(MformattedValue);
	    			SecondU_value.setText(metre);
	    			
	    			break;
	    		
	    		
	    		case "Centimetre":
	    			double Cconverted_value = from_value * 2.54;

	    			
	    			
	    			DecimalFormat Cdf = new DecimalFormat("0.00");
	    			String CformattedValue = Cdf.format(Cconverted_value);
	    			
	    			String centi = String.valueOf(CformattedValue);
	    			SecondU_value.setText(centi);
	    			
	    			break;
	    			
	    		case "Foot":
	    			double Fconverted_value = from_value / 12;

	    			
	    			
	    			DecimalFormat Fdf = new DecimalFormat("0.0000");
	    			String FformattedValue = Fdf.format(Fconverted_value);
	    			
	    			String foot = String.valueOf(FformattedValue);
	    			SecondU_value.setText(foot);
	    			
	    			break;
    		}
	    	break;	
		    }
		}
    }
    );
	
/////////// Combo Box For Unit

	String[] Units = {"Choose Unit","length", "Weight", "Temperature" , "Time"};
	
	unit = new JComboBox<>(Units);
	unit.setBounds(170,100,150,30); 
	
	   unit.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
        	String Unit_Convert = (String) unit.getSelectedItem();

	if (Unit_Convert.equals("length")) {
		String[] l_metric1 = {"Inch(s)" , "Kilometer", "Metre" , "Centimetre" ,"Foot"};
	    FirstUnit.setModel(new DefaultComboBoxModel<>(l_metric1));
		String[] l_metric2 = {"Inch(s)" , "Kilometer", "Metre" , "Centimetre" ,"Foot"};
	    SecondUnit.setModel(new DefaultComboBoxModel<>(l_metric2));

	 
	    
	}
	else if(Unit_Convert.equals("Weight")) {
    	String[] w_metric1 = {"Kilogram","Gram", "Miligram" , "Pound" , "Ounce"};
	    FirstUnit.setModel(new DefaultComboBoxModel<>(w_metric1));
		String[] w_metric2 = {"Kilogram","Gram", "Miligram" , "Pound" , "Ounce"};
	    SecondUnit.setModel(new DefaultComboBoxModel<>(w_metric2));
    }
	else if(Unit_Convert.equals("Temperature")) {
    	String[] w_metric1 = {"Celsius","Fahrenheit", "Kelvin" };
	    FirstUnit.setModel(new DefaultComboBoxModel<>(w_metric1));
		String[] w_metric2 = {"Celsius","Fahrenheit", "Kelvin" };
	    SecondUnit.setModel(new DefaultComboBoxModel<>(w_metric2));
    }
	else if(Unit_Convert.equals("Time")) {
	    	String[] w_metric1 = {"Second","Minute", "Hour" , "Day" , "Week", "Month"};
		    FirstUnit.setModel(new DefaultComboBoxModel<>(w_metric1));
			String[] w_metric2 = {"Second","Minute", "Hour" , "Day" , "Week", "Month"};
		    SecondUnit.setModel(new DefaultComboBoxModel<>(w_metric2));
	
	    }
	
	}
		
	        

           
           }
	   );


	

///////////////----------------------> FRAME <----------------////////////////////////////
		
		
		
		this.setTitle("Unit Converter");
		this.add(unit);
		this.add(FirstUnit);
		this.add(SecondUnit);
		this.add(FirstU_value);
		this.add(SecondU_value);
		this.add(btn_UnitConvertion);

// Always make sure that setLocationRelativeTo is after setSize
		this.setSize(500,600);
		this.setLocationRelativeTo(null);
	//	this.getContentPane().setBackground(Color.decode("#757bc8"));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.setLayout(null);
		this.setVisible(true);
		

	   }


public static void main(String[] args) {
    new UnitConverterFrame();
}
}


