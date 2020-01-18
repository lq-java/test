<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 这是jsp注释 --%>
	<!-- html注释 -->
	<%!
		// 判断年份是否是闰年
		boolean findYear(int year){
			if(year%4==0&&year%100!=0 || year%400==0){
				return true;
			}
			return false;
		}
	%>
	
	<%
		int count = 0;
		for(int y = 2000;y<=2013;y++){
			if(findYear(y)){
				count++;
			}
		}
	%>
	2000-2013年总共有<%=count %>个闰年
</body>
</html>