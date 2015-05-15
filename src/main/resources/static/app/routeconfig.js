angular.module("app").config(RouteConfig);

RouteConfig.$inject = [ '$routeProvider' ];

function RouteConfig($routeProvider) {

	$routeProvider.when('/', { templateUrl : "templates/principal.html" });
	$routeProvider.when('/', { templateUrl : "templates/principal.html" });
	$routeProvider.when('/', { templateUrl : "templates/description.html" });
	$routeProvider.when('/', { templateUrl : "templates/cita.html/" });
	$routeProvider.when('/', { templateUrl : "templates/showcase.html/" });
	$routeProvider.when('/', { templateUrl : "templates/frecuentes.html/" });
	$routeProvider.when('/', { templateUrl : "templates/registro.html/" });
	$routeProvider.when('/', { templateUrl : "templates/newpost.html" });
	$routeProvider.when('/post/:id', { templateUrl : "templates/post.html" });

}