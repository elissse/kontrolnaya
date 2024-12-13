create sequence sports_equipment_seq;

create table sports_equipment
(
    id       bigint primary key default nextval('sports_equipment_seq'),
    name character varying(100),
    parameters character varying(100),
    age character varying(100),
    accommodationConditions character varying(100)
);

insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('racquet','very really good','2 years','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('chess board','very really good','3 years','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('football net','very really good','6 years','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('helmet','very really good','4 months','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('shoulder pads','very really good','14 days','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('facemask','very really good','14 days','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('gloves','very really good','4 months','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('mouthguard','very really good','14 days','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('football ball','very really good','4 months','very easy to accommodate');
insert into sports_equipment (name, parameters, age, accommodationConditions)
values ('goggles','very really good','14 days','very easy to accommodate');
