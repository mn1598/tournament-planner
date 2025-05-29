# Official Maven image with Eclipse Temurin 21 JDK
FROM maven:3.9.6-eclipse-temurin-21

# Create a non-root user to match Dev Container expectations
RUN useradd -m vscode && chown -R vscode /home/vscode

# Set the user for devcontainer usage
USER vscode
