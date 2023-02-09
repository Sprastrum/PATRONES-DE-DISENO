# Problema
Imaginate que quieres categorizar naves de combate, investigación, minería y construcción de las diferentes naciones. Pero, por la complejidad de la cantidad de posibilidades que hay haría que hicieras mucho código.

* Amarr = "Vengo a luchar."
* Caldari = "Vengo a investigar."
* Gallente = "Vengo a construir."
* Minmatar = "Vengo a explotar recursos"
* Desconocido = null



# Solución
Para solucionar el problema hay que hacer una factory, osease, que en vez de crear una nave mediante un `new`, creamos una nueva clase que permita retornar una de las naves de alguna nación dependiendo de su nación, y que dependiendo de esta variable nos devuelve su proposito para cada caso.
