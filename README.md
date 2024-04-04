# GYMFIT
Ejercicio hecho en javaweb, para que un usuario obtenga una rutina de ejercicios dependiendo de los días y la categoría que quiera entrenar, para el curso programación avanzada 2024, el proyecto de rutinas usa patrones de diseño y principios SOLID para mantener un código limpio y mantenible. A continuación se detallan donde y que principio se utilizo durante el proceso:

Principio de Responsabilidad Única (SRP): Este principio se observa claramente en las clases del paquete logica y factoryEjercicios. Cada clase tiene una única responsabilidad bien definida. Por ejemplo, las clases Adelgazar, Tonificar y Usuario tienen la responsabilidad de representar los conceptos relacionados con la rutina de ejercicio y el usuario, respectivamente. Del mismo modo, las clases en factoryEjercicios tienen la responsabilidad de crear diferentes tipos de ejercicios.

Principio Abierto/Cerrado (OCP): El proyecto muestra una extensión sin modificación del comportamiento existente. Por ejemplo, si se deseara agregar un nuevo tipo de rutina de ejercicio, se podría hacer sin necesidad de modificar las clases existentes como Adelgazar o Tonificar. En cambio, se agregaría una nueva clase que implemente la interfaz Irutina.

Principio de Sustitución de Liskov (LSP): Se utiliza el principio de Liskov de manera implícita en las relaciones de herencia. Por ejemplo, las clases Adelgazar y Tonificar implementan la interfaz Irutina, lo que significa que se pueden usar en cualquier lugar donde se espere un objeto Irutina sin cambiar el comportamiento esperado.

Principio de Segregación de Interfaces (ISP): El proyecto sigue el principio de ISP al proporcionar interfaces específicas y cohesivas. Por ejemplo, la interfaz Irutina define un contrato común para las rutinas de ejercicio, mientras que otras interfaces como Ejercicio proporcionan métodos específicos para diferentes tipos de ejercicios (Cardio, Push, Pull, etc.).

Principio de Inversión de Dependencia (DIP): El código utiliza el principio de DIP al depender de abstracciones en lugar de implementaciones concretas. Por ejemplo, en el servlet GYMServlet, se hace uso de la interfaz Irutina en lugar de clases concretas como Adelgazar o Tonificar, lo que facilita la extensibilidad y el cambio de implementación en el futuro.

Patrón de Diseño Factory: Se utiliza el patrón Factory en el paquete factoryEjercicios para encapsular la creación de objetos. Las clases como EjerciciosCardio, EjerciciosPush, y EjerciciosPull actúan como fábricas que crean diferentes tipos de ejercicios según la necesidad, proporcionando una forma flexible de crear objetos sin exponer la lógica de creación.
