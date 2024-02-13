pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
//会报错，高版本不需要写这句话，会自动支持
//enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs{
        create("androidXLibs"){
            library("core-ktx", "androidx.core", "core-ktx").version("1.7.0")
            library("appcompat", "androidx.appcompat", "appcompat").version("1.6.1")
            library("constraintlayout", "androidx.constraintlayout", "constraintlayout").version("2.1.4")
            library("navigation-fragment", "androidx.navigation", "navigation-fragment-ktx").version("2.5.3")
            library("navigation-ui", "androidx.navigation", "navigation-ui-ktx").version("2.5.3")
//            bundle("androidx", ["core-ktx", "appcompat", "constraintlayout"])
        }
        create("googleLibs"){
            library("material", "com.google.android.material", "material").version("1.11.0")
        }
    }
}

rootProject.name = "jetpack_android"
include(":app")
