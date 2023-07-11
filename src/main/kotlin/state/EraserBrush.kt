package state

class EraserBrush : Brush{

    override fun mouseUp() {
        println("Eraser icon")
    }

    override fun mouseDown() {
        println("Erase something")
    }
}