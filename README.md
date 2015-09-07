# dotopstory-info
도탑전기 게임정보

CREATE TABLE hero_group(
  idx INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  NAME VARCHAR (200) NOT NULL,
  TYPE ENUM('str', 'dex', 'wis') DEFAULT 'str' NOT NULL,
  icon VARCHAR (1000) NOT NULL,
  update_date DATETIME
);

CREATE TABLE hero (
  idx INT (11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  group_id INT (11) NOT NULL COMMENT '영웅 정보', 
  str FLOAT(5,2) NOT NULL,
  str_adder FLOAT(5,2) NOT NULL,
  dex FLOAT(5,2) NOT NULL,
  dex_adder FLOAT(5,2) NOT NULL,
  wis FLOAT(5,2) NOT NULL,
  wis_adder FLOAT(5,2) NOT NULL,
  star ENUM('1','2','3','4','5') COMMENT '영웅 별',
  update_date DATETIME
) ;
