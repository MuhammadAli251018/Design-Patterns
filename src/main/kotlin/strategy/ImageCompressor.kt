package strategy

import kotlin.reflect.KClass

interface ImageCompressor <T> {


    enum class CompressAlgorithm(val getInstance: () -> ImageCompressor<String>) {
        PNG ({ PngCompressor() }),
        JPEG({ JpegCompressor() })
    }

    fun compress(data: String): T
}