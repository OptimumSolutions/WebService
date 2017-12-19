/**
 * 
 */

var myApp = angular.module('Demo',[]);

//myApp.controller('loginController', function($scope, $http){
//	
//	$http.get('http://localhost:8080/WebService/rest/login/showUsers')
//		.then(function(response){
//			$scope.userList =  response.data;
//		});
//	
//	
//	
//});


myApp.controller('loginController', function($scope, $http){
	$scope.userName = null;
	$scope.password = null;
	$scope.submit = function(userName, password){
		var data = {
				userName: userName,
				password: password
		};

		//$http.post(url, data, config)
		$http.post('http://localhost:8080/WebService/rest/login/authenticate', JSON.stringify(data))
			.then(
					function(response){
						if(response.data) //if authentication is true
							alert('Welcome..');
						else
							alert('Not Welcome..');
					}, 
					//error handling for $http.post()
					function(response){
						alert('Error');	
					}
				);
		
		
		
//		if ($scope.userName=='admin' && $scope.password=='admin') {
//			alert('Welcome Admin..');
//		} else
//		if ($scope.userName=='user' && $scope.password=='user') {
//			alert('Welcome User..');
//		} else {
//			alert('Invalid..');
//		}
		
	};
});