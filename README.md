## Connection Configuration

## Create new properties file inside etc/catalog dir:

connector.name=oracle
connection-url=jdbc:oracle:thin:@//host:port/service
connection-user=xxxx
connection-password=xxxx

## Create a dir inside plugin dir called oracle. To make it easier you could copy mysql dir to oracle and remove the mysql-connector and prestodb-mysql jars. Finally put the prestodb-oracle in plugin/oracle folder. Here is the sptes:

docker cp D:\presto-oracle-0.224.jar hadoop0:/usr/local/
docker cp D:\ojdbc8.jar hadoop0:/usr/local/

cd /usr/local/presto
cp -r /usr/local/presto/plugin/mysql /usr/local/presto/plugin/oracle
rm /usr/local/presto/plugin/oracle/mysql-connector*
rm /usr/local/presto/plugin/oracle/presto-mysql*
mv /usr/local/presto-oracle*.jar /usr/local/presto/plugin/oracle
mv /usr/local/ojdbc8.jar /usr/local/presto/plugin/oracle

## Building Presto Oracle JDBC Plugin
mvn clean install
