<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<link rel="stylesheet" type="text/css" href="./css/googleapis-fonts.css">
<link rel="stylesheet" type="text/css" href="./css/normalize.min.css">
<link rel="stylesheet" type="text/css" href="./css/index.css">
</head>
<body>

	<div id="header"></div>
	<div class="content">
		<div class="paralax">
			<div class="layer rocks2"></div>
			<div class="layer rocks1"></div>
			<div class="layer hills"></div>
			<div class="layer foreground"></div>
		</div>
	</div>
	<div class="form">
		<div id="login">
			<h1 style="color: white;">Change Password</h1>
			<form action="login" method="post">
				<div class="field-wrap">
					<input type="text" value="<%= (String)session.getAttribute("username") %>" readonly/>
				</div>
				<div class="field-wrap">
					<label> New Password<span class="req">*</span>
					</label> <input type="password" required autocomplete="off" name="password"
						pattern="^\S+$" />
				</div>
				<input class="btn btn-primary" type="submit" name = "action" value="Update Password"/>
			</form>
		</div>
	</div>
	<div id="footer"></div>
	<script type="text/javascript" src="./js/jquery-2.1.3.min.js"></script>
	<script type="text/javascript" src="./js/header.js"></script>
	<script type="text/javascript" src="./js/footer.js"></script>
	<script type="text/javascript" src="./js/index.js"></script>
</body>
</html>
