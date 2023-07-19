package strategy

class PngCompressor : ImageCompressor<String> {

    override fun compress(data: String): String {
        return "$data.png"
    }
}