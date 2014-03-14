<html>
<head>
	<link rel="stylesheet" type="text/css" href="./css/main.css"/>
</head>
<body>
<%@ include file="header.jspf"%>
<form action="/JMAG/generate.do" method="post">
	<div id="mainbox">
		<div class="box">
		Choose the Type of Application:<br>
			<input type="radio" name="r_typeApp" id="r_javaApp" value="Java Application" checked="checked"/>
			<label for="r_javaApp">Java Application</label><br>
			<input type="radio" name="r_typeApp" id="r_webApp" value="Web Application"/>
			<label for="r_webApp">Web Application</label><br>
			<input type="radio" name="r_typeApp" id="r_vaadinApp" value="Vaadin Application"/>
			<label for="r_vaadinApp">Vaadin Application</label><br>			
		</div>
		<div class="box">
		Choose your initial package:<br>
		<label for="t_package">Initial Package:</label>
		<input type="text" id="t_package" name="t_package"/>
		</div>
		<div class="box">
		Choose the name of your Application:<br>
		<label for="t_appname">Application Name:</label>
		<input type="text" id="t_appname" name="t_appname"/>
		</div>
		<input class="button" type="submit" value="Generate"/>
		<input class="button" type="reset" value="Reset"/>
	</div>
</form>
</body>
</html>
