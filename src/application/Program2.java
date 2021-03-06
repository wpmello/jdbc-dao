package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== Teste1: department findById =====");
		 Department department = departmentDao.findById(3);
		 System.out.println(department);
		 
		System.out.println("\n===== Teste2: department findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		/*
		System.out.println("\n===== Teste3: department insert =====");
		Department dep = new Department(null, "M?sica");
		departmentDao.insert(dep);
		System.out.println("Inserted! Id = " + dep.getId());
		*/
		
		System.out.println("\n===== Teste4: department update =====");
		department = departmentDao.findById(6);
		department.setName("D3");
		departmentDao.update(department);
		System.out.println("Updated!");
		
		System.out.println("\n===== Teste5: department delete =====");
		System.out.print("Enter id to delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		
		sc.close();
	}

}
