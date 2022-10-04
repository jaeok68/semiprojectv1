package ljo.spring.mvc.service;

import ljo.spring.mvc.vo.MemberVO;

public interface MemberService {
	
	boolean newMember(MemberVO mvo);

	MemberVO readOneMember();

	boolean checkLogin(MemberVO mvo);
}
