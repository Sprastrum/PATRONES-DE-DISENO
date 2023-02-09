# Problema
Imaginate que eres el dueño de una estación espacial llamada Jita. Al principio, tu programa hacía que cualquier nave de cualquier nación podría entrar sin restricciones, pero, por algunas complicaciones políticas se necesita que la nave informe su proposito, ya que, cada nación tiene un proposito para ir a tú base espacial, tenemos que hacer una forma que cada vez que un administrador de Jita reciba una petición de acoplamiento, la nave envie un mensaje de su proposito dependiendo de la nación que sea:

* Amarr = "Vengo a luchar."
* Caldari = "Vengo a investigar."
* Gallente = "Vengo a construir."
* Minmatar = "Vengo a explotar recursos"
* Desconocido = null



# Solución
Para solucionar el problema hay que hacer una factory, osease, que en vez de crear una nave mediante un `new`, creamos una nueva clase que permita retornar una de las naves de alguna nación dependiendo de su nación, y que dependiendo de esta variable nos devuelve su proposito para cada caso.
