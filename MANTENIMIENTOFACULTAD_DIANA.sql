create database LaboratorySIU;
use LaboratorySIU;
create table facultad
(
	ID  int (20) auto_increment,
    Codigo_Facultad varchar (5) primary key,
	nombreFacultad varchar (45),
    Estado_Facultad varchar (1)
    )ENGINE=InnoDB;
    
use LaboratorySIU;
select * from facultad;