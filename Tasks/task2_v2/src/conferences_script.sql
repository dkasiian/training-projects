-- insert into conferences (name) values('Java Day Kyiv');
-- insert into conferences (name) values('Java Day Lviv');
-- insert into conferences (name) values('Java Day Odesa');

-- insert into reports (name, duration) values('Java 8', 30);
-- insert into reports (name, duration) values('Java 9', 10);
-- insert into reports (name, duration) values('Java 10', 25);
-- insert into reports (name, duration) values('Java 11', 15);
-- insert into reports (name, duration) values('Java 12', 20);

-- insert into rests (type, duration) values('short', 10);
-- insert into rests (type, duration) values('long', 20);

-- insert into coffee_breaks (type, duration) values('short', 15);
-- insert into coffee_breaks (type, duration) values('long', 25);

-- insert into conferences_reports (conference_id, report_id) values(1, 1);
-- insert into conferences_reports (conference_id, report_id) values(1, 2);
-- insert into conferences_reports (conference_id, report_id) values(2, 1);
-- insert into conferences_reports (conference_id, report_id) values(2, 3);
-- insert into conferences_reports (conference_id, report_id) values(2, 4);
-- insert into conferences_reports (conference_id, report_id) values(3, 1);
-- insert into conferences_reports (conference_id, report_id) values(3, 2);
-- insert into conferences_reports (conference_id, report_id) values(3, 3);
-- insert into conferences_reports (conference_id, report_id) values(3, 5);

-- insert into conferences_rests (conference_id, rest_id, rest_number) values(1, 1, 2);
-- insert into conferences_rests (conference_id, rest_id, rest_number) values(2, 1, 1);
-- insert into conferences_rests (conference_id, rest_id, rest_number) values(2, 2, 1);
-- insert into conferences_rests (conference_id, rest_id, rest_number) values(3, 2, 2);

-- insert into conferences_coffeebreaks (conference_id, coffeebreak_id, coffeebreak_number) values(1, 1, 1);
-- insert into conferences_coffeebreaks (conference_id, coffeebreak_id, coffeebreak_number) values(1, 2, 1);
-- insert into conferences_coffeebreaks (conference_id, coffeebreak_id, coffeebreak_number) values(2, 1, 2);
-- insert into conferences_coffeebreaks (conference_id, coffeebreak_id, coffeebreak_number) values(2, 2, 1);
-- insert into conferences_coffeebreaks (conference_id, coffeebreak_id, coffeebreak_number) values(3, 2, 2);

-- truncate conferences_reports;
-- truncate conferences_rests;
-- truncate conferences_coffeebreaks;
-- truncate conferences;
-- truncate coffee_breaks;
-- truncate reports;
-- truncate rests;

-- delete from conferences where id in (4, 5, 6);
-- delete from reports where id in (6, 7, 8, 9, 10);
-- delete from rests where id in (5, 6);
-- delete from coffee_breaks where id in (3, 4);

-- select * from conferences;

-- select conferences.name, reports.name
-- from conferences, reports
-- join conferences_reports 
-- on conferences_reports.conference_id = conferences.id 
-- AND conferences_reports.report_id = reports.id;

-- select conferences.name, count(conferences_reports.report_id) as Reports_number
-- from conferences
-- join conferences_reports on conferences_reports.conference_id = conferences.id
-- group by conferences.id;

-- select conferences.name, count(reports.report_id) as Conference_duration
-- from conferences
-- join conferences_reports on conferences_reports.conference_id = conferences.id
-- group by conferences.id;


-- select reports.id, reports.name, reports.duration
-- from reports, conferences_reports
-- where conferences_reports.conference_id = 1 AND conferences_reports.report_id = reports.id;

-- select rests.id, rests.type, rests.duration, conferences_rests.rest_number
-- from rests, conferences_rests
-- where conferences_rests.conference_id = 1 AND conferences_rests.rest_id = rests.id;

select coffee_breaks.id, coffee_breaks.type, coffee_breaks.duration, conferences_coffeebreaks.coffeebreak_number
from coffee_breaks, conferences_coffeebreaks
where conferences_coffeebreaks.conference_id = 1 AND conferences_coffeebreaks.coffeebreak_id = coffee_breaks.id;


