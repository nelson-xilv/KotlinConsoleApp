object Parking {

    private val parking = mutableMapOf<String, Car?>()

    init {
        for (i in 1..20) {
            parking["P$i"] = null
        }
    }

    fun parkingCar(car: Car) {

        for ((key, value) in parking) {
            if (value == null) {
                parking[key] = car
                println("Автомобиль $car припаркован в $key")
                break
            }
        }
    }

    fun ownerVerification(owner: Owner) {
        for (parkingPlace in parking) {
            if (parkingPlace.value?.owner == owner) {
                println("$owner забрал свой автомобиль ${parkingPlace.value}")
                parkingPlace.setValue(null)
                return
            }
        }
        println("$owner не парковал свой автомобиль")
    }

    fun getNumberPlace(numberCar: String) {
        for (parkingPlace in parking) {
            if (numberCar == parkingPlace.value?.number.toString()) {
                println("Машина ${parkingPlace.value} припаркована в месте ${parkingPlace.key}")
                return
            }
        }
        println("Такой машины на праковке нет")
    }

    fun getNumberCar(numberPlace: String) {
        val correctNumberPlace = "P$numberPlace"
        for(parkingPlace in parking) {
            if (correctNumberPlace == parkingPlace.key) {
                println("Припаркованная на месте $numberPlace машина: ${parkingPlace.value}")
                return
            }
        }
        println("Парковка пуста")
    }

//    fun showParking() {
//        parking.onEach { (key, value) ->
//            if (value == null) {
//                println("$key = Свободно")
//            } else {
//                println("$key = $value")
//            }
//        }
//    }
}
