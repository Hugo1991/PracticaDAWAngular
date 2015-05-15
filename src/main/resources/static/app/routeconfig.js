angular.module("app").config(RouteConfig);

RouteConfig.$inject = [ '$routeProvider' ];

function RouteConfig($routeProvider) {

	$routeProvider.when('/', { templateUrl : "templates/principal.html" });
	$routeProvider.when('/home', { templateUrl : "templates/principal.html" });
	$routeProvider.when('/desc', { templateUrl : "templates/description.html" });
	$routeProvider.when('/cita', { templateUrl : "templates/cita.html/" });
	$routeProvider.when('/showcase', { templateUrl : "templates/showcase.html/" });
	$routeProvider.when('/frec', { templateUrl : "templates/frecuentes.html/" });
	$routeProvider.when('/registro', { templateUrl : "templates/registro.html/" });
	$routeProvider.when('/newpost', { templateUrl : "templates/newpost.html" });
	$routeProvider.when('/post/:id', { templateUrl : "templates/post.html" });

}