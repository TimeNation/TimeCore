pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }

    plugins {
        val kotlinVersion = "1.7.10"

        kotlin("jvm") version kotlinVersion
        kotlin("kapt") version kotlinVersion
    }
}

rootProject.name = "TimeCore"
include("api")



include("plugin")
include("plugin:proxy")
include("plugin:common")
include("plugin:paper")
include("api:common")
findProject(":api:common")?.name = "common"
include("api:paper")
findProject(":api:paper")?.name = "paper"
include("api:proxy")
findProject(":api:proxy")?.name = "proxy"
