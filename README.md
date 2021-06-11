
## 프로젝트 소개 


---

로그인 기능과 게시글을 읽거나 작성, 수정, 삭제, 파일 업로드 등 CRUD기능을 포함한 게시판을 구현했습니다. 
Spring을 이용해서 MVC모델을 구현했고, Model과 View, Controller 모두 JAVA를 주로 사용하였습니다. 

---

## 개발환경 및 개발도구

---

- Eclipse(2021-03)
- JDK1.8
- Maven 3.8.1
- STS 4.2.4
- MySQL 8.0.23.
- Mybatis 3.3.1

---

## 프로젝트 Use Case Diagram

---

## 상세 기능

---



- [게시글 목록 보기](#게시글-목록-보기)
- [게시글 상세 보기](#게시글-상세-보기)
- [게시글 등록](#게시글-등록)
- [게시글 수정](#게시글-수정)
- [게시글 삭제](#게시글-삭제)
- [조회수 증가](#조회수-증가)
- [다국어 설정](#다국어-설정)
- [로그인](#로그인)
- [파일 업로드](#파일-업로드)
- [검색 기능](#검색-기능)
- [오류 처리](#오류-처리)


---

## 게시글 목록 보기

: Mysql에 저장된 모든 게시글들의 제목과 게시글 번호, 조회수 등의 정보를 표시합니다.  
Select구문을 통해서 값을 받아오고 화면에 표시합니다.  
제목을 클릭할 경우 게시글 번호값을 매개로 게시글 상세 보기 페이지로 이동합니다.    
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/webapp/getBoardList.jsp)

---


## 게시글 상세 보기

: 게시글 번호값을 통해서 게시글의 상세 내용을 확인합니다.  
제목, 내용, 조회수, 작성자, 작성시간 등의 정보를 확인할 수 있습니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/webapp/getBoard.jsp)


---

## 게시글 등록

: 새로운 게시글을 등록합니다.  
입력된 정보는 Mysql에 새롭게 저장됩니다.  
작성시간은 현재 시간을 기준으로 작성됩니다.  
이용자는 제목과 작성자, 내용 등을 입력합니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/webapp/insertBoard.jsp)

---

## 게시글 수정

: 이미 작성된 게시글을 수정합니다.  
작성자를 수정할 수는 없으며 제목과 내용을 수정할 수 있습니다.  
수정한 내용은 Database에 반영됩니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/resources/mappings/board-mapping.xml)

---

## 게시글 삭제

: 이미 작성된 게시글을 삭제합니다.  
게시글 번호를 매개로 받아와서 삭제합니다.  
삭제한 내용은 Database에서도 삭제됩니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/resources/mappings/board-mapping.xml)

---

## 조회수 증가

: 작성된 게시글을 상세 보기 할 때 마다 조회수가 1씩 증가합니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/resources/mappings/board-mapping.xml)


---

## 다국어 설정

: 한국어 외의 외국어를 지원합니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/resources/message/messageSource_en.properties)

---

## 로그인

: 게시판을 이용하기 위해서는 로그인을 먼저 해야합니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/webapp/login.jsp)

---

## 파일 업로드

: MultipartFile을 사용하여 게시글을 등록할 때 추가적으로 파일을 함께 업로드 할 수 있습니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/java/com/spring/view/board/BoardController.java)

---

## 검색 기능

: 게시글 리스트 화면에서 제목, 작성자, 내용을 기준으로 게시글을 검색할 수 있습니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/java/com/spring/view/board/BoardController.java)

---

## 오류 처리

: Xml에서 SimpleMappingExceptionResolver 핸들러를 이용하여 게시판 이용 도중 오류가 발생할 경우, 발생한 오류 화면을 출력합니다.  
<br/>
[**코드 보기**](https://github.com/Yoon-SangHyeok/Board-Project/blob/master/BoardWeb/src/main/webapp/WEB-INF/config/presentation-layer.xml)

---