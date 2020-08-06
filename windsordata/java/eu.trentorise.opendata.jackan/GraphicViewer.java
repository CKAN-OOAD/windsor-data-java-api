/** GraphicViewer is a RecordViewer... so it can displayRecord()
    This is a graphics mode interactive implementation of the viewer.

    @author Dr. Ziad Kobti
    (C)2018 All Rights Reserved to the author. 
    This code is strictly for education use. May not be reproduced without
    express written permission of the author.
*/
package eu.trentorise.opendata.jackan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;

class GraphicViewer extends RecordViewer
{
	JFrame viewFrame;

	JButton btnNext;
	JButton btnPrevious;
	JButton btnFirst;
	JButton btnLast;
	JButton btnExit;

	JPanel pnlControl;
	JPanel pnlData;
	JPanel pnlContainer;
	
	JLabel[] labels;
	JTextField[] textFields;

	public GraphicViewer()
	{
		super();
		viewFrame = new JFrame("File Manager Application");
		JFrame.setDefaultLookAndFeelDecorated(true);
 		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pnlData = new JPanel();
		pnlControl = new JPanel();
		pnlContainer = new JPanel();

		btnFirst = new JButton("First");
		btnLast = new JButton("Last");
		btnNext = new JButton("Next");
		btnPrevious = new JButton("Previous");
		btnExit = new JButton("Exit");

		labels = new JLabel[NUMBER_OF_FIELDS];
		textFields = new JTextField[NUMBER_OF_FIELDS];

		pnlData.setBorder(BorderFactory.createTitledBorder("Data Panel"));
		pnlControl.setBorder(BorderFactory.createTitledBorder("Control Panel"));
		//panel1.set[Preferred/Maximum/Minimum]Size()

		//pnlData.setLayout(new BoxLayout(pnlData, BoxLayout.Y_AXIS));
		pnlData.setLayout(new GridLayout(NUMBER_OF_FIELDS, 2));		
		pnlControl.setLayout(new BoxLayout(pnlControl, BoxLayout.X_AXIS));
	
		int i;
		for (i=0; i< NUMBER_OF_FIELDS; i++)
		{
			labels[i] = new JLabel(FIELD_LABELS[i]);
			textFields[i] = new JTextField();
			//labels[i].setAlignmentX(Component.LEFT_ALIGNMENT);
			pnlData.add(labels[i]);
			//textFields[i].setAlignmentX(Component.RIGHT_ALIGNMENT);
			pnlData.add(textFields[i]);
		}

		pnlControl.add(btnFirst);
		pnlControl.add(btnPrevious);
		pnlControl.add(btnNext);
		pnlControl.add(btnLast);
		pnlControl.add(btnExit);

		//viewFrame.setLayout(new BoxLayout(viewFrame, BoxLayout.Y_AXIS));

		pnlContainer.setLayout(new GridLayout(2, 1));
		pnlContainer.add(pnlData);
		pnlContainer.add(pnlControl);
	
		viewFrame.add(pnlContainer);

		//action listener
		btnFirst.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentRecord = 0;
				displayRecord();
			}          
	      });         


		btnNext.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentRecord = (currentRecord==records.size()-1)?currentRecord:currentRecord+1;
				displayRecord();
			}          
	      });         

		btnLast.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentRecord = records.size()-1;
				displayRecord();
			}          
	      });         

		btnPrevious.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				currentRecord = 0;
				displayRecord();
			}          
	      });       

		btnExit.addActionListener(new ActionListener() {
	        
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// exit
				viewFrame.dispose();
			}          
	      }); 

	}



	public void displayViewer()
	{
		viewFrame.setSize(400,400+(5*NUMBER_OF_FIELDS));    
//		viewFrame.setLayout(null);    
		viewFrame.pack();
		viewFrame.setVisible(true);    
		viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

		currentRecord=0;
	
		displayRecord();		
          
	}

	public void displayRecord()	// simply populate the GUI with the currentRecord field values
	{
		int i;
		for (i=0; i< NUMBER_OF_FIELDS; i++)
		{
			textFields[i].setText(records.get(currentRecord).getValue(i));
		}
	}
	
}

