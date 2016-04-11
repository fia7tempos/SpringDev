package net.developia.www.jdbc01;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.ClassUtils;

public class DeptEmpTest {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext(
				ClassUtils.classPackageAsResourcePath(DeptEmpTest.class) + "/beaninit.xml");
		
		EmpController empController = (EmpController) context.getBean("empController");
//		empController.getEmpList();
//		empController.insertEmp(sc);
//		empController.getEmpList();
//		empController.deleteEmp(sc);
		empController.getEmpList();
		empController.updateEmp(sc);
		empController.getEmpList();
	}
}
