<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<script
		  src="http://code.jquery.com/jquery-3.1.1.js"
		  integrity="sha256-16cdPddA6VdVInumRGo6IbivbERE8p7CQR3HzTBuELA="
		  crossorigin="anonymous"></script>
	
		<!-- Latest compiled and minified CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
		
		<!-- Optional theme -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
		
		<!-- Latest compiled and minified JavaScript -->
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	<!-- Angular JS -->
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.2/angular.min.js"></script>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-route.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.18/angular-resource.js"></script> -->
	
	<!-- Scripts -->
	<script src="resources/js/app.js"></script>
	<script src="resources/js/UserController.js"></script>
	
	<!-- CSS for our pages -->
	<link rel="stylesheet" src="resources/css/home.css"></script>
	
	<!-- CSS for dashboard template -->
	<link href="https://getbootstrap.com/examples/dashboard/dashboard.css" rel="stylesheet">
	<!-- <link rel="stylesheet" href="bower_components/angular-bootstrap-simple-chat/src/css/themes.css"> -->
	<title>Insert title here</title>
</head>
<body ng-app="conneqtor2" ng-controller="UserController">
<h2>{{user.userId}}</h2>
<h2>{{user.firstName}}</h2>
<h2>{{user.lastName}}</h2>
<h2>{{user.email}}</h2>
<h2>{{user.password}}</h2>

<button ng-click="postUser()">test</button>
<button ng-click="getAllUsers()">get all users</button>

<h3>{{success}}</h3><br>
{{result}}
</body>
</html>
