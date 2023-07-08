package momento

interface History <T> {
    fun undoChanges(): T

    fun addNewState(state: T)
}