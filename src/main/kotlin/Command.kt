private const val START_GREETING = "Добро пожаловать в приложение для парковки своего автомобиля!\n"
private const val HELP_INFO = """Доступные команды:
1. /start - запуск приложения
2. /end - выход из приложения
"""
private const val END_APP = "Удачного вам дня!"

enum class Command(val commandName: String, val outputResult: String) {
    START("/start", START_GREETING),
    HELP("/help", HELP_INFO),
    END("/end", END_APP)
}