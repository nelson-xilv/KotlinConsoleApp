object Parking {

    private val parking = mutableMapOf<String, Car?>()
    private var parkingStats = 0

    init {
        for (i in 1..20) {
            parking["P$i"] = null
        }
    }

    fun addCar(car: Car) {
        for ((key, value) in parking) {
            if (value == null) {
                parking[key] = car
                println("\nАвтомобиль $car припаркован в $key")
                parkingStats++
                break
            }
        }
    }

    fun ownerVerification(owner: Owner) {
        for (parkingPlace in parking) {
            if (parkingPlace.value?.owner == owner) {
                println("\n$owner забрал свой автомобиль ${parkingPlace.value}")
                parkingPlace.setValue(null)
                return
            }
        }
        println("\n$owner не парковал свой автомобиль")
    }

    fun getNumberPlace(numberCar: String) {
        for (parkingPlace in parking) {
            if (numberCar == parkingPlace.value?.number.toString()) {
                println("\nМашина ${parkingPlace.value} припаркована в месте ${parkingPlace.key}")
                return
            }
        }
        println("\nТакой машины на праковке нет")
    }

    fun getNumberCar(numberPlace: String) {
        val correctNumberPlace = "P$numberPlace"
        for (parkingPlace in parking) {
            if (correctNumberPlace == parkingPlace.key) {
                println("\nПрипаркованная на месте $numberPlace машина: ${parkingPlace.value}")
                return
            }
        }
        println("\nПарковка пуста")
    }

    fun showParking() {
        parking.onEach { (key, value) ->
            if (value == null) {
                println("$key = Свободно")
            } else {
                println("$key = $value")
            }
        }
    }

    fun getParkingStats(): Int {
        return parkingStats
    }
}