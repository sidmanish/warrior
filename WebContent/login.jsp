		<%@include file="include/header.jsp" %>		
		<div id="body">
			<div class="header">
				<div class="contact">
					<h1>User Login</h1>
					
					<form action="UserLoginServlet" method="post">
						<input type="text" name="name" value="Name" onblur="this.value=!this.value?'Name':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="password" name="password" value="Password" onblur="this.value=!this.value?'Password':this.value;" onfocus="this.select()" onclick="this.value='';">
						
						<input type="submit" value="Login" id="submit">
					</form>
				</div>
			</div>
		</div>
		<%@include file="include/header.jsp" %>	