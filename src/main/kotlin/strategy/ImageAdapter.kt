package strategy

import strategy.ImageCompressor.CompressAlgorithm
import strategy.FilterApply.ImageFilter

class ImageAdapter (
    private val compressAlgorithm: CompressAlgorithm,
    private val filter: ImageFilter)
    : ImageCompressor<String> by compressAlgorithm.getInstance(),
    FilterApply<String> by filter.getInstance() {
        fun getStoreFormat(data: String): String = compress(applyFilter(data))
    }