
	INSERT INTO public.characters(
	number_of_siblings, age, astral_sign, birthplace, total_exp, current_exp, eyes_color, gender, hair_color, height, is_a_npc, name, notes, race, surname, weight, career)
	VALUES (2, 25, 'CHEVRE_SAUVAGE', 'GRENOBLE', 1500, 1000, 'BLEUS', 'HOMME', 'BRUN', 50, false, 'Coco', 'chouette type', 'ELFE', 'Dylan', 80, 'SERGENT');

/*INSERT TRAITS*/
INSERT INTO traits (description, name) VALUES ('+10% force', 'Force accrue');

/*INSERT SKILLS*/
INSERT INTO skills (acquired, advanced, associated_attribute, bonus, description, mastered, name) VALUES (true, true, 'Force', 10, 'Intimide les ennemis', false, 'Intimidation');

/*INSERT ATTRIBUTE*/
INSERT INTO attributes (name, value) VALUES ('Force', '45');
INSERT INTO attributes (name, value) VALUES ('Dextérité', '35');
INSERT INTO attributes (name, value) VALUES ('Charisme', '65');

INSERT INTO distinctive_signs(
	name)
	VALUES ('GROS NEZ');

INSERT INTO public.personns(
	mail, name, password)
	VALUES ('yba@yopmail.com', 'yannick', 'prout');