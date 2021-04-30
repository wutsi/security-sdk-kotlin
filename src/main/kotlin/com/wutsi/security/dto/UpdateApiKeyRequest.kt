package com.wutsi.security.dto

import kotlin.String
import kotlin.collections.List

public data class UpdateApiKeyRequest(
  public val name: String = "",
  public val scopes: List<String> = emptyList()
)
