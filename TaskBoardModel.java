import java.util.ArrayList;

public class TaskBoardModel {
	private String name = "TaskBoard1";
	private ArrayList<ProjectModel> projects;
	
	public void addProject(ProjectModel p ) {
		projects.add(p);
	}
	

}
