package com.itwillbs.service;

import javax.inject.Inject;

import com.itwillbs.dao.MemberDAO;
import com.itwillbs.dao.MemberDAOImpl;
import com.itwillbs.domain.MemberDTO;

public class MemberServiceImpl implements MemberService {
	
	//멤버변수
	private MemberDAO memberDAO;
	
	//set메서드
	@Inject		// 자동으로 동작하겠다
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	//메서드 정의
//	public void insertMember(MemberDTO memberDTO) {
//		System.out.println("MemberServiceImpl insertMember()");
////		MemberDAOImpl 객체생성
//		MemberDAOImpl memberDAOImpl = new MemberDAOImpl();
////		메서드 호출
//		memberDAOImpl.insertMember(memberDTO);
//	}

	@Override
	public void insertMember(MemberDTO memberDTO) {
		System.out.println("MemberServiceImpl insertMember()");
////		2. MemberDAO 부모인터페이스 MemberDAO 객체생성
//		// 부모 = 자식 (업캐스팅)
//		MemberDAO memberDAO = new MemberDAOImpl();
////		메서드 호출
//		memberDAO.insertMember(memberDTO);
		
//		3. 객체생성 new MemberDAOImpl()를 스프링파일 xml에서 생성을 하고
//		   자바파일에서 필요하면 스프링파일에서 객체 생성한 값을 전달
		// 메서드호출
		memberDAO.insertMember(memberDTO);
	}


}
