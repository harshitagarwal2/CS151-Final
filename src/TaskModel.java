package working.second;


public class TaskModel {
	private String name;
	private String description;
	private String dueDate;
	private String status;
	private ProjectModel Project;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ProjectModel getProject() {
		return Project;
	}
	public void setProject(ProjectModel project) {
		Project = project;
	}
	
	public TaskModel(String name, String desc , String dueDate , ProjectModel p) {
		this.name = name;
		this.description = description;
		this.dueDate = dueDate;
		
		
	}
	
}
