plugins {
    id("com.gradle.enterprise") version "3.12.1"
}

rootProject.name = "FizzBuzzEnterpriseEdition"

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
