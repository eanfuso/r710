#bin/bash
#ejecutar este scrip desde : :~/eclipse/jee-2020-062/pomi_02pomi

cd /root/eclipse/jee-2020-062/pomi_02/
sudo rm -rf /var/lib/tomcat9/webapps/ROOT/
sudo rm -rf /var/lib/tomcat9/webapps/ROOT.war
mvn clean install -DskipTests
sudo mv target/ROOT /var/lib/tomcat9/webapps/
sudo systemctl stop tomcat9
sudo systemctl start tomcat9
cd  -
