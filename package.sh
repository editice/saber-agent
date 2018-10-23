cd ~/Documents/code/saber-agent/saber-agent-client
mvn clean package
cd ..
cd ~/Documents/code/saber-agent/saber-agent-core
mvn clean package

echo "begin to move jar >>>> "
mv ~/Documents/code/saber-agent/saber-agent-client/target/saber-agent-client-jar-with-dependencies.jar ~/tt/saber-agent-client.jar
mv ~/Documents/code/saber-agent/saber-agent-core/target/saber-agent-core-jar-with-dependencies.jar ~/tt/saber-agent-core.jar
echo "move successful!  >>>> "