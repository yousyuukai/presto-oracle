##  Presto OraclePlugin

This is a plugin for Presto that allow you to use Oracle Jdbc Connection

###  Connection Configuration

####  Create new properties file inside etc/catalog dir:

```
connector.name=oracle
connection-url=jdbc:oracle:thin:@//host:port/service
connection-user=xxxx
connection-password=xxxx
```

#### Create a dir inside plugin dir called oracle. To make it easier you could copy mysql dir to oracle and remove the mysql-connector and prestodb-mysql jars. Finally put the prestodb-oracle in plugin/oracle folder. Here is the sptes:

```
cd /usr/local/presto
cp -r /usr/local/presto/plugin/mysql /usr/local/presto/plugin/oracle
rm /usr/local/presto/plugin/oracle/mysql-connector*
rm /usr/local/presto/plugin/oracle/presto-mysql*
```

```
docker cp D:\presto-oracle-0.224.jar hadoop0:/usr/local/presto/plugin/oracle
docker cp D:\ojdbc8.jar hadoop0:/usr/local/presto/plugin/oracle
```

####  Building Presto Oracle JDBC Plugin
mvn clean install
