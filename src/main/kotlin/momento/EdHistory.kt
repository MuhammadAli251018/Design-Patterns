package momento

import java.util.Stack

class EdHistory : History<EdContentState> {
    private val history = Stack<EdContentState>()

    override fun undoChanges(): EdContentState {
        return history.pop() ?: EdContentState("")
    }

    override fun addNewState(state: EdContentState) {
        history.push(state)
    }
}