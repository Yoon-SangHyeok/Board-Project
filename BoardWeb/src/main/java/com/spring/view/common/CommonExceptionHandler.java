// 어노테이션으로 Error 처리시 사용하지만 XML 설정이 편리하기때문에 XML 설정을 사용하도록 한다.

//package com.spring.view.common;
//
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.servlet.ModelAndView;
//
//@ControllerAdvice("com.spring.view")
//public class CommonExceptionHandler {
//	
//	@ExceptionHandler(ArithmeticException.class)
//	public ModelAndView handlerArithmeticException(Exception e) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("exception", e);
//		mav.setViewName("/common/arithmeticError.jsp");
//		return mav;
//	}
//	
//	@ExceptionHandler(Exception.class)
//	public ModelAndView handleException(Exception e) {
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("exception", e);
//		mav.setViewName("/common/error.jsp");
//		return mav;
//	}
//}
