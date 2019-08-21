package com.sujitmo.chatapp_firebase_kotlin.model

data class ChatChannel(val userIds: MutableList<String>) {
    constructor() : this(mutableListOf())
}