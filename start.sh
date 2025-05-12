
# https://hub.docker.com/r/sonatype/nexus3
docker run --restart=no -d -p 8081:8081 --name nexus sonatype/nexus3

# arm64
# https://hub.docker.com/r/klo2k/nexus3
docker pull klo2k/nexus3:3.43.0
