data class Car(
    val color: String?,
    val brand: String?,
    val number: String?,
    val owner: Owner?
) {
    override fun toString(): String {
        return "$color $brand $number ${owner.toString()}"
    }
}