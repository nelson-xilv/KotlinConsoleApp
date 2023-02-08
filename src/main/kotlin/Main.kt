private lateinit var inputCommand: String
private const val ENTER_THE_COMMAND = "\nВведите команду: "
private const val UNKNOWN_COMMAND = "Программа не может обработать данный запрос:"
private const val INPUT_HELP = "Пожалуйста, введите /help, чтобы увидеть доступные команды."

fun main() {

    val parkingManager = ParkingManager()
    var programWorking = true
    while (programWorking) {
        println(ENTER_THE_COMMAND)
        inputCommand = readln()

        when (inputCommand) {

            Command.START.command -> println(Command.START.output)

            Command.HELP.command -> println(Command.HELP.output)

            Command.PARK.command -> {
                println(Command.PARK.output)
                parkingManager.carParking()
            }

            Command.RETURN.command -> {
                println(Command.RETURN.output)
                parkingManager.returnCarOwner()
            }

            Command.PARK_INFO_BY_CAR.command -> {
                println(Command.PARK_INFO_BY_CAR.output)
                parkingManager.getInfoByCar()
            }

            Command.PARK_INFO_BY_PLACE.command -> {
                println(Command.PARK_INFO_BY_PLACE.output)
                parkingManager.getInfoByPlace()
            }

            Command.END.command -> {
                println(Command.END.output)
                programWorking = false
            }

            else -> println("$UNKNOWN_COMMAND $inputCommand. $INPUT_HELP\n")
        }
    }
}