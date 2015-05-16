angular.module("app").controller("UserListController", UserListController);

UserListController.$inject = ["blogManager", "$location"];

function UserListController(blogManager, $location) {

	var um = this;
	
	//View model properties
	
	um.users = []
		
	//Controller logic
	
	um.users = blogManager.getUsers();
	
	//Controller actions

	um.deleteUser = function(user) {
		blogManager.deleteUser(user);
	};
	
	um.viewUser = function(user) {
		$location.path("/user");
	};
	
	um.reload = function(users) {
		blogManager.reload().then(function(users){
			um.users = users;
		});
	};
};
