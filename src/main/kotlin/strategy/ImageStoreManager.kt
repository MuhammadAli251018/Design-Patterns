package strategy

import strategy.ImageCompressor.CompressAlgorithm
import strategy.FilterApply.ImageFilter

class ImageStoreManager {

    fun saveImage(compressAlg: CompressAlgorithm,
                  filterToApply: ImageFilter,
                  data: String) {

        val adapter = ImageAdapter(compressAlg, filterToApply)
        val imageToSave = adapter.getStoreFormat(data)


        println(imageToSave)
    }
}