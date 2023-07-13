import iterator.HistoryManager

fun main(args: Array<String>) {
    val strHManager = HistoryManager<String>()

    strHManager.add("A", "B", "C", "D")
    //print elements
    do {
        println(strHManager.iterator.current())
    }
    while (strHManager.iterator.next())

}