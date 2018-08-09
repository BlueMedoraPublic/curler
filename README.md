# Curler

## What

Curl approximator written in Java, wrapping [libetl/curl](https://github.com/libetl/curl)

Find the latest release [here](https://github.com/BlueMedora/curler/releases)!

## Why

Because curl on vR Ops doesn't work with newer TLS versions

## Build

./gradlew build

## Run

java -jar curler.jar [options] url

## Caveats

Some typical curl flags aren't supported by the library we're wrapping, including -i and --url

See supported flags at the bottom of the README [here](https://github.com/libetl/curl)
