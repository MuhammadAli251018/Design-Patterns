package strategy

interface FilterApply <T> {
    enum class ImageFilter(val getInstance: () -> FilterApply<String>) {
        BlackAndWhite({BAndWFilter()}),
        HighContrast({HighContrastFilter()})
    }

    fun applyFilter(data: T): T
}