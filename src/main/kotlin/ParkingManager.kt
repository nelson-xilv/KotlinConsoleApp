private const val INCORRECT_DATA_INPUT = "Введены неверные данные, пожалуйста, повторите запрос."

class ParkingManager {

    private val parking = Parking

    fun carParking() {
        val carAndOwnerData = readln().split(" ")
        if (carAndOwnerData.size == 5) {
            val owner = Owner(carAndOwnerData[3], carAndOwnerData[4])
            val car = Car(carAndOwnerData[0], carAndOwnerData[1], carAndOwnerData[2], owner)
            parking.parkingCar(car)
        } else {
            println(INCORRECT_DATA_INPUT)
        }
    }

    fun returnCarOwner() {
        val ownerName = readln().split(" ")
        if (ownerName.size == 2) {
            val owner = Owner(ownerName[0], ownerName[1])
            parking.ownerVerification(owner)
        }
    }

    fun getInfoByCar() {
        val numberCar = readln()
        parking.getNumberPlace(numberCar)
    }

    fun getInfoByPlace() {
        val numberPlace = readln()
        parking.getNumberCar(numberPlace)
    }
}