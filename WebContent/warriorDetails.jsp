<%@include file="include/header.jsp" %>

		<div id="body">
			<div class="header">
				<div class="contact">
					<h1>Fill Warriors Details</h1>
					
					<form action="WarriorDetailsServlet" method="post">
						<input type="text" name="name" value="Name" onblur="this.value=!this.value?'Name':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="text" name="rank" value="Rank" onblur="this.value=!this.value?'Rank':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="text" name="address" value="Address" onblur="this.value=!this.value?'Address':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="text" name="martyrDate" value="MartyrDate" onblur="this.value=!this.value?'MartyrDate':this.value;" onfocus="this.select()" onclick="this.value='';">
						<input type="submit" value="Submit" id="submit">
					</form>
				</div>
			</div>
		</div>
		<%@include file="include/footer.jsp" %>