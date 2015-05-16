angular.module("app").controller("NewUserController", NewUserController);

NewUserController.$inject = ["blogManager", "$location"];

function NewUserController(blogManager, $location) {

	var um = this;
	
	//View model properties
	
	um.newUser = {};
	
	//Controller actions

	vm.addUser = function(newUser) {
		
		blogManager.newUser(newUser);
		
		um.newUser = {};
		
		$location.path("/");
	};
};
