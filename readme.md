````[![Build Status]
### BP_Boilerplate

## Installation
1. Install IntelliJ IDEA
2. Install Java 8
3. Add Lombok plugin to IntelliJ IDEA
4. Turn on delegating Build and Run using and Run tests using actions to Gradle (Preferences | Build, Execution, Deployment | Build Tools | Gradle)

## Run backend 
1. Start DB using `docker run -p 5432:5432 -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=admin -e POSTGRES_DB=test_db_bp -d postgres:9.6.1`
2. Build the app `./gradlew clean build`
3. Run the app - `com.examle.bp.BpApplication` from Intellij IDEA or run `./gradlew bootRun`

## Run frontend
1. `NotAvailable Yet'