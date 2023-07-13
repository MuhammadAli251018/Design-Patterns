package iterator

class HistoryManager<T> {

    private val history = mutableListOf<T>()
    val iterator = ListIterator(this)

    fun add(vararg newElements: T) {
        newElements.forEach {newElement ->
            history.add(newElement)
        }
    }

    fun viewLast(): T = history.last()

    inner class ListIterator <T> (
        private val historyManager: HistoryManager<T>
    ) : Iterator<T> {
        private var index: Int = 0

        override fun next(): Boolean {
            if (index < 0)
                throw NoSuchElementException()

            val hasNext = hasNext()
            if (hasNext)
                index ++

            return hasNext
        }

        override fun current(): T = if (index < 0) throw NoSuchElementException() else historyManager.history[index]

        override fun hasNext(): Boolean = historyManager.history.size - 1 > index

    }
}