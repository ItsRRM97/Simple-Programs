import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;

public class MyModel extends AbstractTableModel{
	public MyModel(){
		//
	}
	
	public int getColumnCount() { return 10; }
    public int getRowCount() { return 10;}
    public Object getValueAt(int row, int col) { return new Integer(row*col); }
	
	
}