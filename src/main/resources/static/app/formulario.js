function Controlador($scope, $log) {

  $scope.registrar = function(usuario) {
    $log.info('Usuario: ');
    $log.info(usuario);
    $log.info('fue registrado correctamente!');
  };
};

function boton($scope){
	$scope.loguear=function(){ 
 /* var m = document.getElementById("DNI").value;
  alert(m);
  var expreg = new RegExp("adios");
  
  if(m=="adios")
	 // document.getElementById("botonlog").type="submit";
	  alert("El DNI NO es correcto");
  else
    alert("El DNI NO es correcto");
	}*/ $scope.visible=false;
}}