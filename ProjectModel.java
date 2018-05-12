import java.util.ArrayList;

public class ProjectModel {
 private String name = "";
 private String[] columns = new String[10];
 private ArrayList<TaskModel> tasks;

 public ProjectModel() {
 }
 
 public void setName(String nameParam) {
	 name = nameParam;
 }
 
 public void printName() {
	 System.out.print(name);
 }
 public String getColumnName(int columnNum) {
	String columnName = columns[columnNum];
	return columnName;
}
 
 public void printColumnNames() {
	 for (int i = 0; i < columns.length; i++) {
		 System.out.println(columns[i]);
	 }
 }
 public void setColumnName(int index, String name) {
	 columns[index] = name;
 }
}
