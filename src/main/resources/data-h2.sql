insert into tb_employee (id, version, name) values (150, 0, 'Jamie');

insert into tb_employee (id, version, name, manager_id) values (100, 0, 'Alan', 150);
insert into tb_employee (id, version, name, manager_id) values (220, 0, 'Martin', 100);
insert into tb_employee (id, version, name, manager_id) values (275, 0, 'Alex', 100);

insert into tb_employee (id, version, name, manager_id) values (400, 0, 'Steve', 150);
insert into tb_employee (id, version, name, manager_id) values (190, 0, 'David', 400);
