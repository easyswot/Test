package com.itwillbs.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itwillbs.domain.MemberDTO;
import com.itwillbs.service.MemberService;
import com.itwillbs.service.MemberServiceImpl;

@Controller
public class MemberController {
	// 스프링 객체생성 방식
	// DI( Dependency Injection 의존관계주입)
	// 의존관계 : 객체생성 클래스 관계 의존관계(필요로 하는 관계)
	// 주입 : xml에서 객체생성 set메서드를 통해서 전달
	
	
	// xml에서 객체생성 한 주소값을 저장할 변수 정의 => 멤버변수 MemberService 부모인터페이스 저장
//	MemberService memberService = new MemberServiceImpl()
	private MemberService memberService;
	
	//생성자 (초기값을 memberService객체생성한 값 받기)
//	@Inject
//	public MemberController(MemberService memberService) {
//		this.memberService = memberService;
//	}
	
	//set메서드 memberService 객체생성한 값 받기
	@Inject
	public void setMemberService(MemberService memberService) {
		this.memberService = memberService;
	}
	
//	가상주소 시작점 http://localhost:8080/myweb/member/insert
	// => /member/insert	=> member/insertForm.jsp 이동
	@RequestMapping(value = "/member/insert", method = RequestMethod.GET)
	public String insert() {
		//주소 변경 없이 이동
		// WEB-INF/views/member/insertForm.jsp 이동
		return "member/insertForm";
	}

	// 가상주소 http://localhost:8080/myweb/member/insertPro
	//method="post"
	@RequestMapping(value = "/member/insertPro", method = RequestMethod.POST)
	public String insertPro(MemberDTO memberDTO) {
		// 회원가입 처리 작업 MemberController => MemberServiceImpl => MemberDAOImpl
		System.out.println("MemberController insertPro()");
//		insertPro(HttpServletRequest request)
//		String id = request.getParameter("id");
//		String pass = request.getParameter("pass");
//		String name = request.getParameter("name");
//		// MemberDTO 객체생성 set호출 값을 저장
//		MemberDTO memberDTO = new MemberDTO();
//		memberDTO.setId(id);
//		memberDTO.setPass(pass);
//		memberDTO.setName(name);
		
//		insertPro(MemberDTO memberDTO)
		// => insertForm.jsp 태그이름, MemberDTO 멤버변수이름 일치하면
		// 자동으로 Form에 내용이 MemberDTO에 저장
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPass());
		System.out.println(memberDTO.getName());
		
		// 패키지 com.itwillbs.controller		MemberController
		// 패키지 com.itwillbs.service		MemberServiceImpl
		// 패키지 com.itwillbs.dao			MemberDAOImpl
		// 패키지 com.itwillbs.domain			MemberDTO
		
////		1. MemberServiceImpl 객체생성
//		MemberServiceImpl memberServiceImpl = new MemberServiceImpl();
////		메서드 호출
//		memberServiceImpl.insertMember(memberDTO);
		
//		2. MemberServiceImpl 부모인터페이스 MemberServiceImpl 객체생성
//		// 부모 = 자식 (업캐스팅)
//		MemberService memberService = new MemberServiceImpl();
////		메서드 호출
//		memberService.insertMember(memberDTO);
		
//		3. 객체생성 new MemberServiceImpl()를 스프링파일 xml에서 생성을 하고
//		   자바파일에서 필요하면 스프링파일에서 객체 생성한 값을 전달
		memberService.insertMember(memberDTO);
		
		
		//주소 변경하면서 이동 redirect:로그인가상주소 => 로그인 화면
		return "redirect:/member/login";
	}
	
//	가상주소 시작점 http://localhost:8080/myweb/member/login
	// => /member/login	=> member/loginForm.jsp 이동
	@RequestMapping(value = "/member/login", method = RequestMethod.GET)
	public String login() {
		//주소 변경 없이 이동
		// WEB-INF/views/member/loginForm.jsp 이동
		return "member/loginForm";
	}

	// 가상주소 http://localhost:8080/myweb/member/loginPro
	//method="post"
	@RequestMapping(value = "/member/loginPro", method = RequestMethod.POST)
	public String loginPro() {
		// 회원가입 처리 작업 MemberController => MemberService => MemberDAO
		System.out.println("MemberController loginPro()");
		//주소 변경하면서 이동 redirect:로그인가상주소 => 로그인 화면
		return "redirect:/member/main";
	}


//	가상주소 시작점 http://localhost:8080/myweb/member/main
	// => /member/main	=> member/main.jsp 이동
	@RequestMapping(value = "/member/main", method = RequestMethod.GET)
	public String main() {
		//주소 변경 없이 이동
		// WEB-INF/views/member/main.jsp 이동
		return "member/main";
	}

	
//	가상주소 시작점 http://localhost:8080/myweb/member/info
	// => /member/info	=> member/info.jsp 이동
	@RequestMapping(value = "/member/info", method = RequestMethod.GET)
	public String info() {
		//주소 변경 없이 이동
		// WEB-INF/views/member/info.jsp 이동
		return "member/info";
	}

	
//	가상주소 시작점 http://localhost:8080/myweb/member/update
	// => /member/update	=> member/updateForm.jsp 이동
	@RequestMapping(value = "/member/update", method = RequestMethod.GET)
	public String update() {
		//주소 변경 없이 이동
		// WEB-INF/views/member/updateForm.jsp 이동
		return "member/updateForm";
	}

	// 가상주소 http://localhost:8080/myweb/member/updatePro
	//method="post"
	@RequestMapping(value = "/member/updatePro", method = RequestMethod.POST)
	public String updatePro() {
		// 회원가입 처리 작업 MemberController => MemberService => MemberDAO
		System.out.println("MemberController updatePro()");
		//주소 변경하면서 이동 redirect:로그인가상주소 => 로그인 화면
		return "redirect:/member/main";
	}

	
//	가상주소 시작점 http://localhost:8080/myweb/member/delete
	// => /member/delete	=> member/deleteForm.jsp 이동
	@RequestMapping(value = "/member/delete", method = RequestMethod.GET)
	public String delete() {
		//주소 변경 없이 이동
		// WEB-INF/views/member/insertForm.jsp 이동
		return "member/deleteForm";
	}

	// 가상주소 http://localhost:8080/myweb/member/deletePro
	//method="post"
	@RequestMapping(value = "/member/deletePro", method = RequestMethod.POST)
	public String deletePro() {
		// 회원가입 처리 작업 MemberController => MemberService => MemberDAO
		System.out.println("MemberController deletePro()");
		//주소 변경하면서 이동 redirect:로그인가상주소 => 로그인 화면
		return "redirect:/member/main";
	}

	
//	가상주소 시작점 http://localhost:8080/myweb/member/list
	// => /member/list	=> member/list.jsp 이동
	@RequestMapping(value = "/member/list", method = RequestMethod.GET)
	public String list() {
		//주소 변경 없이 이동
		// WEB-INF/views/member/insertForm.jsp 이동
		return "member/list";
	}
	
	
}
