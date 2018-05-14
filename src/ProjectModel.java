package working.second;

import java.util.ArrayList;

public class ProjectModel {
 private String name = "Project1";
 private ArrayList<String> columns;
 private ArrayList<TaskModel> tasks;

 public String getName() {
	return name;
}

 public void setName(String name) {
	this.name = name;
}

 public ArrayList<String> getColumns() {
	return columns;
}

 public void setColumns(ArrayList<String> columns) {
	this.columns = columns;
}

 public ArrayList<TaskModel> getTasks() {
	return tasks;
}

 public void setTasks(ArrayList<TaskModel> tasks) {
	this.tasks = tasks;
}


}
