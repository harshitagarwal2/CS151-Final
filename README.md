# CS151-Final Project - Task Board Management GUI Application.

Task Board Management build on Swing using MVC Architecture


## OverView
The goal of this project is to apply the Object Oriented Design Concepts including design patterns, MVC etc learnt in class along with GUI and implement a practical and useful application. 


## Requirements:
Login
1. When the application starts, it should show a login window. Use admin/admin for username/password The input must be validated before showing the main screen. 
![login](https://user-images.githubusercontent.com/25129580/39965397-bfb7b816-564c-11e8-9b08-4206220c5732.png)

2. When the user logs in for the very first time, Show them an empty main screen with no columns and only a select Project and Create new button. (You may also decide to immediately show the Create New Project modal Dialog). Once created, you can click on the Edit button to edit an existing project to add/delete columns or change the name. 
![empty](https://user-images.githubusercontent.com/25129580/39965402-e7509352-564c-11e8-99e5-e72bc3d1b2f6.png)


3. Main Screen: Show the tasks in the appropriate Columns. Each Column also has a + button to create a new Task. 



4. Create a new task: Clicking on the + button should open up a modal to create a new task. Add a colorpicker to change the background color of a task.
![new](https://user-images.githubusercontent.com/25129580/39965412-176083cc-564d-11e8-94fb-35181120c131.png)



5. Edit a task: Clicking on any task should open a “Edit Task” Dialog. This should look similar to the create task dialog above except the button should say “Edit” instead of create and the title should say “Edit Task”. The users can change status on this dialog for any task and after editing the Main screen should reflect the changes. For example when I change a task from TODO to In Progress, the Task should now be shown in the In Progress column. 

5. The ability to save an existing taskboard. When the save button is clicked for the first time, prompt the user for a filename and save all the project information (all projects and tasks). Subsequent clicks on the save button should automatically save the entire taskboard. 

6. The ability to load from a saved taskboard. When the load button is clicked, prompt the user for a filename and if it exists, load all the information from that file. 

7. The ability to reorder columns in a project. This can be either a drag/drop or a simple move up/down button. 
Sample:
![reorder](https://user-images.githubusercontent.com/25129580/39965427-438d3d1e-564d-11e8-9ba4-c34f538f787f.png)

8. Added a date picker for the due date.


![datepicker](https://user-images.githubusercontent.com/25129580/39965442-7f0e95e0-564d-11e8-854e-176a1fe2086f.png)

## Contributors

Tony Liang, Justin Singh , Harshit Agarwal
