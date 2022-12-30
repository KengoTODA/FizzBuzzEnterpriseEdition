plugins {
    java
    application
}

repositories {
    mavenCentral()
}

sourceSets {
    main {
        java {
            srcDir("src/main/java")
        }
        resources {
            srcDir("resources/assets/configuration/spring/dependencyinjection/configuration/")
        }
    }
}

dependencies {
    implementation("org.springframework:spring-aop:3.2.13.RELEASE")
    implementation("org.springframework:spring-beans:3.2.13.RELEASE")
    implementation("org.springframework:spring-context:3.2.13.RELEASE")
    implementation("org.springframework:spring-core:3.2.13.RELEASE")
    implementation("org.springframework:spring-expression:3.2.13.RELEASE")

    testImplementation("junit:junit:4.8.2")
}

application {
    mainClass.set("com.seriouscompany.business.java.fizzbuzz.packagenamingpackage.impl.Main")
}
