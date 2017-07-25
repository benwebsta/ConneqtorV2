app.controller("UserController", 
	['$scope', '$http',
		 function($scope, $http) {
			    var user = {
			    		firstName : "beeen2", 
			    		lastName : "webstee2",
			    		email : "test2@test.com",
			    		password : "password",
			    		typeId : 2
			    }
			    console.log(user);
			    $scope.user = user;
			    
			    $scope.postUser = function(){
			    	console.log("in POST");
				    $http({
				    	  method: 'POST',
				    	  url: 'createNewUser',
				    	  data: user
				    	}).then(function successCallback(response) {
				    	   $scope.result = response.data;
				    	   $scope.success = true;
				    	   console.log(response);
				    	  }, function errorCallback(response) {
				    		  $scope.success = false;
				    	    console.log("error");
				    	  });
			    }
			    $scope.getAllUsers = function(){
			    	console.log("in GET");
				    $http({
				    	  method: 'GET',
				    	  url: 'getAllUsers'
				    	}).then(function successCallback(response) {
				    	   $scope.result = response.data;
				    	  }, function errorCallback(response) {
				    		  $scope.success = false;
				    	    console.log("error");
				    	  });
			    }
		  
	}]);
