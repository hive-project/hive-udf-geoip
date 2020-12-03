ADD JAR hdfs:///user/hive/udf/geoip/hive-udf-0.1-SNAPSHOT.jar;
ADD FILE hdfs:///user/hive/udf/geoip/GeoIP2-Country.mmdb;
CREATE TEMPORARY FUNCTION geoip as 'com.spuul.hive.GeoIP2';
 
 
select
geoip(last_ip,'COUNTRY_CODE','./GeoIP2-Country.mmdb') as country_code
from
tablea;
