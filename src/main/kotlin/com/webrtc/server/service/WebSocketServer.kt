package com.webrtc.server.service

import jakarta.websocket.*
import jakarta.websocket.server.ServerEndpoint
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Component

@ServerEndpoint("/ws")
@Slf4j
@Component
class WebSocketServer {

    private var session: Session? = null

    @OnOpen
    public fun onOpen(session: Session?) {
        this.session = session
        // 1. 有用户连接

    }

    @OnMessage
    fun onMessage(message: String) {
        // 2. 验证用户连接是否正确
        println("onMessage")
    }

    @OnClose
    fun onClose() {

    }

    @OnError
    fun onError(session: Session, error: Throwable) {
        println("error")
    }
}
