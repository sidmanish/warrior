<%@include file="include/header.jsp" %>	
<div id="body">
			<div class="header">
				<div class="contact">
					<h1>Admin Login</h1>
					
					<form action="AdminLoginServlet" method="post">
						<input type="text" name="Name" value="userName" onblur="this.value=!this.value?'Name':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="password" name="Password" value="password" onblur="this.value=!this.value?'Password':this.value;" onfocus="this.select()" onclick="this.value='';">
						
						<input type="submit" value="Login" id="submit">
					</form>
				</div>
			</div>
		</div>


<%@include file="include/footer.jsp" %>	