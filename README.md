# Justificación del Algoritmo de Recorrido

Para este laboratorio elegí un algoritmo de recorrido secuencial lineal clásico implementado sobre un arreglo estático.

Los motivos de esta elección son:

1. Las alertas diarias de medicamentos para un paciente (mañana, tarde y noche) son una cantidad fija y predecible. Usar un array de tamaño fijo optimiza la memoria de la aplicación sin necesidad de colecciones dinámicas más complejas.
2. Al encapsular la lógica del recorrido con un puntero interno (`posicion`) dentro de la clase `ArrayIterator`, logramos que el cliente (`Main`) recorra la receta en orden cronológico mediante los métodos `hasNext()` y `next()` sin tener acceso ni conocimiento de cómo están almacenados los datos por dentro.