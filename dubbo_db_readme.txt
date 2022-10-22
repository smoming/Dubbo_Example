# mysql docker script
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=root -e TZ=Asia/Taipei -d mysql --default-authentication-plugin=mysql_native_password

# mysql database create script
CREATE DATABASE `example` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

# mysql table create script
# TB_MIKE
CREATE TABLE TB_MIKE (
	CA varchar(100) NOT NULL,
	CB varchar(100) NULL,
	CONSTRAINT TB_CHENNI_PK PRIMARY KEY (CA)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

# TB_CHENNI
CREATE TABLE TB_CHENNI (
	CA varchar(100) NOT NULL,
	CB varchar(100) NULL,
	CONSTRAINT TB_CHENNI_PK PRIMARY KEY (CA)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

