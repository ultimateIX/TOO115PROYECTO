package gestion_lab

class EscuelaController {

   
    def escuelavs = {

         def idEscuela = "01"
         def nombreEscuela = "sistemas informaticos"
         [identificadorEscuela: idEscuela, nameEscuela:nombreEscuela]
     }
     def prueba1 = {
         render "prueba de controlador"
     }
}
