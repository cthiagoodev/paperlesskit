package br.com.thiagoodev.paperlesskit

import org.opencv.android.CameraBridgeViewBase
import org.opencv.android.OpenCVLoader


actual class PaperlessKit : PaperlessKitInterface {
    init {
        val isInitialize: Boolean = OpenCVLoader.initLocal()
        if(!isInitialize) {
            throw Exception("OpenCV não pôde ser carregado")
        }
    }

    actual override suspend fun scan(options: Options): PDF {


        TODO("Not yet implemented")
    }

    actual override suspend fun pick(): PDF {
        TODO("Not yet implemented")
    }

    actual override suspend fun open(pdf: PDF) {
        TODO("Not yet implemented")
    }

    actual override suspend fun open(path: String) {
        TODO("Not yet implemented")
    }

}