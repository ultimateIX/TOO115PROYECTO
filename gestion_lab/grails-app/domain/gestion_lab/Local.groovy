package gestion_lab
import

class Local {
    int idlocal
    float latitud 
    float longuitud
    static belongsTo = [escuelaUser: Escuela]

    static constraints = {
    }
}
