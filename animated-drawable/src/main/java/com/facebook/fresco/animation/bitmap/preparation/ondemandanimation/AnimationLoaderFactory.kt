/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation

import com.facebook.fresco.animation.backend.AnimationInformation
import com.facebook.fresco.animation.bitmap.BitmapFrameRenderer
import com.facebook.fresco.animation.bitmap.preparation.loadframe.FpsCompressorInfo
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory

class FrameLoaderFactory(
    private val platformBitmapFactory: PlatformBitmapFactory,
    private val maxFpsRender: Int
) {

  fun createBufferLoader(
      bitmapFrameRenderer: BitmapFrameRenderer,
      animationInformation: AnimationInformation
  ): FrameLoader =
      BufferFrameLoader(
          platformBitmapFactory,
          bitmapFrameRenderer,
          FpsCompressorInfo(maxFpsRender),
          animationInformation)
}
