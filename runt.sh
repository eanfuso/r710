#bin/bash
#ejecutar este scrip desde : :~/eclipse/jee-2020-062/pomi_02pomi

cd /root/eclipse/jee-2020-062/pomi_02/
sudo rm -rf /opt/tomcat/webapps/ROOT/
sudo rm -rf /opt/tomcat/webapps/ROOT.war
mvn clean install -DskipTests
sudo mv target/ROOT /opt/tomcat/webapps/

#cd /opt/tomcat/bin/
#./catalina.sh run
#cd /root/eclipse/jee-2020-062/pomi_02/
