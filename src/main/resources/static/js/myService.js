myApp.factory('myService', function($http) {
	var promise;
	var pourCofee = {
			function() {
				
					// $http returns a promise, which has a then function, which also returns a promise
					promise = $http.get('/users.json').then(function (response) {
						// then function here is an opportunity to modify the response
						console.log(response);
						// The return value gets picked up by then in the controller.
						return response.data;
					});
				
				// Return the promise to the controller
				return promise;
			}
	};
	return myService;
});