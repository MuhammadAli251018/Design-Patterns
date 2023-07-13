package iterator

interface Iterator<T> {

    fun next(): Boolean

    fun current(): T

    fun hasNext(): Boolean
}