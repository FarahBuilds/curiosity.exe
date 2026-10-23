fun main() {
    val questions = listOf(
        "If your thoughts had a color, what would it be?",
        "What would you build if failure was impossible?",
        "Can a machine ever understand curiosity?",
        "What tiny thing changed your perspective?",
        "If the universe had a source code, would you read it?",
        "What would your future self thank you for?"
    )

    println("CURIOSITY.EXE")
    println("\nYour mind has a new quest.")

    val question = questions.random()
    println("\n✦ $question")
    println("\nKeep wondering. Keep building.")
}
