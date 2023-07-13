package memento

class Editor(
    private val history: History<EdContentState> = EdHistory()
) {
    var content = ""
        set(value) {
            field = value
            history.addNewState(EdContentState(value))
        }



    /**
     * Return the value of the content to the previous value
     * */
    fun undo() {
        content = history.undoChanges().state
        println("undo: Changed Has Undo")
    }
}