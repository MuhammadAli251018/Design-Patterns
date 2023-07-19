package strategy

class HighContrastFilter : FilterApply<String> {
    override fun applyFilter(data: String): String {
        return "HighContrast: $data"
    }
}