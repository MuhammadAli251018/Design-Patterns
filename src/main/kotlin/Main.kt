import momento.Editor
import state.Canvas
import state.DrawBrush
import state.EraserBrush
import state.SelectionBrush

fun main(args: Array<String>) {

    val canvas = Canvas()

    canvas.mouseDown(SelectionBrush())
    canvas.mouseDown(DrawBrush())
    canvas.mouseDown(EraserBrush())

}