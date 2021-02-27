## Projekt-portable

Kotlin Microservice Project Template produces portable application with bundled jvm. For brevity,
double-space formatting is used. [`Clikt`](https://ajalt.github.io/clikt/whyclikt/) is included for
parsing command line arguments. [`Ktor`](https://ktor.io/) is included to mock Digital Ocean healthy
checks.

### Usage

* Just click [`this button`](https://github.com/demidko/Projekt-portable/generate) to use template.

### Deploy to cloud with [`Digital Ocean`](https://cloud.digitalocean.com/)

*. Select repository [`here`](https://cloud.digitalocean.com/apps) to start microservice.

### Run with [`Docker`](https://www.docker.com/products/docker-desktop)

* Execute command `docker-compose up` to start the application in a container.

### Build with [`Gradle`](https://gradle.org/)

* Execute command `gradle clean test runtime` to build self-executable app.

A portable app will be located in `build/image` directory. Start it manually with executable file
in `build/image/bin`.
