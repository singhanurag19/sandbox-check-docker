# CodeSandbox supports debian & ubuntu based images
FROM ubuntu

# Example; install htop by default
RUN apt update -y && apt install -y htop

# The project will be mounted in /workspace by default

# Every new shell will open inside the built container

# On top of this build, we install `zsh`, `git` and `docker` as additional
# Docker layers.
RUN apt-get -y update
RUN mkdir -p /usr/share/man/man1/
RUN apt-get install -y openjdk-8-jdk
RUN apt-get install -y openjdk-8-jre
RUN update-alternatives --config java
RUN update-alternatives --config javac