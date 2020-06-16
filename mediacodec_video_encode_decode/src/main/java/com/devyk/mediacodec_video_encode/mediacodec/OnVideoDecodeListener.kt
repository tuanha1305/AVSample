package com.devyk.mediacodec_video_encode.mediacodec

import android.media.MediaCodec
import java.nio.ByteBuffer

/**
 * 编码回调
 */
interface OnVideoDecodeListener {
    abstract fun onVideoDecode(bb: ByteBuffer, bi: MediaCodec.BufferInfo)
}
