package com.spring.view.user;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.spring.biz.user.UserVO;
import com.spring.biz.user.impl.UserDAO;
import com.spring.view.controller.Controller;

public class LoginController implements Controller{
	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("�α��� ó��");
		// 1. ����� �Է� ���� ����
		String id = request.getParameter("id");
		String password = request.getParameter("password");

		// 2. DB ���� ó��
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);

		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);

		// 3. ȭ�� �׺���̼�
		if (user != null) {
			return "getBoardList.do";
		} else {
			return "login";
		}
	}
}