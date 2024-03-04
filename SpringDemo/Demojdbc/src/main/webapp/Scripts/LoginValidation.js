/**
 * 
 */
function Validate() {
		var u=document.getElementsByName("username")[0].value;
		var p=document.getElementsByName("password")[0].value;
		 var connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "Admin#123");
		 var statement=connection.createStatement();
		 var query="SELECT * FROM Validation WHERE username = '" + u + "' AND password = '" + p + "'";
		 var resultSet=statement.executeQuery(query);
		
		 if(resultSet.next()){
			 return true;
		 }else{
			 if (u.length == 0 || p.length == 0) {
      
					 document.getElementById("msg").innerText("Type username or password");
				
			 }
			 return false;
			 
		 }
		 
	}