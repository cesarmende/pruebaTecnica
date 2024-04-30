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
	<div class="container-fluid">
		<div class="container-sm">
			<div class="row">
				<div class="col"></div>
				<div class="col">
					<h4 >FORMULARIO PERSONA</h4>
				</div>
				<div class="col"></div>
			</div>

			<div class="row">
				<div class="col"></div>
				<div class="col" style="background-color: darkblue; padding: 15px;">
					<form action="/create" method="post">

						<div class="input-group input-group-sm mb-3">
							<span class="input-group-text" id="inputGroup-sizing-sm">Name</span>
							<input type="text" class="form-control" name="name"
								aria-label="Sizing example input"
								aria-describedby="inputGroup-sizing-sm">
						</div>
						<div class="input-group input-group-sm mb-3">
							<span class="input-group-text" id="inputGroup-sizing-sm">Age</span>
							<input type="text" class="form-control" name="age"
								aria-label="Sizing example input"
								aria-describedby="inputGroup-sizing-sm">
						</div>
						<div class="input-group input-group-sm mb-3">
							<span class="input-group-text" id="inputGroup-sizing-sm">Phone
								Number</span> <input type="text" class="form-control"
								name="phoneNumber" aria-label="Sizing example input"
								aria-describedby="inputGroup-sizing-sm">
						</div>
						<div class="input-group input-group-sm mb-3">
							<span class="input-group-text" id="inputGroup-sizing-sm">Address</span>
							<input type="text" class="form-control" name="address"
								aria-label="Sizing example input"
								aria-describedby="inputGroup-sizing-sm">
						</div>
						<br>
						<button class="btn btn-primary" type="submit">create</button>
					</form>
					<br>
					<form action="/findAll">
						<button class="btn btn-primary" type="submit">FindAll</button>
					</form>

				</div>
				<div class="col"></div>
			</div>
			<h5>${result}</h5>

		</div>

	</div>

</body>
</html>