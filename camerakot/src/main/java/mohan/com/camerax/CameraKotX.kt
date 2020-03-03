package mohan.com.camerax

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.ImageCapture
import androidx.core.content.ContextCompat
import java.io.File


/*
 * Copyright (c) 2020. Created by Mohanraj.S,Innobot Systems on 12/2/20 for KOTLINworkspace
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
class CameraKotX: AppCompatActivity() {
    private val filename = "test.png"
    private val sd = Environment.getExternalStorageDirectory()
    private val dest = File(sd, filename)
    //private var lensFacing = CameraX.LensFacing.BACK
    private var imageCapture: ImageCapture? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camerax)

       /* bindCamera()

        // Takes an images and saves it in the local storage
        fab_camera.setOnClickListener {
            imageCapture?.takePicture(dest,
                object : ImageCapture.OnImageSavedListener {
                    override fun onError(error: ImageCapture.UseCaseError,
                                         message: String, exc: Throwable?) {
                        Log.e("Image", error.toString())
                    }
                    override fun onImageSaved(file: File) {
                        Log.v("Image", "Successfully saved image")
                    }
                })
        }*/

        // Changes the flash mode when the button is clicked
        /*fab_flash.setOnClickListener {
            val flashMode = imageCapture?.flashMode
            if(flashMode == FlashMode.ON) imageCapture?.flashMode = FlashMode.OFF
            else imageCapture?.flashMode = FlashMode.ON
        }*/

        // Changes the lens direction if the button is clicked
        /*fab_switch_camera.setOnClickListener {
            lensFacing = if (CameraX.LensFacing.FRONT == lensFacing) {
                CameraX.LensFacing.BACK
            } else {
                CameraX.LensFacing.FRONT
            }
            bindCamera()
        }*/
    }

    /**
     * Check if the app has all permissions
     */
    private fun hasNoPermissions(): Boolean{
        return ContextCompat.checkSelfPermission(this,
            Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED || ContextCompat.checkSelfPermission(this,
            Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED || ContextCompat.checkSelfPermission(this,
            Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED
    }

    /**
     * Request all permissions
     */
    fun requestPermission(){
        //ActivityCompat.requestPermissions(this, permissions,0)
    }

    /**
     * Bind the Camera to the lifecycle
     */
    private fun bindCamera(){
        /*CameraX.unbindAll()

        // Preview config for the camera
        val previewConfig = PreviewConfig.Builder()
            .setLensFacing(lensFacing)
            .build()

        val preview = Preview(previewConfig)

        // The view that displays the preview
        val textureView: TextureView = findViewById(R.id.view_finder)

        // Handles the output data of the camera
        preview.setOnPreviewOutputUpdateListener { previewOutput ->
            // Displays the camera image in our preview view
            textureView.surfaceTexture = previewOutput.surfaceTexture
        }


        // Image capture config which controls the Flash and Lens
        val imageCaptureConfig = ImageCaptureConfig.Builder()
            .setTargetRotation(windowManager.defaultDisplay.rotation)
            .setLensFacing(lensFacing)
            .setFlashMode(ImageCapture.FlashMode.ON)
            .build()

        imageCapture = ImageCapture(imageCaptureConfig)

        // Bind the camera to the lifecycle
        CameraX.bindToLifecycle(this as LifecycleOwner, imageCapture, preview)*/
    }

    override fun onStart() {
        super.onStart()

        // Check and request permissions
        if (hasNoPermissions()) {
            requestPermission()
        }
    }

}

