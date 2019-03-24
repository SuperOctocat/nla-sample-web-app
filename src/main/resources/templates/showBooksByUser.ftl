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
  		<h2>Books:</h2>
  		<p>This table show all our books and their availability.</p>            
  		<table class="table table-striped">
    		<thead>
      				<tr>
        			<th>Id:</th>  
        			<th>Title:</th>
					<th>Author:</th>  
        			<th>ISBN:</th>
        			<th>Availability:</th>
      			</tr>
    		</thead>
    		<tbody>
       			<#list books as book>
                <tr>
                    <td>${book.id}</td> 
                    <td>${book.title}</td> 
                    <td>${book.author}</td> 
                    <td>${book.isbn}</td>
                    <td>${book.status}</td>
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
