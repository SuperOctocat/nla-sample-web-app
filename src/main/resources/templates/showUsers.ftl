<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <link rel="stylesheet" href="css/style.css" />
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
  <script type="text/javascript">
	$(document).ready(function(){	
    		$("button").click(function() {
    			var $row = $(this).closest("tr");    // Find the row
    			var $text = $row.find(".userId").text(); // Find the text			
    			window.location.href = '/showBooks/'+$text;
    			//alert($text);
    			return false;
			});		
	});
</script>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">NLA</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="/home">Home</a></li>
        <li><a href="#">Collections</a></li>
        <li><a href="#">Using this Library</a></li>
        <li><a href="#">What's On</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
      </ul>
    </div>
  </div>
</nav>
  
<div class="container-fluid text-center">    
  <div class="row content">
    <div class="col-sm-2 sidenav">
      <p><a href="/showUsers">Members</a></p>
      <p><a href="/showBooks">Books</a></p>
    </div>
    <div class="col-sm-8 text-left"> 
      <h1>Welcome to the National Library of Australia</h1>
      <hr>
      	<div>
  		<h2>Friends of NLA:</h2>
  		<p>This table shows all our Friends who are members of our Library.</p>            
  		<table class="table table-striped">
    		<thead>
      				<tr>
        			<th>Id:</th>  
        			<th>First Name:</th>
					<th>Last Name:</th>  
        			<th>Phone Number:</th>
        			<th>Email Address</th>
        			<th>Lent Books:</th>
      			</tr>
    		</thead>
    		<tbody>
       			<#list users as user>
                <tr>
                    <td class="userId">${user.id}</td> 
                    <td>${user.firstName}</td> 
                    <td>${user.lastName}</td> 
                    <td>${user.phoneNumber}</td>
                    <td>${user.emailAddress}</td>
                    <td><button type="button"  class="btn btn-primary btn-md" name="get-id" id="get-id" />Check List</td>
                </tr>
            </#list> 
    		</tbody>
  		</table>
		</div>  <!--end table-->
    </div>
    
    <div class="col-sm-2 sidenav">
      <div class="well">
        <p><a href="#">About Us</a></p>
      </div>
      <div class="well">
        <p><a href="#">Support Us</a></p>
      </div>
    </div>  <!--end side nav-->
  </div>
</div>

<footer class="container-fluid text-center">
  <p>Make sure to like us on Facebook!</p>
</footer>

</body>
</html>
