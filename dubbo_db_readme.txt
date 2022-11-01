# mysql docker script
docker run -p 3306:3306 --name mysql -e MYSQL_ROOT_PASSWORD=root -e TZ=Asia/Taipei -d mysql --default-authentication-plugin=mysql_native_password

# mysql database create script
CREATE DATABASE `example` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

# mysql table create script
# order
CREATE TABLE example.`order` (
	order_id varchar(20) NOT NULL,
	product_id varchar(10) NOT NULL,
	amount decimal(19,0) NOT NULL,
	CONSTRAINT order_PK PRIMARY KEY (order_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

# inventory
CREATE TABLE example.`inventory` (
	product_id varchar(10) NOT NULL,
	amount DECIMAL(19,0) NOT NULL,
	CONSTRAINT order_PK PRIMARY KEY (product_id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

