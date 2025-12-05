pluginManagement {
    includeBuild("build-logic")
}

rootProject.name = "chirp"

include("app")
include("user")
include("chat")
include("notification")
include("common")