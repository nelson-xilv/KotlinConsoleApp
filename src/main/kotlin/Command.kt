private const val GREETING = "Добро пожаловать в приложение для парковки своего автомобиля!\n"
private const val HELP_INFO = """Доступные команды:
1. /start - запуск приложения
2. /end - выход из приложения
"""
private const val END_APP = "Удачного вам дня!"

enum class Command(val commandName: String, val output: String) {
    START("/start", GREETING),
    HELP("/help", HELP_INFO),
    END("/end", END_APP)
}