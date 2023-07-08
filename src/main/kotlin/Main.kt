import momento.Editor

fun main(args: Array<String>) {
    val editor = Editor()

    editor.content = "1"
    editor.content = "2"
    editor.content = "3"

    editor.undo()
}