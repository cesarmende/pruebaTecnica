<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Pagina principal</title>
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body style="background-color: aliceblue;">
	<h1>Listar todos</h1>
	<div class="col"  padding: 15px;">
		<span>${result}</span>
	</div>
	


<!-- 
	<table id="example" class="display" style="width: 100%">
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Phone Number</th>
				<th>Address</th>
			</tr>
		</thead>
		<tfoot>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Phone Number</th>
				<th>Address</th>
			</tr>
		</tfoot>
	</table> -->
	
	<form action="/home">
						<button class="btn btn-primary" type="submit">Back</button>
					</form>

	<script type="text/javascript">
		new DataTable('#example', {
			ajax : '${result}',
			columns : [ {
				data : 'name'
			}, {
				data : 'age'
			}, {
				data : 'phoneNumber'
			}, {
				data : 'address'
			} ]
		});
	</script>
</body>
</html>