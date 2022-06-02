

CREATE TABLE users (
	id varchar NOT NULL,
	username varchar NOT NULL,
	password varchar NOT NULL,
	first_name varchar NOT NULL,
	last_name varchar NOT NULL,
	email varchar NOT NULL,

		CONSTRAINT pk_users_id
			primary key (id)
);

create table orders (
	id varchar not null,
	total_sale int not null,
	user_id varchar not null,
	subs_id varchar not null,

		constraint pk_orders_id
			primary key (id)
);

create table subs (
	id varchar not null,
	sub_name varchar not null,
	price int not null,
	user_id varchar not null,

		constraint pk_subs_id
			primary key (id)
);

create table user_sub (
	id varchar not null,
	user_id varchar not null,
	subs_id varchar not null,

		constraint pk_usersubs_id
			primary key (id)
);

alter table orders
	add constraint fk_user
		foreign key (user_id),
	add constraint fk_subs
		foreign key (subs_id);

alter table subs
	add constraint fk_user
		foreign key (user_id);