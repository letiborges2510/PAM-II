package fundamentos.controles

fun main ( args: Array <String>) {
    var alunos = arrayListOf ("André" , "Carla", "Marcos")
    for ((indice,aluno) in alunos.withIndex()) {

        println ("$indice - $aluno \n")
    }
}