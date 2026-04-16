package com.rtnscanqr

import com.facebook.react.bridge.Arguments
import com.facebook.react.bridge.WritableMap
import com.facebook.react.uimanager.events.Event

class ScanQrEvent(
    surfaceId: Int,
    viewId: Int,
    private val qrValue: String
) : Event<ScanQrEvent>(surfaceId, viewId) {

    override fun getEventName(): String {
        return "topOnQrScanned"
    }

    override fun canCoalesce(): Boolean {
        return false
    }

    override fun getEventData(): WritableMap {
        val event: WritableMap = Arguments.createMap()
        event.putString("value", qrValue)
        return event
    }
}
