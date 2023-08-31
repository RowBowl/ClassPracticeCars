class Toyota(
    val modelName: String,
    val year: Int
): Car("Toyota") {
    init {
        println("$year $makeName $modelName created")
    }
}