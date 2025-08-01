package com.student.app;

import java.util.List;
import java.util.Scanner;

import com.StudentDao.StudentDao;
import com.studentmodel.Student;

public class MainApp {

	public static void main(String[] args) {
		
		StudentDao dao=new StudentDao();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student\n2. View All\n3. Update\n4. Delete\n5. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    Student s1 = new Student();
                    System.out.print("Enter name: ");
                    s1.setName(sc.nextLine());
                    System.out.print("Enter email: ");
                    s1.setEmail(sc.nextLine());
                    System.out.print("Enter course: ");
                    s1.setCourse(sc.nextLine());
                    dao.addStudent(s1);
                    break;

                case 2:
                    List<Student> list = dao.getAllStudents();
                    for (Student s : list) {
                        System.out.println(s.getId() + " " + s.getName() + " " + s.getEmail() + " " + s.getCourse());
                    }
                    break;

                case 3:
                    Student s2 = new Student();
                    System.out.print("Enter ID to update: ");
                    s2.setId(sc.nextInt()); sc.nextLine();
                    System.out.print("Enter new name: ");
                    s2.setName(sc.nextLine());
                    System.out.print("Enter new email: ");
                    s2.setEmail(sc.nextLine());
                    System.out.print("Enter new course: ");
                    s2.setCourse(sc.nextLine());
                    dao.updateStudent(s2);
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    dao.deleteStudent(sc.nextInt());
                    break;

                case 5:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid!");
            }
        } while (choice != 5);

        sc.close();
	}

}
