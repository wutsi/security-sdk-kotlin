package com.wutsi.security

import kotlin.String

public enum class Environment(
  public val url: String
) {
  SANDBOX("https://wutsi-security-test.herokuapp.com"),
  PRODUCTION("https://wutsi-security-prod.herokuapp.com"),
  ;
}
