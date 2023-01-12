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
    
    val conteudoEducFuncoes = ConteudoEducacional("Funções Kotlin", 2)
    val conteudoEducClasses = ConteudoEducacional("Classes Kotlin", 2)
    
    val formacaoKotlin = Formacao("Kotlin Experience", mutableListOf(conteudoEducFuncoes, conteudoEducClasses))
    
    val usuario1 = Usuario("Nathalia", 1, "nathalia@email.com")
    val usuario2 = Usuario("Lucas", 2, "lucas@email.com")
    
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    
    

    
    println(usuario1)
    println(formacaoKotlin)
    
    println(formacaoKotlin.getUsuariosInscritos())

}
