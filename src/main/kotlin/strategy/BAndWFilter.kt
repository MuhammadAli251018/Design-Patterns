package strategy

class BAndWFilter : FilterApply<String> {

    override fun applyFilter(data: String): String {
        return "Black&White: $data"
    }
}