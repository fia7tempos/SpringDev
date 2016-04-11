package net.developia.www.jdbc01;

import java.util.List;
import java.util.Scanner;

public class EmpController {
	
	private EmpService empService;
	
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}
	
	public void getEmpList(){
		try {
			List<EmpVO> list = empService.getEmpList();
			for(EmpVO empVO:list){
				System.out.println(empVO);
			}
			System.out.println("총 급여 합계 : "+empService.getTotalSal());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void insertEmp(Scanner sc){
		System.out.println("* * * 사원 입력 * * *");
		System.out.println("---------------------");
		System.out.print("이름 : "); String ename = sc.next();
		System.out.print("급여 : "); long sal = sc.nextLong();
		try {
			List<DeptVO> deptList = empService.getDeptList();
			System.out.println("----------------------");
			for(DeptVO deptVO: deptList){
				System.out.println("부서명 : "+deptVO.getDname()+"\n 부서번호 : "+deptVO.getDeptno());
			}
			System.out.println("----------------------");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("부서번호 : "); int deptno = sc.nextInt();
		
		DeptVO deptVO = new DeptVO();
		deptVO.setDeptno(deptno);
		
		EmpVO empVO = new EmpVO();
		empVO.setEname(ename);
		empVO.setSal(sal);
		empVO.setDeptVO(deptVO);
		
		try {
			empService.insertEmp(empVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void deleteEmp(Scanner sc) {
		System.out.println("* * * 사원 퇴사 * * *");
		System.out.println("---------------------");
		System.out.print("사번 : "); int empno = sc.nextInt();
		
		
		EmpVO empVO = new EmpVO();
		empVO.setEmpno(empno);
		
		try {
			if(empService.deleteEmp(empVO)==0) {
				throw new RuntimeException("사원번호가 없거나 시스템 오류입니다.");
			}
			System.out.println(empno+"번 사원이 퇴사했습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void updateEmp(Scanner sc) {
		System.out.println("* * * 사원 수정 * * *");
		System.out.println("---------------------");
		System.out.print("사번 : ");
		int empno = sc.nextInt();
		
		EmpVO empVO = new EmpVO();
		empVO.setEmpno(empno);
		
		try {
			EmpVO targetEmpVO = empService.getEmployee(empVO);
			System.out.println(targetEmpVO);			
			System.out.print("이름 : ");
			empVO.setEname(sc.next());
			System.out.print("급여 : ");
			empVO.setSal(sc.nextLong());
			System.out.print("부서번호 : ");
			DeptVO deptVO = new DeptVO();
			deptVO.setDeptno(sc.nextInt());
			empVO.setDeptVO(deptVO);
			empService.updateEmp(empVO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
				
	}
	
}
