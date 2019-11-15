
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>超市账单管理系统</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<link type="text/css" rel="stylesheet" href="css/style.css" />
<script type="text/javascript">
	function logout() {
		top.location = "login.jsp";
	}
</script>
</head>
<body class="frame-bd">
	<ul class="left-menu">
		<li><a href="<%=request.getContextPath()%>/billList.action" target="mainFrame"><img
				src="images/btn_bill.gif" />
		</a>
		</li>

		<li><a href="<%=request.getContextPath()%>/bll2.action" target="mainFrame"><img
				src="images/btn_jieyue.gif" />
		</a>
		</li>
		<li><a href="<%=request.getContextPath()%>/userList.action" target="mainFrame"><img
				src="images/btn_users.gif" />
		</a>
		</li>	
		<li><a href="<%=request.getContextPath()%>/updatePwd.action" target="mainFrame"><img
				src="images/btn_password.gif" />
		</a>
		</li>
		<li><a href="#" onClick="logout();"><img
				src="images/btn_exit.gif" />
		</a>
		</li>
	</ul>
</body>
</html>
