# Solución del ejercicio: Herencia - Empresa de Transporte  + Comienzo de interfaces
Ejercicio resuelto en clase. Se movió la lógica para calcular el volumen a la clase Paquete.
Se creó la interfaz Vehiculo, la cual reúne los métodos que un transporte debería implementar.

## Se pueden completar las pruebas faltantes. Dejo algunos casos de prueba:

### Bicicleta
* dadoQueExisteUnaBicicletaCuandoAgregoUnPaqueteQueSobrepasaElVolumenMaximoObtengoUnResultadoNegativo()
* dadoQueExisteUnaBicicletaCuandoAgregoUnTercerPaqueteObtengoUnResultadoNegativo() -> con datos validos para peso y volumen
* dadoQueExisteUnaBicicletaCuandoAgregoUnPaqueteConUnDestinoDistintoAlActualObtengoUnResultadoNegativo() -> con datos validos para peso y volumen

### Auto
* dadoQueExisteUnAutoCuandoAgregoPaquetesCon4DestinosDistintosObtengoUnResultadoNegativo() -> con datos validos para peso y volumen
* dadoQueExisteUnAutoCuandoAgregoPaquetesQueSobrepasanElPesoMaximoObtengoUnResultadoNegativo()
* dadoQueExisteUnAutoCuandoAgregoPaquetesQueSobrepasanElVolumenMaximoObtengoUnResultadoNegativo()

### Camion
* Completar las pruebas para poder agregar paquetes válidos, controlar el peso máximo, controlar el volumen máximo.

En todas las pruebas con los transportes es apropiado controlar el peso y volumen final. 

## Tecnologías
* Java 11.
* JUnit 4.
* Eclipse IDE.
