package strategy

class JpegCompressor : ImageCompressor<String> {

    override fun compress(data: String): String {
        return "$data.jpg"
    }
}