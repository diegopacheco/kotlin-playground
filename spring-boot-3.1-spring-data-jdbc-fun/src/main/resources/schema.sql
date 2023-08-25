create table Author (
	id uuid as random_uuid() PRIMARY KEY,
	name varchar(30),
	last_name varchar(30),
	book varchar(40)
);