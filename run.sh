
## define IP
TARGET_IP=30.7.73.214

## define port
TARGET_PORT=8080

echo ">>>>>   begin to start saber agent   <<<<"
cd ~/tt/
${JAVA_HOME}/bin/java \
    -Xbootclasspath/a:${JAVA_HOME}/lib/tools.jar \
    -jar saber-agent-core.jar \
    -pid ${1} \
    -target ${TARGET_IP}:${TARGET_PORT} \
    -core saber-agent-core.jar \
    -agent saber-agent-client.jar

echo "starting console..."
${JAVA_HOME}/bin/java \
            -cp saber-agent-core.jar \
            org.editice.saber.agent.core.SaberConsole \
                ${TARGET_IP} \
                ${TARGET_PORT}