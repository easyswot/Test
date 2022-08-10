package com.itwillbs.service;

import com.itwillbs.domain.MemberDTO;

public interface MemberService {
	// 추상메서드
	public void insertMember(MemberDTO memberDTO);
//	MemberDTO memberDTO2 = memberService.userCheck(memberDTO);
	public MemberDTO userCheck(MemberDTO memberDTO);
	
	public MemberDTO getMember(String id);
}
