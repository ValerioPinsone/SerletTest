<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<String> carrello = (List<String>)request.getSession().getAttribute("carrello");

if(carrello!=null&&carrello.size()>0){
	
	for(String s: carrello){
		out.println(s+"<br>");
	}


}else{
	out.println("Nessun articolo");
}

%>

</body>
</html>