CREATE SCHEMA dev;

DROP TABLE IF EXISTS dev.pets;
DROP TABLE IF EXISTS dev.animal;
DROP TABLE IF EXISTS dev.success_stories;
DROP TABLE IF EXISTS dev.adopters;
DROP TABLE IF EXISTS dev.adoption_events;
DROP TABLE IF EXISTS dev.adoption;

DROP TABLE IF EXISTS dev.animal;
DROP TABLE IF EXISTS dev.location ;
DROP TABLE IF EXISTS dev.species;
DROP TYPE IF EXISTS dev.animal_availability CASCADE;

CREATE TABLE dev.species (
	species_id serial4 NOT NULL,
	species_name varchar(30) NULL,
	species_attributes JSONB NULL,
	CONSTRAINT species_id PRIMARY KEY (species_id)
);

CREATE TABLE dev.location (
	location_id serial4 NOT NULL,
	location_name varchar(50) NOT NULL,
	location_state varchar(35) NOT NULL,
	CONSTRAINT location_pkey PRIMARY KEY (location_id)	
);

CREATE TABLE dev.animal (
	animal_id serial4 NOT NULL,
	animal_name varchar(50) NOT NULL,
	species_id int NOT NULL,
	location_id int NOT NULL,
	age int4 NULL, -- age in months
	gender bpchar(1) NOT NULL,
	description text NULL,
	availability_status varchar(10) DEFAULT 'available',
	CONSTRAINT animal_pkey PRIMARY KEY (animal_id),
	CONSTRAINT fk_location FOREIGN KEY (location_id) REFERENCES dev.location(location_id),
	CONSTRAINT fk_species FOREIGN KEY (species_id) REFERENCES dev.species(species_id)
);

CREATE TABLE dev.success_stories (
    story_id serial4 NOT NULL,
    animal_id int4 NOT NULL, 
    adoption_date timestamptz, 
    story text NOT NULL,
    CONSTRAINT success_stories_pkey PRIMARY KEY (story_id),
    CONSTRAINT fk_animal FOREIGN KEY (animal_id) REFERENCES dev.animal(animal_id)
);



--CREATE TABLE dev.adopters (
--    adopter_id serial4 NOT NULL,
--    name varchar(100) NOT NULL, -- Name of the adopter
--    email varchar(150), -- Email for communication
--    phone varchar(20), -- Phone number for contact
--    address text, -- Physical address
--    CONSTRAINT adopters_pkey PRIMARY KEY (adopter_id)
--);
--
--CREATE TABLE dev.adoption_events (
--    event_id serial4 NOT NULL,
--    animal_id int4 NOT NULL, -- The animal involved in the adoption event
--    event_date timestamp NOT NULL, -- Date and time of the event
--    location text, -- Physical location or online link for the event
--    CONSTRAINT adoption_events_pkey PRIMARY KEY (event_id),
--    CONSTRAINT fk_pet FOREIGN KEY (animal_id) REFERENCES dev.animal(animal_id)
--);
--
--CREATE TABLE dev.adoption (
--    adoption_id serial4 NOT NULL,
--    animal_id int4 NOT NULL, -- Foreign key to link with animal table
--    adopter_id int4 NOT NULL, -- Foreign key to link with adopters table
--    adoption_date date NOT NULL, -- Date when the pet was adopted
--    CONSTRAINT adoption_pkey PRIMARY KEY (adoption_id),
--    CONSTRAINT fk_pet FOREIGN KEY (animal_id) REFERENCES dev.animal(animal_id),
--    CONSTRAINT fk_adopter FOREIGN KEY (adopter_id) REFERENCES dev.adopters(adopter_id)
--);


