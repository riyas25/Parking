package managerView;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import clientView.SiteVisitorView;
import database.Database;
import management.Manager;

public class ManagerClientView extends JFrame {

public static int state=0;
Database database= Database.getInstance();

	
public JTable createJTable(String[] columns,Object[][] data) {
	  DefaultTableModel model = new DefaultTableModel(data, columns);
      

      // Create a table with the model
      JTable table = new JTable(model);
      TableColumn column = null;
      for (int i = 0; i < table.getColumnCount(); i++) {
      	
          column = table.getColumnModel().getColumn(i);
          if (i ==0 || i==1 || i==2 || i==3) {
          	
              column.setPreferredWidth(100); // Name column is wider
              
          } else {
          	
              column.setPreferredWidth(50); 
          }
      }
      DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
      centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
      for (int i = 0; i < table.getColumnCount(); i++) {
          table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
      }
      


     
      // Enable sorting on the table
      TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
      table.setRowSorter(sorter);
      sorter.setSortsOnUpdates(true);
      sorter.toggleSortOrder(2); // Sort by the third column by default
     
      table.getTableHeader().setReorderingAllowed(false);
      // Add the table to a scroll pane and add the scroll pane to the content pane
      JScrollPane scrollPane = new JScrollPane(table);
      // Set the bounds of the scroll pane
      scrollPane.setBounds(5,100,450 ,300);
     getContentPane().add(scrollPane);
//	
	
	return table;
	
}




public JTable JTableContain(JTable table,int column, String data,boolean b) {
	 String[] columns = {"Name", "ParkingSpace", "Booking Date","Booking time","Active","Deactive"};
	 //JTable filteredTable=null;
	

	 if(b==true) {
		// assume the JTable is named "table"
		TableModel originalModel = table.getModel();

		// create a new table model to hold the filtered data
		DefaultTableModel filteredModel = new DefaultTableModel();

		// add the column headers to the new model
		int numCols = table.getColumnCount();
		for (int i = 0; i < numCols; i++) {
		    filteredModel.addColumn(originalModel.getColumnName(i));
		}

		// add the rows that meet the filtering criteria to the new model
		int numRows = originalModel.getRowCount();
		for (int i = 0; i < numRows; i++) {
		    Object[] rowData = new Object[numCols];
		    // get the value of the name column for the current row
		    String name = originalModel.getValueAt(i, column).toString();
		    // check if the name contains "John"
		    if (name.contains(data)) {
		        // add the row to the new model if it meets the filtering criteria
		        for (int j = 0; j < numCols; j++) {
		            rowData[j] = originalModel.getValueAt(i, j);
		        }
		        filteredModel.addRow(rowData);
		    }
		}

		// create a new JTable with the filtered model
		JTable filteredTable = new JTable(filteredModel);
		filteredTable.getTableHeader().setReorderingAllowed(false);
		return filteredTable;

		}
	
	else {
		getContentPane().remove(table);
		JTable filteredTable=createJTable(columns,null);
		return filteredTable;
	}
	
	
//	return filteredTable;
}
//Returns filtered rows
public JTable editTable(JTable table,int column, String data,boolean b) {
	 String[] columns = {"Name", "ParkingSpace", "Booking Date","Booking time","Active","Deactive"};
	 //JTable filteredTable=null;
	

	 if(b==true) {
		// assume the JTable is named "table"
		TableModel originalModel = table.getModel();

		// create a new table model to hold the filtered data
		DefaultTableModel filteredModel = new DefaultTableModel();

		// add the column headers to the new model
		int numCols = table.getColumnCount();
		for (int i = 0; i < numCols; i++) {
		    filteredModel.addColumn(originalModel.getColumnName(i));
		}

		// add the rows that meet the filtering criteria to the new model
		int numRows = originalModel.getRowCount();
		for (int i = 0; i < numRows; i++) {
		    Object[] rowData = new Object[numCols];
		    // get the value of the name column for the current row
		    String name = originalModel.getValueAt(i, column).toString();
		    // check if the name contains "John"
		    if (name.equals(data)) {
		        // add the row to the new model if it meets the filtering criteria
		        for (int j = 0; j < numCols; j++) {
		            rowData[j] = originalModel.getValueAt(i, j);
		        }
		        filteredModel.addRow(rowData);
		    }
		}

		// create a new JTable with the filtered model
		JTable filteredTable = new JTable(filteredModel);
		filteredTable.getTableHeader().setReorderingAllowed(false);
		
		return filteredTable;

		}
	
	else {
		getContentPane().remove(table);
		JTable filteredTable=createJTable(columns,null);
		filteredTable.getTableHeader().setReorderingAllowed(false);
		
		return filteredTable;
	}
	
	
//	return filteredTable;
}


    public ManagerClientView(Manager man) {
    	HashMap<Integer,JTable> phase= new HashMap<>();
    	
    	
    	JPanel containerPanel = new JPanel(new BorderLayout());
    	JPanel panel2= new JPanel();
    	 JPanel panel=new JPanel();
         JTextField field= new JTextField(25);
         JButton search=new JButton("Search");
    	
         
         getContentPane().add(panel2);
         containerPanel.add(panel2, BorderLayout.NORTH);
    
    	  //JPanel panel2=new JPanel();
          // Create a table model with some data
          String[] columns = {"Name", "ParkingSpace", "Booking Date","Booking time","Active","Sensor"};
          
          
          Object[][] data = {{"Alice", "10A", "30 sep","11:30","Yes","No"},
        		  {"Alex", "15B", "3 Dec","12","Yes","Yes"},
        		  { "Sara","15A","24 Dec","17","Yes","No"}
         };
          
          
         
        
          
          //try panle 2
         // panel2.add(scrollPane);
          
          //Adding to panel
       
         JTable table=createJTable(columns,data);
         
         
         JButton btnPreviousPage = new JButton("<<Back");
         btnPreviousPage.setBounds(458, 7, 101, 41);
         btnPreviousPage.addActionListener(new ActionListener() {
         	public void actionPerformed(ActionEvent e) {
         		if(state==0) {
         		 new showManagerHomepage(man);
         		dispose();
         		}
         		else {
         			state=0;
         			 JTable table=createJTable(columns,data);
         			field.setText("");
         		}
         		 
         	}
         });
         panel2.add(btnPreviousPage);
         
         JButton btnLogout = new JButton("Logout");
         btnLogout.setBounds(569, 7, 94, 41);
         panel2.add(btnLogout);
         btnLogout.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
 		SiteVisitorView.main(null);
 		dispose();
 	}
 });
         
         JPanel panel3=new JPanel();
         JButton Deactive = new JButton("DeActive");
         Deactive.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // get the selected row
                 int selectedRow = table.getSelectedRow();
                 int modelRow = table.convertRowIndexToModel(selectedRow);
                 // if a row is selected, remove it from the model
                 
                	 if(selectedRow>=0) {
                	 ((DefaultTableModel) table.getModel()).removeRow(modelRow);
                	 }
                 
             }
         });
         panel3.add(Deactive);
         getContentPane().add(panel3,BorderLayout.SOUTH);
         
         table.addMouseListener(new MouseAdapter() {
        	   public void mouseClicked(MouseEvent e) {
        	      if (e.getClickCount() == 1) {
        	         JTable target = (JTable)e.getSource();
        	         int row = target.getSelectedRow();
        	         int column = target.getSelectedColumn();
        	         // get the data from the selected row and column
        	         Object selectedData = target.getValueAt(row, column);
        	         
        	         if(column==5) {
        	        	 if(selectedData=="No") {
        	        		 JDialog dialog = new JDialog();
        	        		 dialog.setSize(200, 100);
        	        		 dialog.setLocationRelativeTo(table);
        	        		 dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        	        		 // Create and add components to the dialog
        	        		 JLabel label = new JLabel("There is no car in this spot");
        	        		 dialog.add(label);

        	        		 // Make the dialog visible
        	        		 dialog.setVisible(true);
        	        	 }
        	        	 else {
        	        		 JDialog dialog = new JDialog();
        	        		 dialog.setSize(200, 150);
        	        		 dialog.setLocationRelativeTo(table);
        	        		 dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        	        		 // Create and add components to the dialog
        	        		 JLabel label = new JLabel("<html>Car Information retrieved:<br> Vehicle type: Tesla <br> Color: Black <br> Plate Number:BD51SMR<br>Owner:Alex</html>" );
        	        		 dialog.add(label);

        	        		 // Make the dialog visible
        	        		 dialog.setVisible(true);
        	        		 
        	        	 }
        	         }
        	         // create a new frame or panel to display the selected data
        	         // and connect it to another page
        	      }
        	   }
        	});
        	




       
        
        JLabel typeLabel = new JLabel("Search by");
        String[] types = {"Search by", "Name", "Space","Lot","Date"};
//
//        //Create a combo box, select item at index 0.
        JComboBox searchOptions = new JComboBox(types);
//        clientsList.setPreferredSize(new Dimension(1, 1));
       panel.add(searchOptions); 
       panel.add(field); 
       panel.add(search);
        
       containerPanel.add(panel, BorderLayout.CENTER);
       getContentPane().add(containerPanel);

        // Set the size and show the frame
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        //Try 
        phase.put(state, table);
       
  search.addActionListener(new ActionListener() {

	@Override
	public void actionPerformed(ActionEvent e) {
		String selectedOption = (String) searchOptions.getSelectedItem();
		String textEnter= field.getText();
		// TODO Auto-generated method stub
		if(selectedOption=="Name") {
			//String[] columns = {"Name", "ParkingSpace", "Booking Date","Booking time","Active","Deactive"};
			
			int rowIndex=-1;
			for(int i=0;i<table.getRowCount();i++) {
				Object value = table.getValueAt(i, 0);
				
				if(value.equals(textEnter)) {
					rowIndex=i;
					break;
				}
			}
			JTable table2=null;
			if(rowIndex>=0) {
				
				//Object[][]data2=new Object[1][];
				table2=editTable( table,0,textEnter,true);
				 JScrollPane scrollPane = new JScrollPane(table2);
			      // Set the bounds of the scroll pane
			      scrollPane.setBounds(5,100,450 ,300);
			  	
					getContentPane().remove(table);
			      getContentPane().add(scrollPane);
			      //Try
			      state++;
			      phase.put(state, table2);
//				for(int i=0; i< table.getModel().getColumnCount();i++) {
//					Object s=table.getValueAt(rowIndex, i);
//					data2[0][i]= s;
				
				//System.out.println(table2);
				
			//	 getContentPane().add(table2);
				}
				
			
			else {
				getContentPane().remove(table);
				table2=createJTable(columns,null);
				state++;
			      phase.put(state, table2);
//				JScrollPane scrollPane1 = new JScrollPane(table2);
//				getContentPane().add(scrollPane1);
			}
		}
		
		
		else if(selectedOption=="Space") {
		
			 JTable table2=editTable( table,1,textEnter,true);
			 JScrollPane scrollPane = new JScrollPane(table2);
		      // Set the bounds of the scroll pane
		      scrollPane.setBounds(5,100,450 ,300);
		  	
				getContentPane().remove(table);
		      getContentPane().add(scrollPane);
		      state++;
		      phase.put(state, table2);
				
			
		}
		else if(selectedOption=="Date") {
			
			 JTable table2=editTable( table,2,textEnter,true);
			 JScrollPane scrollPane = new JScrollPane(table2);
		      // Set the bounds of the scroll pane
		      scrollPane.setBounds(5,100,450 ,300);
		  	
				getContentPane().remove(table);
		      getContentPane().add(scrollPane);
		      state++;
		      phase.put(state, table2);
			
		}
		else if(selectedOption=="Lot") {
			
			 JTable table2=JTableContain( table,1,textEnter,true);
			 JScrollPane scrollPane = new JScrollPane(table2);
		      // Set the bounds of the scroll pane
		      scrollPane.setBounds(5,100,450 ,300);
		  	
				getContentPane().remove(table);
		      getContentPane().add(scrollPane);
		      state++;
		      phase.put(state, table2);
				
			
		}
		
		
		
		
	}
	

	  
	  
	  
  });

  
    }

    public static void main(String[] args) {
    	Manager man= new Manager("John","J1","J1", null);
        new ManagerClientView(man);
    }
}



	
	
	
	
	
	
