var myApp = angular.module('myApp',[]);

myApp.controller('coffeeCtrl', function(myService,$scope) {
    
    $scope.makeCofee = function() {
    myService.pourCoffee($scope.cofeevalue, $scope.lastName)
        
    };
});

