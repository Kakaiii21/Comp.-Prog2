package unitConverter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UnitConverter extends JFrame {
	
	

	UnitConverter(){
		
		
		
		JComboBox <String> cbConverterUnit = new JComboBox<String>();
		JComboBox <String> cbUnitFrom = new JComboBox<String>();
		JComboBox <String> cbUnitTo = new JComboBox<String>();


		JTextField txtUnitFrom = new JTextField();	
		JTextField txtUnitTo = new JTextField();	
		
		
		JLabel lblFrom = new JLabel();
		JLabel lblTo = new JLabel();


		JButton CBtn = new JButton();


/////////////////////        Unit Converter	ComboBox      ///////////////////////////////	
		cbConverterUnit.setBounds(120,50,150,30);
		cbConverterUnit.addItem("Length");
		cbConverterUnit.addItem("Weight");
		cbConverterUnit.addItem("Temperature");
		cbConverterUnit.addItem("Time");
		cbConverterUnit.addActionListener(new ActionListener () {

			@Override
			public void actionPerformed(ActionEvent e) {
				cbUnitFrom.removeAllItems();

				cbUnitTo.removeAllItems();

				if(cbConverterUnit.getSelectedItem().equals("Length")) {
					
					cbUnitFrom.addItem("Millimeter");
					cbUnitFrom.addItem("Centimeter");
					cbUnitFrom.addItem("Meter(s)");
					cbUnitFrom.addItem("Kilomater(s)");
					cbUnitFrom.addItem("Mile(s)");
					cbUnitFrom.addItem("Yard(s)");
					cbUnitFrom.addItem("Foot(ft)");
					cbUnitFrom.addItem("Inch(s)");
					
					
					cbUnitTo.addItem("Millimeter");
					cbUnitTo.addItem("Centimeter");
					cbUnitTo.addItem("Meter(s)");
					cbUnitTo.addItem("Kilomater(s)");
					cbUnitTo.addItem("Mile(s)");
					cbUnitTo.addItem("Yard(s)");
					cbUnitTo.addItem("Foot(ft)");
					cbUnitTo.addItem("Inch(s)");
				}
				
				else if(cbConverterUnit.getSelectedItem().equals("Weight")) {
					
	
					cbUnitFrom.addItem("Gram(s)");
					cbUnitFrom.addItem("Milligram(s)");
					cbUnitFrom.addItem("Kilogram(s)");
					cbUnitFrom.addItem("Pound(s)");
					cbUnitFrom.addItem("Ounce(s)");
				
					
					
					cbUnitTo.addItem("Gram(s)");
					cbUnitTo.addItem("Milligram(s)");
					cbUnitTo.addItem("Kilogram(s)");
					cbUnitTo.addItem("Pound(s)");
					cbUnitTo.addItem("Ounce(s)");
				
					
					

				}
				else if(cbConverterUnit.getSelectedItem().equals("Temperature")) {
					
					
					cbUnitFrom.addItem("Celsuis");
					cbUnitFrom.addItem("Fahrenheit");
					cbUnitFrom.addItem("Kelvin");
			
					
	
					cbUnitTo.addItem("Celsuis");
					cbUnitTo.addItem("Fahrenheit");
					cbUnitTo.addItem("Kelvin");
			
					

				}
				else if(cbConverterUnit.getSelectedItem().equals("Time")) {
					
					
					cbUnitFrom.addItem("Millisecond");
					cbUnitFrom.addItem("Second(s)");
					cbUnitFrom.addItem("Minute(s)");
					cbUnitFrom.addItem("Hour(s)");
					cbUnitFrom.addItem("Day(s)");
					cbUnitFrom.addItem("Week(s)");
					cbUnitFrom.addItem("Month(s)");
					cbUnitFrom.addItem("Year(s)");
					
					
					cbUnitTo.addItem("Millisecond");
					cbUnitTo.addItem("Second(s)");
					cbUnitTo.addItem("Minute(s)");
					cbUnitTo.addItem("Hour(s)");
					cbUnitTo.addItem("Day(s)");
					cbUnitTo.addItem("Week(s)");
					cbUnitTo.addItem("Month(s)");
					cbUnitTo.addItem("Year(s)");
					
					

				}
			
			}});
		
////////////////////Unit Converter Button   //////////////////////////////////

		CBtn.setBounds(120,250,150,50);
		CBtn.setText("Convert");
		CBtn.addActionListener(new ActionListener() {



			@Override
			public void actionPerformed(ActionEvent e) {

			
				String unitFrom = (String) cbUnitFrom.getSelectedItem();
				String unitTo = (String) cbUnitTo.getSelectedItem();

				double val = Double.parseDouble(txtUnitFrom.getText());
				double conversion = 0;				
				
//____________________________________________________________LENGTH______________________________________________________________________//				
				
///////////////----------------------------------------------Millimeter-----------------------------------------------//////////////////////////
				if (unitFrom.equals("Millimeter") && (unitTo.equals("Millimeter"))) {
					conversion = val;
				}
				else if (unitFrom.equals("Millimeter") && (unitTo.equals("Centimeter"))) {
					conversion = val / 10;
				}
				else if (unitFrom.equals("Millimeter") && (unitTo.equals("Meter(s)"))) {
					conversion = val / 1000;
				}
				else if (unitFrom.equals("Millimeter") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val / 1e+6;
				}
				else if (unitFrom.equals("Millimeter") && (unitTo.equals("Mile(s)"))) {
					conversion = val / 1.609e+6;
				}
				else if (unitFrom.equals("Millimeter") && (unitTo.equals("Yard(s)"))) {
					conversion = val / 914.4;
				}
				else if (unitFrom.equals("Millimeter") && (unitTo.equals("Foot(ft)"))) {
					conversion = val / 304.8;
				}
				else if (unitFrom.equals("Millimeter") && (unitTo.equals("Inch(s)"))) {
					conversion = val / 25.4 ;
				}
				
	///////////////----------------------------------------------Centimeter-----------------------------------------------//////////////////////////

				if (unitFrom.equals("Centimeter") && (unitTo.equals("Millimeter"))) {
					conversion = val * 1000;
				}
				else if(unitFrom.equals("Centimeter") && (unitTo.equals("Meter(s)"))) {
					conversion = val / 100;
				}
				else if(unitFrom.equals("Centimeter") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val / 100000;
				}
				else if(unitFrom.equals("Centimeter") && (unitTo.equals("Mile(s)\""))) {
					conversion = val / 160900;
				} 
				else if(unitFrom.equals("Centimeter") && (unitTo.equals("Yard(s)"))) {
					conversion = val / 91.44 ;
				}
				else if(unitFrom.equals("Centimeter") && (unitTo.equals("Foot(ft)"))) {
					conversion = val / 30.48;
				}
				else if(unitFrom.equals("Centimeter") && (unitTo.equals("Inch(s)"))) {
					conversion = val / 2.54;
				}
				else if(unitFrom.equals("Centimeter") && (unitTo.equals("Centimeter"))) {
					conversion = val ;
				}
				
	///////////////----------------------------------------------Meter(s)-----------------------------------------------//////////////////////////

				if (unitFrom.equals("Meter(s)") && (unitTo.equals("Millimeter"))) {
					conversion = val * 1000;
				}
				else if (unitFrom.equals("Meter(s)") && (unitTo.equals("Centimeter"))) {
					conversion = val * 100;
				}
				else if (unitFrom.equals("Meter(s)") && (unitTo.equals("Meter(s)"))) {
					conversion = val ;
				}
				else if (unitFrom.equals("Meter(s)") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val / 1000;
				}
				else if (unitFrom.equals("Meter(s)") && (unitTo.equals("Mile(s)"))) {
					conversion = val / 1609;
				}
				else if (unitFrom.equals("Meter(s)") && (unitTo.equals("Yard(s)"))) {
					conversion = val * 1.094 ;
				}
				else if (unitFrom.equals("Meter(s)") && (unitTo.equals("Foot(ft)"))) {
					conversion = val * 3.281;
				}
				else if (unitFrom.equals("Meter(s)") && (unitTo.equals("Inch(s)"))) {
					conversion = val * 39.37;
				}
				
	///////////////----------------------------------------------Kilomater(s)-----------------------------------------------//////////////////////////

				if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Millimeter"))) {
					conversion = val * 1e+6 ;
				}
				else if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Centimeter"))) {
					conversion = val * 100000;
				}
				else if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Meter(s)"))) {
					conversion = val * 1000;
				}
				else if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val ;
				}
				else if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Mile(s)"))) {
					conversion = val / 1.609 ;

				}
				else if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Yard(s)"))) {
					conversion = val * 1094;
				}
				else if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Foot(ft)"))) {
					conversion = val * 3281;

				}
				else if (unitFrom.equals("Kilomater(s)") && (unitTo.equals("Inch(s)"))) {
					conversion = val * 39370;
				}
	
	///////////////----------------------------------------------Mile(s)-----------------------------------------------//////////////////////////

				if (unitFrom.equals("Mile(s)") && (unitTo.equals("Millimeter"))) {
					conversion = val * 1.609e+6 ;
				}
				else if (unitFrom.equals("Mile(s)") && (unitTo.equals("Centimeter"))) {
					conversion = val * 160900;
				}
				else if (unitFrom.equals("Mile(s)") && (unitTo.equals("Meter(s)"))) {
					conversion = val * 1609;
				}
				else if (unitFrom.equals("Mile(s)") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val * 1.609 ;
				}
				else if (unitFrom.equals("Mile(s)") && (unitTo.equals("Mile(s)"))) {
					conversion = val ;
				}
				else if (unitFrom.equals("Mile(s)") && (unitTo.equals("Yard(s)"))) {
					conversion = val * 1760;
				}
				else if (unitFrom.equals("Mile(s)") && (unitTo.equals("Foot(ft)"))) {
					conversion = val  * 5280;
				}
				else if (unitFrom.equals("Mile(s)") && (unitTo.equals("Inch(s)"))) {
					conversion = val * 63360;
				}
				
	///////////////----------------------------------------------Yard(s)-----------------------------------------------//////////////////////////

				
				if (unitFrom.equals("Yard(s)") && (unitTo.equals("Millimeter"))) {
					conversion = val *  914.4 ;
				}
				else if (unitFrom.equals("Yard(s)") && (unitTo.equals("Centimeter"))) {
					conversion = val * 91.44;
				}
				else if (unitFrom.equals("Yard(s)") && (unitTo.equals("Meter(s)"))) {
					conversion = val / 91.44;
				}
				else if (unitFrom.equals("Yard(s)") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val / 1094 ;
				}
				else if (unitFrom.equals("Yard(s)") && (unitTo.equals("Mile(s)"))) {
					conversion = val / 1760;
				}
				else if (unitFrom.equals("Yard(s)") && (unitTo.equals("Yard(s)"))) {
					conversion = val ;
				}
				else if (unitFrom.equals("Yard(s)") && (unitTo.equals("Foot(ft)"))) {
					conversion = val * 3;
				}
				else if (unitFrom.equals("Yard(s)") && (unitTo.equals("Inch(s)"))) {
					conversion = val * 36 ;
				}
		
	///////////////----------------------------------------------Foot(s)-----------------------------------------------//////////////////////////

				
				if (unitFrom.equals("Foot(s)") && (unitTo.equals("Millimeter"))) {
					conversion = val *  304.8 ;
				}
				else if (unitFrom.equals("Foot(s)") && (unitTo.equals("Centimeter"))) {
					conversion = val * 30.48;
				}
				else if (unitFrom.equals("Foot(s)") && (unitTo.equals("Meter(s)"))) {
					conversion = val / 3.281
;
				}
				else if (unitFrom.equals("Foot(s)") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val / 3281;
				}
				else if (unitFrom.equals("Foot(s)") && (unitTo.equals("Mile(s)"))) {
					conversion = val / 5280;
				}
				else if (unitFrom.equals("Foot(s)") && (unitTo.equals("Yard(s)"))) {
					conversion = val / 3;
				}
				else if (unitFrom.equals("Foot(s)") && (unitTo.equals("Foot(ft)"))) {
					conversion = val ;
				}
				else if (unitFrom.equals("Foot(s)") && (unitTo.equals("Inch(s)"))) {
					conversion = val * 12 ;
				}
				
	///////////////----------------------------------------------Inch(s)-----------------------------------------------//////////////////////////

				if (unitFrom.equals("Inch(s)") && (unitTo.equals("Millimeter"))) {
					conversion = val * 25.4 ;
				}
				else if (unitFrom.equals("Inch(s)") && (unitTo.equals("Centimeter"))) {
					conversion = val * 2.54;
				}
				else if (unitFrom.equals("Inch(s)") && (unitTo.equals("Meter(s)"))) {
					conversion = val / 39.37;
				}
				else if (unitFrom.equals("Inch(s)") && (unitTo.equals("Kilometer(s)"))) {
					conversion = val / 39370;
				}
				else if (unitFrom.equals("Inch(s)") && (unitTo.equals("Mile(s)"))) {
					conversion = val / 63360;
				}
				else if (unitFrom.equals("Inch(s)") && (unitTo.equals("Yard(s)"))) {
					conversion = val / 36;
				}
				else if (unitFrom.equals("Inch(s)") && (unitTo.equals("Foot(ft)"))) {
					conversion = val / 12;
				}
				else if (unitFrom.equals("Inch(s)") && (unitTo.equals("Inch(s)"))) {
					conversion = val ;
				}
				
				
				
//____________________________________________________________WEIGHT______________________________________________________________________//				
				
			
///////////////----------------------------------------------Gram(s)-----------------------------------------------//////////////////////////

					if (unitFrom.equals("Gram(s)") && (unitTo.equals("Gram(s)"))) {
						conversion = val ;
					}
					else if(unitFrom.equals("Gram(s)") && (unitTo.equals("Milligram(s)"))) {
						conversion = val * 1000;
					}
					else if(unitFrom.equals("Gram(s)") && (unitTo.equals("Kilogram(s)"))) {
						conversion = val / 1000;
					}
					else if(unitFrom.equals("Gram(s)") && (unitTo.equals("Pound(s)"))) {
						conversion = val / 453.6;
					}
					else if(unitFrom.equals("Gram(s)") && (unitTo.equals("Ounce(s)"))) {
						conversion = val / 28.35;
					}
					
					
		
///////////////----------------------------------------------Milligram(s)-----------------------------------------------//////////////////////////

					if (unitFrom.equals("Milligram(s)") && (unitTo.equals("Milligram(s)"))) {
						conversion = val ;
					}
			
					else if(unitFrom.equals("Milligram(s)") && (unitTo.equals("Gram(s)"))) {
						conversion = val / 100 ;
					}
					else if(unitFrom.equals("Milligram(s)") && (unitTo.equals("Kilogram(s)"))) {
						conversion = val / 1e+6;
					}
					else if(unitFrom.equals("Milligram(s)") && (unitTo.equals("Pound(s)"))) {
						conversion = val / 453600 ;
					}
					else if(unitFrom.equals("Milligram(s)") && (unitTo.equals("Ounce(s)"))) {
						conversion = val / 28350;
					}
					
		
					
///////////////----------------------------------------------Kilogram(s)-----------------------------------------------//////////////////////////
					if (unitFrom.equals("Kilogram(s)") && (unitTo.equals("Kilogram(s)"))) {
						conversion = val  ;
					}
					else if(unitFrom.equals("Kilogram(s)") && (unitTo.equals("Milligram(s)"))) {
						conversion = val * 1e+6;
					}
					else if(unitFrom.equals("Kilogram(s)") && (unitTo.equals("Gram(s)"))) {
						conversion = val * 1000;
					}
					else if(unitFrom.equals("Kilogram(s)") && (unitTo.equals("Pound(s)"))) {
						conversion = val * 2.205;
					}
					else if(unitFrom.equals("Kilogram(s)") && (unitTo.equals("Ounce(s)"))) {
						conversion = val * 35.274;
					}
///////////////----------------------------------------------Pound(s)-----------------------------------------------//////////////////////////

					if (unitFrom.equals("Pound(s)") && (unitTo.equals("Pound(s)"))) {
						conversion = val  ;
					}
					else if(unitFrom.equals("Pound(s)") && (unitTo.equals("Milligram(s)"))) {
						conversion = val * 453600;
					}
					else if(unitFrom.equals("Pound(s)") && (unitTo.equals("Kilogram(s)"))) {
						conversion = val / 2.205;
					}
					else if(unitFrom.equals("Pound(s)") && (unitTo.equals("Gram(s)"))) {
						conversion = val * 453.6 ;
					}
					else if(unitFrom.equals("Pound(s)") && (unitTo.equals("Ounce(s)"))) {
						conversion = val * 16 ;
					}
///////////////----------------------------------------------Ounce(s)-----------------------------------------------//////////////////////////

					if (unitFrom.equals("Ounce(s)") && (unitTo.equals("Ounce(s)"))) {
						conversion = val  ;
					}
					else if(unitFrom.equals("Ounce(s)") && (unitTo.equals("Milligram(s)"))) {
						conversion = val* 28350 ;
					}
					else if(unitFrom.equals("Ounce(s)") && (unitTo.equals("Kilogram(s)"))) {
						conversion = val / 35.274;
					}
					else if(unitFrom.equals("Ounce(s)") && (unitTo.equals("Pound(s)"))) {
						conversion = val / 16;
					}
					else if(unitFrom.equals("Ounce(s)") && (unitTo.equals("Gram(s)"))) {
						conversion = val * 28.35;
					}
				
				
				
				
//____________________________________________________________TEMPERATURE______________________________________________________________________//				

					
					
	
///////////////----------------------------------------------Celsuis-----------------------------------------------//////////////////////////
				
					if (unitFrom.equals("Celsuis") && (unitTo.equals("Celsuis"))) {
						conversion = val  ;
						
					}
					else if (unitFrom.equals("Celsuis") && (unitTo.equals("Fahrenheit"))) {
						conversion = (val * 9/5) + 32  ;
						
					}
					
					else if (unitFrom.equals("Celsuis") && (unitTo.equals("Kelvin"))) {
						conversion = val + 273.15  ;
						
					}
					
///////////////----------------------------------------------Fahrenheit-----------------------------------------------//////////////////////////

					
					if (unitFrom.equals("Fahrenheit") && (unitTo.equals("Fahrenheit"))) {
						conversion = val  ;
						
					}
			
					else if (unitFrom.equals("Fahrenheit") && (unitTo.equals("Celsuis"))) {
						conversion =   (val - 32) * 5/9  ;
				
					}
			
					else if (unitFrom.equals("Celsuis") && (unitTo.equals("Kelvin"))) {
						conversion =  (val - 32) * 5/9 + 273.15  ;
				
					}
					
///////////////----------------------------------------------Kelvin-----------------------------------------------//////////////////////////

					if (unitFrom.equals("Kelvin") && (unitTo.equals("Kelvin"))) {
						conversion = val  ;
					}
					
					else if (unitFrom.equals("Kelvin") && (unitTo.equals("Fahrenheit"))) {
						conversion = (val - 273.15) * 9/5 + 32  ;
						
					}
					
					else if (unitFrom.equals("Kelvin") && (unitTo.equals("Celsuis"))) {
						conversion = val  - 273.15  ;
						
					}
				
				
				
				
				
//____________________________________________________________TIME______________________________________________________________________//				
	
///////////////----------------------------------------------Millisecond(s)-----------------------------------------------//////////////////////////

					if (unitFrom.equals("Millisecond") && (unitTo.equals("Millisecond"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Millisecond") && (unitTo.equals("Second(s)"))) {
							conversion = val / 1000 ;
							
					}
					else if(unitFrom.equals("Millisecond") && (unitTo.equals("Minute(s)"))) {
						conversion = val  / 60000;
						
					}
					else if(unitFrom.equals("Millisecond") && (unitTo.equals("Hour(s)"))) {
						conversion = val  / 3.6e+6 ;
						
					}
					else if(unitFrom.equals("Millisecond") && (unitTo.equals("Day(s)"))) {
						conversion = val / 8.64e+7 ;
						
					}
					else if(unitFrom.equals("Millisecond") && (unitTo.equals("Week(s)"))) {
						conversion = val   / 6.048e+8;
						
					}
					else if(unitFrom.equals("Millisecond") && (unitTo.equals("Month(s)"))) {
						conversion = val / 2.628e+9 ;
						
					}
					else if(unitFrom.equals("Millisecond") && (unitTo.equals("Year(s)"))) {
						conversion = val  / 3.154e+10;
						
					}
					
				
///////////////----------------------------------------------Second(s)-----------------------------------------------//////////////////////////
			
					
					
					
					if (unitFrom.equals("Second(s)") && (unitTo.equals("Second(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Second(s)") && (unitTo.equals("Millisecond"))) {
							conversion = val  ;
							
					}
					else if(unitFrom.equals("Second(s)") && (unitTo.equals("Minute(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Second(s)") && (unitTo.equals("Hour(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Second(s)") && (unitTo.equals("Day(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Second(s)") && (unitTo.equals("Week(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Second(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Second(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
						
					}
					
		///////////////----------------------------------------------Minute(s)-----------------------------------------------//////////////////////////
					
					if (unitFrom.equals("Minute(s)") && (unitTo.equals("Minute(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Minute(s)") && (unitTo.equals("Millisecond"))) {
							conversion = val  ;
							
					}
					else if(unitFrom.equals("Minute(s)") && (unitTo.equals("Second(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Minute(s)") && (unitTo.equals("Hour(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Minute(s)") && (unitTo.equals("Day(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Minute(s)") && (unitTo.equals("Week(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Minute(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Minute(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
						
					}

		///////////////----------------------------------------------Hour(s)-----------------------------------------------//////////////////////////

					if (unitFrom.equals("Hour(s)") && (unitTo.equals("Hour(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Hour(s)") && (unitTo.equals("Millisecond"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Hour(s)") && (unitTo.equals("Second(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Hour(s)") && (unitTo.equals("Minute(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Hour(s)") && (unitTo.equals("Day(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Hour(s)") && (unitTo.equals("Week(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Hour(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Hour(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
					
					}
					
		///////////////----------------------------------------------Day(s)-----------------------------------------------//////////////////////////
			
					
					if (unitFrom.equals("Day(s)") && (unitTo.equals("Day(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Day(s)") && (unitTo.equals("Millisecond"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Day(s)") && (unitTo.equals("Second(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Day(s)") && (unitTo.equals("Minute(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Day(s)") && (unitTo.equals("Hour(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Day(s)") && (unitTo.equals("Week(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Day(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Day(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
					
					}
					
		///////////////----------------------------------------------Week(s)-----------------------------------------------//////////////////////////

					
					if (unitFrom.equals("Week(s)") && (unitTo.equals("Week(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Week(s)") && (unitTo.equals("Millisecond"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Week(s)") && (unitTo.equals("Second(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Week(s)") && (unitTo.equals("Minute(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Week") && (unitTo.equals("Day(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Week(s)") && (unitTo.equals("Hour(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Week(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Week(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
					
					}
					
		///////////////----------------------------------------------Month(s)-----------------------------------------------//////////////////////////
				
					
					if (unitFrom.equals("Month(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
						
					}
					if (unitFrom.equals("Month(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Month(s)") && (unitTo.equals("Millisecond"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Month(s)") && (unitTo.equals("Second(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Month(s)") && (unitTo.equals("Minute(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Month(s)") && (unitTo.equals("Day(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Month(s)") && (unitTo.equals("Week(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Month(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Month(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
					
					}
		///////////////----------------------------------------------Year(s)-----------------------------------------------//////////////////////////

					
					if (unitFrom.equals("Year(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
						
					}
					if (unitFrom.equals("Year(s)") && (unitTo.equals("Year(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Year(s)") && (unitTo.equals("Millisecond"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Year(s)") && (unitTo.equals("Second(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Year(s)") && (unitTo.equals("Minute(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Year(s)") && (unitTo.equals("Day(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Year(s)") && (unitTo.equals("Week(s)"))) {
						conversion = val  ;
						
					}
					else if(unitFrom.equals("Year(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
					
					}
					else if(unitFrom.equals("Year(s)") && (unitTo.equals("Month(s)"))) {
						conversion = val  ;
					
					}
					
			
				
				
				
				
				
				
	
				txtUnitTo.setText(String.valueOf(conversion));
				
			}});


//////////////////// Unit From  ComboBox //////////////////////////////////
		cbUnitFrom.setBounds(30, 100, 150, 30);
		
		
		
		
		
		
////////////////////Unit To  ComboBox //////////////////////////////////
	
		
		cbUnitTo.setBounds(210, 100, 150, 30);

		
		
////////////////////Unit From  TextField //////////////////////////////////
		lblFrom.setBounds(90, 150, 150, 30);
		lblFrom.setText("FROM");





////////////////////Unit To  TextField //////////////////////////////////


		lblTo.setBounds(270, 150, 150, 30);
		lblTo.setText("TO");


	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
////////////////////Unit From  TextField //////////////////////////////////
		txtUnitFrom.setBounds(30, 200, 150, 30);






////////////////////Unit To  TextField //////////////////////////////////


		txtUnitTo.setBounds(210, 200, 150, 30);




		
		
//////// ----------------> Frame <----------------------////////
		
		this.setSize(400,450);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		
		
		this.add(txtUnitFrom);
		this.add(txtUnitTo);
		this.add(cbConverterUnit);
		this.add(cbUnitFrom);
		this.add(cbUnitTo);
		this.add(lblFrom);
		this.add(lblTo);
		this.add(CBtn);
		
		
		
		this.setLayout(null);
		this.setVisible(true);

	}
}
