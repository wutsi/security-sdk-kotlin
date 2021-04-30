package com.wutsi.security

import com.wutsi.security.dto.CreateApiKeyRequest
import com.wutsi.security.dto.CreateApiKeyResponse
import com.wutsi.security.dto.GetApiKeyResponse
import com.wutsi.security.dto.UpdateApiKeyRequest
import com.wutsi.security.dto.UpdateApiKeyResponse
import feign.Param
import feign.RequestLine
import kotlin.String
import kotlin.Unit

public interface SecurityApi {
  @RequestLine("POST /v1/api-keys")
  public fun create(request: CreateApiKeyRequest): CreateApiKeyResponse

  @RequestLine("GET /v1/api-keys/{id}")
  public fun `get`(@Param("id") id: String): GetApiKeyResponse

  @RequestLine("POST /v1/api-keys/{id}")
  public fun update(@Param("id") id: String, request: UpdateApiKeyRequest): UpdateApiKeyResponse

  @RequestLine("DELETE /v1/api-keys/{id}")
  public fun delete(@Param("id") id: String): Unit
}
