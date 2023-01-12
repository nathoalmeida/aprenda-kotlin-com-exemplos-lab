// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(var nome: String, val id: Int, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    val listaInscritos: List<Usuario> = inscritos  // variável somente leitura da lista de usuários 
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }

    fun getUsuariosInscritos(): List<Usuario> {
        return listaInscritos
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
