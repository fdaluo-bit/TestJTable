import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class StudentTableModel extends AbstractTableModel {
	private static final long serialVersionUID = -7732116367570867995L;
	List<Student> students=null;
	List<MyColumn> columns=null;
	public StudentTableModel() {
		columns=new ArrayList<MyColumn>();
		columns.add(new MyColumn("学号","studentNo",String.class));
		columns.add(new MyColumn("姓名","studentName",String.class));
		columns.add(new MyColumn("年龄","age",Integer.class));
		columns.add(new MyColumn("男生","isBoy",Boolean.class));
		
		students=new ArrayList<Student>();
		students.add(new Student("001","张三",21,true));
		students.add(new Student("002","李四",22,false));
		students.add(new Student("003","王五",23,true));
	}
    public String getColumnName(int col) {
        return columns.get(col).getTitle();
    }	
    public int getRowCount() { return students.size(); }
    public int getColumnCount() { return columns.size(); }
    public Object getValueAt(int row, int col) {
    	try {
	    	Student student=students.get(row);
	    	String name=columns.get(col).getName();
	    	Field field=Student.class.getDeclaredField(name);
	    	field.setAccessible(true);
	        return field.get(student);
    	}
    	catch(Exception e) {
    		return null;
    	}
    }
    public boolean isCellEditable(int row, int col){ return true; }
    public void setValueAt(Object value, int row, int col) {
    	try {
	    	Student student=students.get(row);
	    	String name=columns.get(col).getName();
	    	Field field=Student.class.getDeclaredField(name);
	    	field.setAccessible(true);
	    	field.set(student,value);
    	}
    	catch(Exception e) {
    	}
    }
}
