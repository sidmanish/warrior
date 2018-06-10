<%@include file="include/header.jsp" %>	
<div id="body" >
			<div class="header">
				<div class="contact">
					<h1> Signup</h1>  
					
					<form action="SignUpServlet" method="post">
						<input type="text" name="name" value="Name" onblur="this.value=!this.value?'Name':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="text" name="gender" value="Gender" onblur="this.value=!this.value?'Gender':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="number" name="adharNo" value="AdharNo" onblur="this.value=!this.value?'AdharNo':this.value;" onfocus="this.select()" onclick="this.value='';">
                        <input type="number" value="mobileNo" name="MobileNo " onblur="this.value=!this.value?'MobileNo':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="text" name="email" value="Email Address" onblur="this.value=!this.value?'Email Address':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="number" name="accountNo" value="AccountNo" onblur="this.value=!this.value?'AccountNo':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="password" name="password" value="password" onblur="this.value=!this.value?'Password':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="submit" value="Signup" id="submit">
					</form>
				</div>
			</div>
		</div>
		
<%@include file="include/footer.jsp" %>	