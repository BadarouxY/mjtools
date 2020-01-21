INSERT INTO career(
	advanced, name)
	VALUES (true, 'sergent');

	INSERT INTO public.characters(
	number_of_siblings, age, astral_signe, birthplace, exp, eyes_color, gender, hair_color, height, is_a_npc, name, notes, race, surname, weight, career_id)
	VALUES (2, 25, 'CHEVRE_SAUVAGE', 'GRENOBLE', 1500, 'BLEUS', 'HOMME', 'BRUN', 50, false, 'Bob', 'chouette type', 'ELFE', 'Dylan', 80, 1);

/*INSERT TRAITS*/
INSERT INTO traits (description, name, character_id) VALUES ('+10% force', 'Force accrue', 1);

/*INSERT SKILLS*/
INSERT INTO skills (acquired, advanced, associated_attribute, bonus, description, mastered, name, character_id) VALUES (true, true, 'Force', 10, 'Intimide les ennemis', false, 'Intimidation', 1);

/*INSERT ATTRIBUTE*/
INSERT INTO attributes (name, value, character_id) VALUES ('Force', '45', 1);
INSERT INTO attributes (name, value, character_id) VALUES ('Dextérité', '35', 1);
INSERT INTO attributes (name, value, character_id) VALUES ('Charisme', '65', 1);

INSERT INTO distinctive_signs(
	name, character_id)
	VALUES ('GROS NEZ', 1);