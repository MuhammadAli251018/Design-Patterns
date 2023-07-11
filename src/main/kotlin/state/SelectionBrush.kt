package state

class SelectionBrush : Brush {
    override fun mouseUp() {
        println("Selection icon")
    }

    override fun mouseDown() {
        println("Draw dashed rectangle")
    }
}