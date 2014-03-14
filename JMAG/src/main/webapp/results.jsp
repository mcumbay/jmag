<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="./css/main.css"/>
	<script type="text/javascript">
		function back(){
			window.history.back()
		}
	</script>
</head>
<body>
<%@ include file="header.jspf"%>
<div id="mainbox">
	The Maven archetype generated code is :
	<div class="box">
		<textarea rows="4" cols="50"><c:out value="${codegenerated} "/>
		</textarea>
	</div>
	<input class="button" type="button" value="Go back" onclick="javascript:back();"/>
</div>
</body>
</html>