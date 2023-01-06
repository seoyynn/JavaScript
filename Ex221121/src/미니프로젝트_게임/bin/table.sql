create table zombie(
id varchar2(50)  primary key,
pw varchar2(50),
nick varchar2(50)
);

select * from zombie;

create table ranking(
id varchar2(50) references zombie(id),
rank number(3)

);

select * from ranking;