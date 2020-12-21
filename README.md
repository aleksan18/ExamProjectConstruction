# ExamProjectConstruction
Hello This is Aleksandar and this is my Exam Project for the Construction Exam.
Read through this file to set up the application.<br />
1.Unarchive the files or download them from GitHub https://github.com/aleksan18/ExamProjectConstruction.git, open the project folder with any dev enviroment you use. For easier setup I suggest InteliJ.<br />
2.Run the SQL script in MYSQL Workbench<br />
3.Open the application properties and change the mysql password and username to what you use on your machine.<br />
4.Click the Database tab on the right ->Data Source Properties in the tab that opened-> Enter the username and password again and the URL for the MySQL table(can copy it from the application properties)<br />
5.Test the connection and then apply if it gets approved.<br />
6.Start the application with the run and build command.<br />
7.The application runs on port 8081- it will first open the index page with the functionalities implemented <br />
8.To use the API use the URL http://localhost:8081/api/ <br />
Mappings for the API for students(simillar for supervisiors just change student to supervisior/s):<br />
-students <br />
-getOneStudent <br />
-createStudent <br />
-deleteStudent/(Place an integer that corresponds to a student)<br />
-updateStudent/(Place an integer that corresponds to a student)
