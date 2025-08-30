CREATE SCHEMA dev;

DROP TABLE IF EXISTS dev.pets;
DROP TABLE IF EXISTS dev.success_stories;
DROP TABLE IF EXISTS dev.adopters;
DROP TABLE IF EXISTS dev.adoption_events;
DROP TABLE IF EXISTS dev.adoption;

CREATE TABLE dev.pets (
	pet_id serial4 NOT NULL,
	"name" varchar(50) NOT NULL,
	species varchar(50) NOT NULL,
	breed varchar(100) NULL,
	age int4 NULL,
	gender bpchar(1) NULL,
	description text NULL,
	availability_status varchar(20) DEFAULT 'available'::character varying NULL,
	CONSTRAINT pets_pkey PRIMARY KEY (pet_id)
);

CREATE TABLE dev.success_stories (
    story_id serial4 NOT NULL,
    pet_id int4 NOT NULL, -- Foreign key to link with pets table
    "name" varchar(100) NOT NULL, -- Name of the adopted animal
    adopter_name varchar(100) NOT NULL, -- Name of the person who adopted
    adoption_date date NOT NULL, -- Date when the pet was adopted
    story text NOT NULL, -- Success story or details about the adoption
    CONSTRAINT success_stories_pkey PRIMARY KEY (story_id),
    CONSTRAINT fk_pet FOREIGN KEY (pet_id) REFERENCES dev.pets(pet_id)
);

CREATE TABLE dev.adopters (
    adopter_id serial4 NOT NULL,
    name varchar(100) NOT NULL, -- Name of the adopter
    email varchar(150), -- Email for communication
    phone varchar(20), -- Phone number for contact
    address text, -- Physical address
    CONSTRAINT adopters_pkey PRIMARY KEY (adopter_id)
);

CREATE TABLE dev.adoption_events (
    event_id serial4 NOT NULL,
    pet_id int4 NOT NULL, -- The animal involved in the adoption event
    event_date timestamp NOT NULL, -- Date and time of the event
    location text, -- Physical location or online link for the event
    CONSTRAINT adoption_events_pkey PRIMARY KEY (event_id),
    CONSTRAINT fk_pet FOREIGN KEY (pet_id) REFERENCES dev.pets(pet_id)
);

CREATE TABLE dev.adoption (
    adoption_id serial4 NOT NULL,
    pet_id int4 NOT NULL, -- Foreign key to link with pets table
    adopter_id int4 NOT NULL, -- Foreign key to link with adopters table
    adoption_date date NOT NULL, -- Date when the pet was adopted
    CONSTRAINT adoption_pkey PRIMARY KEY (adoption_id),
    CONSTRAINT fk_pet FOREIGN KEY (pet_id) REFERENCES dev.pets(pet_id),
    CONSTRAINT fk_adopter FOREIGN KEY (adopter_id) REFERENCES dev.adopters(adopter_id)
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
