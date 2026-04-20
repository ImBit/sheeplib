plugins {
    id("sheeplib.fabric")
}

loom.runConfigs["client"].ideConfigGenerated(true)

dependencies {
    implementation(libs.fabric.api)
    implementation(project(":api"))
    implementation(project(":coroutines"))
}
