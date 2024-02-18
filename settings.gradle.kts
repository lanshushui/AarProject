apply("script/parseProjectPom.gradle")
pluginManagement {
    repositories {
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl ("https://maven.aliyun.com/repository/public" )}
        maven { setUrl ("https://maven.aliyun.com/repository/gradle-plugin") }
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
buildscript {
    dependencies {
        classpath(files("${rootDir}/libs/snakeyaml-1.29.jar"))
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven(uri("${rootDir}/local_repo/"))
        maven { setUrl("https://maven.aliyun.com/repository/google") }
        maven { setUrl ("https://maven.aliyun.com/repository/public" )}
        google()
        mavenCentral()
    }
}
rootProject.name = "AarProject"
include(":app")
