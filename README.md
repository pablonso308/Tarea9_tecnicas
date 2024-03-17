README
link a mi repositorio: https://github.com/pablonso308/Tarea9_tecnicas.git

ENUNCIADO 
Ejercicio 1: Sistema de Reservas para una Cafetería
El objetivo es crear un programa que permita a una cafetería gestionar las reservas de sus mesas y mostrar los diferentes tipos de mesas disponibles junto con sus precios.

La cafetería ofrece mesas individuales, dobles y de grupo. Para todas es necesario conocer su número, ubicación (interior, terraza) y fecha de última reserva. Las mesas de grupo están equipadas con enchufes para dispositivos electrónicos. Algunas tienen más enchufes que otras. Las mesas individuales y dobles tienen ciertas preferencias en términos de vista (jardín, calle). Debido a su ubicación, algunas mesas requieren una reserva mínima.

Puede suponer que dispone de una clase LocalDate que permite gestionar la fecha de última reserva.

a. Las clases y sus atributos Definir las clases necesarias para representar los distintos tipos de mesas ofrecidas para reserva. Indicar los diferentes atributos de estos últimos y el posible carácter abstracto de determinadas clases.

b. Los métodos Es necesario conocer el precio de reserva de todos los tipos de mesas.

Tipo de Mesa	Precio de Reserva
Individual	2,50 €/hora
Doble	4,50 €/hora
Grupo	7,90 €/hora
Agregar a las clases anteriores los métodos abstractos y concretos, necesarios para ello. También agregue un constructor y un método que será útil para mostrar estas mesas en cada uno de ellos.

c. Las normas Todas las mesas que se ofrecen en reserva se almacenan en una tabla.

A continuación, se mostrará una vista previa de la pantalla que se genera cuando se navega por la tabla que contiene las mesas:

Estas son las mesas que ofrecemos para reservar:

Mesa individual nº5 (interior) vista jardín 2,50€/hora
Mesa doble nº10 (terraza) vista calle 4,50€/hora
Mesa de grupo nº20 (interior) 6 enchufes 7,90€/hora


Clases Implementadas

Mesa (Abstracta)
La clase abstracta Mesa define los atributos y métodos comunes para todas las mesas. Incluye los siguientes elementos:

Atributos:
numeroIntegrantes: Entero que representa el número de integrantes que pueden ocupar la mesa.
ubicacion: Cadena que indica la ubicación de la mesa (por ejemplo, "interior" o "terraza").
ultimaReserva: Objeto LocalDate que representa la fecha de la última reserva de la mesa.
Métodos:
calcularPrecioReserva(): Método abstracto para calcular el precio de reserva de la mesa.
mostrarInformacion(): Método para mostrar la información básica de la mesa.
MesaIndividual
La clase MesaIndividual hereda de Mesa y representa una mesa para una persona. Incluye un atributo adicional:

vista: Cadena que indica la vista desde la mesa (por ejemplo, "jardín" o "calle").
MesaDoble
La clase MesaDoble también hereda de Mesa y representa una mesa para dos personas. Tiene un atributo extra:

vista: Cadena que indica la vista desde la mesa (por ejemplo, "jardín" o "calle").
MesaGrupo
La clase MesaGrupo es una subclase de Mesa que representa una mesa para un grupo de personas. Tiene un atributo adicional:

numeroEnchufes: Entero que indica el número de enchufes disponibles en la mesa.
Gestor de Mesas
La clase Gestor implementa métodos para manejar las operaciones relacionadas con las mesas, como agregar una mesa, mostrar mesas disponibles y solicitar una mesa.

Pruebas Unitarias
Se han proporcionado pruebas unitarias para cada una de las clases implementadas utilizando JUnit. Las pruebas cubren diferentes aspectos de las clases, como el cálculo del precio de reserva y la visualización de la información de la mesa.

Diagrama UML
Se ha incluido un diagrama UML que representa la estructura de clases y las relaciones entre ellas.

Ejecución del Código
Para ejecutar el código, puedes compilar todos los archivos .java y ejecutar la clase Main, que contiene un ejemplo simple de uso del sistema de gestión de mesas.



