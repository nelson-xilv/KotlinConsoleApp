private lateinit var inputCommand: String
private const val ENTER_THE_COMMAND = "Введите команду: "
private const val UNKNOWN_COMMAND = "Программа не может обработать данный запрос:"
private const val INPUT_HELP = "Пожалуйста, введите /help, чтобы увидеть доступные команды."

fun main() {

    var programWorking = true
    while (programWorking) {
        println(ENTER_THE_COMMAND)
        inputCommand = readln()

        when (inputCommand) {
            Command.START.commandName -> println(Command.START.outputResult)
            Command.HELP.commandName -> println(Command.HELP.outputResult)
            Command.END.commandName -> {
                println(Command.END.outputResult)
                programWorking = false
            }
            else -> println("$UNKNOWN_COMMAND $inputCommand. $INPUT_HELP\n")
        }
    }
}