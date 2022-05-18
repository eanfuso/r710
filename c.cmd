rm -rf \opt\apache-tomcat-9.0.56\webapps\ROOT\
rm -rf \opt\apache-tomcat-9.0.56\webapps\ROOT.war
mvn clean install -DskipTests




cd /root/eclipse/jee-2020-062/pomi_02/
rm -rf /var/lib/tomcat9/webapps/ROOT/
rm -rf /var/lib/tomcat9/webapps/ROOT.war
mvn clean install -DskipTests
mv target/ROOT /var/lib/tomcat9/webapps/
sudo systemctl stop tomcat9
sudo systemctl start tomcat9
cd  -

ffmpeg -f   decklink -i "DeckLink SDI 4K" -vf yadif -c:v libx264 -pix_fmt yuv422p -r 25 -g 50 -s 1920x1080  -c:a aac -f flv rtmp://a.rtmp.youtube.com/live2/bvf5-2auh-xudd-kzga-9as6 
