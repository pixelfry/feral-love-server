INSERT INTO dev.species (species_name, species_attributes)
VALUES ('cat','{"chipped": false, "fixed": false, "rabbies_vaccination": false, "fbrcp_vaccination": false, "feline_leukemia_positive": false, "fiv_positive": false}')

INSERT INTO dev.location (location_name, location_state) VALUES
('Yorkville','Illinois'),
('Warrenville','Illinois'),
('North Aurora','Illinois'),
('Summit','Illinois'),
('West Chicago','Illinois'),
('Streamwood','Illinois'),
('Itasca','Illinois'),
('Bourbonnais','Illinois'),
('Kankakee','Illinois'),
('Hanover Park','Illinois'),
('Elgin','Illinois'),
('Niles','Illinois'),
('Glen Ellyn','Illinois'),
('Aurora','Illinois'),
('Roselle','Illinois'),
('Inverness','Illinois'),
('Montgomery','Illinois');

INSERT INTO dev.animal (animal_name, species_id, location_id, age, gender, description, availability_status) VALUES
('Bella', 1, 1, NULL, 'F', 'A friendly dog.', 'available'),
('Max', 1, 2, 60, 'M', 'Loyal and active.', 'available'),
('Charlie', 1, 3, 36, 'M', 'Gentle giant.', 'available'),
('Lucy', 1, 4, NULL, 'F', 'Energetic and curious.', 'available'),
('Buddy', 1, 5, 24, 'M', 'Playful and outgoing.', 'available'),
('Lola', 1, 6, NULL, 'F', 'Independent and graceful.', 'available'),
('Jack', 1, 7, 50, 'M', 'Bold and friendly.', 'available'),
('Sophie', 1, 8, NULL, 'F', 'Intelligent and calm.', 'available'),
('Toby', 1, 9, 30, 'M', 'Playful and loves to chase balls.', 'available'),
('Sadie', 1, 10, NULL, 'F', 'Sweet and affectionate.', 'available'),
('Bear', 1, 11, 22, 'M', 'Loyal companion.', 'available'),
('Bailey', 1, 12, NULL, 'F', 'Active and loves to explore.', 'available'),
('Duke', 1, 13, 27, 'M', 'Strong and protective.', 'available'),
('Willow', 1, 14, NULL, 'F', 'Curious about the world.', 'adopted'),
('Oscar', 1, 15, 3, 'M', 'Playful spirit.', 'pending'),
('Ruby', 1, 16, NULL, 'F', 'Graceful and elegant.', 'available'),
('Maximus', 1, 17, 2, 'M', 'Loyal and brave leader.', 'available'),
('Luna', 1, 1, 5, 'F', 'Independent and curious about nature.', 'available'),
('Oliver', 1, 2, 8, 'M', 'Gentle and loves to swim.', 'available'),
('Ruby', 1, 3, 11, 'F', 'Energetic explorer.', 'available');