package io.sixhours.conf

import io.sixhours.env.Environment

/**
 * Configuration properties.
 */
data class Configuration(var environment: Environment = Environment.test, var user: User = User())

data class User(var firstName: String = "", var lastName: String = "")
