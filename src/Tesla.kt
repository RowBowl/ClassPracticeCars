class Tesla(
    val modelName: String,
    val year: Int,
    val isAutopilot: Boolean
): Car("Tesla") {
    init {
        println("$year $makeName $modelName created")
    }
}