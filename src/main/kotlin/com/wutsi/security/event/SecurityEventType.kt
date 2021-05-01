package com.wutsi.security.event

enum class SecurityEventType(val urn: String) {
  APIKEY_CREATED("urn:event:wutsi:security:apikey-created"),
  APIKEY_UPDATED("urn:event:wutsi:security:apikey-updated"),
  APIKEY_DELETED("urn:event:wutsi:security:apikey-deleted"),
}
