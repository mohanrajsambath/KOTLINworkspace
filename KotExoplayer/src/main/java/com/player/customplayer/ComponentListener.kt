package com.player.customplayer

import android.view.Surface
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.TextureView
import com.google.android.exoplayer2.Player
import com.google.android.exoplayer2.audio.AudioRendererEventListener
import com.google.android.exoplayer2.video.VideoFrameMetadataListener
import com.google.android.exoplayer2.video.VideoListener
import com.google.android.exoplayer2.video.VideoRendererEventListener
import com.google.android.exoplayer2.video.spherical.CameraMotionListener


/*
 * Copyright (c) 2019. Created by Mohanraj.S,Innobot Systems on 16/9/19 for KOTLINworkspace
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
class ComponentListener : Player.VideoComponent,VideoRendererEventListener,AudioRendererEventListener{

    override fun setVideoTextureView(textureView: TextureView?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addVideoListener(listener: VideoListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVideoScalingMode(videoScalingMode: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setCameraMotionListener(listener: CameraMotionListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearVideoSurfaceHolder(surfaceHolder: SurfaceHolder?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVideoSurface(surface: Surface?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearCameraMotionListener(listener: CameraMotionListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVideoSurfaceView(surfaceView: SurfaceView?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getVideoScalingMode(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVideoSurfaceHolder(surfaceHolder: SurfaceHolder?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearVideoSurface() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearVideoSurface(surface: Surface?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeVideoListener(listener: VideoListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearVideoFrameMetadataListener(listener: VideoFrameMetadataListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setVideoFrameMetadataListener(listener: VideoFrameMetadataListener?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearVideoSurfaceView(surfaceView: SurfaceView?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun clearVideoTextureView(textureView: TextureView?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val TAG = "ComponentListener"


}