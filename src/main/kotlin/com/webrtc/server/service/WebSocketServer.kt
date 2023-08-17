package com.webrtc.server.service

import jakarta.websocket.OnClose
import jakarta.websocket.OnError
import jakarta.websocket.OnMessage
import jakarta.websocket.OnOpen
import jakarta.websocket.Session
import jakarta.websocket.server.ServerEndpoint
import lombok.extern.slf4j.Slf4j
import org.springframework.stereotype.Component

@ServerEndpoint("/ws")
@Slf4j
@Component
class WebSocketServer {

    private var session: Session? = null

    @OnOpen
    public fun onOpen(session: Session) {
        this.session = session
        // 1. 有用户连接
        println("有用户连接")
    }

    @OnMessage
    fun onMessage(message: ByteArray?) {
        // 2. 验证用户连接是否正确

    }

    @OnClose
    fun onClose() {

    }

    @OnError
    fun onError(session: Session, error: Throwable) {

    }


}

enum class SignalingCommand {
    AUTH, //鉴权
    STATE, // 状态更新
    OFFER, // 提议
    ANSWER // 回应
}
