CREATE SCHEMA dev;

DROP TABLE IF EXISTS dev.pets;

CREATE TABLE dev.pets (
	pet_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	species varchar(50) NOT NULL,
	breed varchar(100) NULL,
	age int4 NULL,
	gender bpchar(1) NULL,
	description text NULL,
	availability_status varchar(20) DEFAULT 'Available'::character varying NULL,
	CONSTRAINT pets_pkey PRIMARY KEY (pet_id)
);

INSERT INTO dev.pets ("name",species,breed,age,gender,description,availability_status) VALUES
	 ('Leeroy','cat','tabby',4,'M','Descritpion text','available'),
	 ('Lucky','cat','main coon',7,'M','Descritpion text','available'),
	 ('Maleficient','cat','persian',2,'F','Descritpion text','adopted'),
	 ('Nala','cat','ragdoll',3,'F','Descritpion text','adopted'),
	 ('Athena','cat','burmese',1,'F','Descritpion text','adopted'),
	 ('Abby','cat','american shorthair',7,'F','Descritpion text','pending'),
	 ('Kiyomi','cat','exotic shorthair',8,'F','Descritpion text','pending'),
	 ('Kuro','cat','siamese',12,'F','Descritpion text','adopted'),
	 ('Lucy','cat','tabby',10,'F','Descritpion text','adopted'),
	 ('Mallard','cat','persian',6,'M','Descritpion text','available'),
	 ('Nala','cat','ragdoll',3,'F','Descritpion text','available'),
	 ('Nala','cat','ragdoll',3,'F','Descritpion text','available'),
	 ('Nala','cat','ragdoll',3,'F','Descritpion text','pending');