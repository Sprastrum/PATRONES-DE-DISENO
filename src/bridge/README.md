# Problema
Imaginate que quieres categorizar naves de combate, investigación, minería y construcción de las diferentes naciones. Pero, por la complejidad de la cantidad de posibilidades que hay haría que hicieras mucho código.

# Solución
Para solucionar el problema hay que hacer una interfaz y una clase abstracta, y que esta ultima requiera llamar a la otra, así, hacemos que las naves de cada nación heredan de una clase abstracta llamada NaveEspacial, y que cada tipo de nave implemente la interfaz de ITipoNave, así, cuando creemos una NaveEspacial, sera necesario pasarle su tipo también.
