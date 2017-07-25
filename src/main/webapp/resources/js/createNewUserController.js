app.controller("createNewUserController", 
	['$scope', '$http',
		 function($scope, $http) {
			    var user = {
			    		userId : 1,
			    		firstName : "beeen", 
			    		lastName : "webstee",
			    		email : "test@test.com",
			    		password : "password",
			    		typeId : 2
			    }
			    console.log(user);
			    $scope.user = user;
			    
			    $scope.test = function(){
			    	console.log("in test");
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
		  
	}]);
