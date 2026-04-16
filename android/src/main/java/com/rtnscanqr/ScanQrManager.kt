package com.rtnscanqr

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.common.MapBuilder
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewManagerDelegate
import com.facebook.react.viewmanagers.RTNScanQrManagerDelegate
import com.facebook.react.viewmanagers.RTNScanQrManagerInterface

@ReactModule(name = ScanQrManager.NAME)
class ScanQrManager : SimpleViewManager<ScanQr>(), RTNScanQrManagerInterface<ScanQr> {

    private val mDelegate: ViewManagerDelegate<ScanQr> = RTNScanQrManagerDelegate(this)

    override fun getDelegate(): ViewManagerDelegate<ScanQr> = mDelegate

    override fun getName(): String = NAME

    override fun createViewInstance(reactContext: ThemedReactContext): ScanQr {
        // Get the real ReactApplicationContext from the ThemedReactContext
        val reactAppContext = reactContext.reactApplicationContext
        val scanQr = ScanQr(reactAppContext)
        scanQr.setUpCamera(reactAppContext)
        return scanQr
    }

    override fun getExportedCustomDirectEventTypeConstants(): Map<String?, Any> {
        return MapBuilder.of(
            "topOnQrScanned",
            MapBuilder.of("registrationName", "onQrScanned")
        )
    }

    companion object {
        const val NAME = "RTNScanQr"
    }
}