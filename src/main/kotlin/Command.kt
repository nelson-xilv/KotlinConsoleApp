private const val START_GREETING = "\nДобро пожаловать в приложение для парковки своего автомобиля!"
private const val HELP_INFO = """
Доступные команды:
1. /start - запуск приложения
2. /help - вывод доступных команд
3. /park - паркует автомобиль на любое свободное место
4. /return - возврат автомобиля
5. /park_info_by_car - по номеру показывает в каком месте припаркована машина
6. /park_info_by_place - по месту на парковке выводит информацию о машине
7. /park_stats - просмотр текущей загрузки парковки
8. /park_all_stats - сколько всего машин было припарковано за все время
9. /end - выход из приложения"""
private const val PARKING_CAR = "\nВведите данные машины и владельца для парковки автомобиля:"
private const val RETURN_CAR = "\nВведите своё имя, чтобы вернуть свою машину:"
private const val INFO_BY_CAR = "\nВведите номер автомобиля:"
private const val INFO_BY_PLACE = "\nВведите номер парковки:"
private const val STATS = "\nТекущая загрузка парковки:"
private const val ALL_STATS = "\nСколько мест было припарковано за всё время: "
private const val END_APP = "\nУдачного вам дня!"

enum class Command(val command: String, val output: String) {
    START("/start", START_GREETING),
    HELP("/help", HELP_INFO),
    PARK("/park", PARKING_CAR),
    RETURN("/return", RETURN_CAR),
    PARK_INFO_BY_CAR("/park_info_by_car", INFO_BY_CAR),
    PARK_INFO_BY_PLACE("/park_info_by_place", INFO_BY_PLACE),
    PARK_STATS("/park_stats", STATS),
    PARK_ALL_STATS("/park_all_stats", ALL_STATS),
    END("/end", END_APP);
}