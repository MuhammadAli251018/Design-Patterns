package state

class DrawBrush : Brush {

    override fun mouseUp() {
        println("Draw icon")
    }

    override fun mouseDown() {
        println("Draw line")
    }
}