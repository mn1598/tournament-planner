FROM docker:19.03.12-dind-rootless
# FROM maven:3.9.6-eclipse-temurin-21

USER root

# Install SSH and other tools
RUN ls -la /root && \
    chmod 777 /root && \
    cat /etc/apk/repositories && \
    apk update && apk add \
    openssh-client \
    openssl \
    unzip \
    curl \
    git \
    maven \
    && rm -rf /var/lib/apt/lists/*

# Install Temurin 21
ENV JAVA_VERSION=21 \
    JAVA_DISTRO=temurin

RUN curl -L "https://github.com/adoptium/temurin21-binaries/releases/latest/download/OpenJDK21U-jdk_x64_linux_hotspot_21.0.7_6.tar.gz" \
    | tar -xz -C /opt/ && \
    ln -s /opt/jdk-* /opt/jdk

ENV JAVA_HOME=/opt/jdk
ENV PATH="${JAVA_HOME}/bin:${PATH}"

# Install mvnd (optional, if you’re using Maven Daemon)
ENV MVND_VERSION=1.0.2
RUN curl -L https://downloads.apache.org/maven/mvnd/${MVND_VERSION}/maven-mvnd-${MVND_VERSION}-linux-amd64.zip -o mvnd.zip && \
    unzip mvnd.zip && \
    ls && \
    mv maven-mvnd-${MVND_VERSION}-linux-amd64 /opt/mvnd && \
    ln -s /opt/mvnd/bin/mvnd /usr/local/bin/mvnd && \
    rm mvnd.zip && \
    git config --global --add safe.directory /IdeaProjects/tournament-planner

# Set up a non-root user
#RUN useradd -ms /bin/bash vscode && chown -R vscode /home/vscode
#USER vscode


# Create rootless user and home directory
RUN useradd -ms /bin/bash rootless && chown -R rootless /home/rootless
# Set the user back to the rootless user
USER rootless

ENV PATH="/opt/mvnd/bin:$PATH"
