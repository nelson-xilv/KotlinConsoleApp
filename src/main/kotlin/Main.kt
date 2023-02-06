private lateinit var input: String
private const val ENTER_THE_COMMAND = "Введите команду: "
private const val UNKNOWN_COMMAND = "Программа не может обработать данный запрос:"
private const val INPUT_HELP = "Пожалуйста, введите /help, чтобы увидеть доступные команды."

fun main() {

    var flag = true
    while (flag) {
        println(ENTER_THE_COMMAND)
        input = readln()

        when (input) {
            Command.START.commandName -> println(Command.START.output)
            Command.HELP.commandName -> println(Command.HELP.output)
            Command.END.commandName -> {
                println(Command.END.output)
                flag = false
            }
            else -> println("$UNKNOWN_COMMAND $input. $INPUT_HELP\n")
        }
    }
}