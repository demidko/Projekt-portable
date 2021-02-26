# syntax = docker/dockerfile:experimental
FROM gradle:jdk15 as builder
WORKDIR /application
COPY src ./src
COPY build.gradle.kts ./build.gradle.kts
RUN --mount=type=cache,target=./.gradle gradle clean test runtime

FROM debian:latest as backend
WORKDIR /root
COPY --from=builder /application/build/image ./