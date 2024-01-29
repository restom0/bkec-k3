/*
Enter your query here.
*/
select stu.Name, gra.Grade, stu.Marks from Students as stu
INNER JOIN Grades as gra
WHERE stu.Marks>=70 and stu.Marks between gra.Min_Mark and gra.Max_Mark
union
select NULL, gra.Grade, stu.Marks from Students as stu
INNER JOIN Grades as gra
WHERE stu.Marks<70 and stu.Marks between gra.Min_Mark and gra.Max_Mark
order by Grade DESC, Name ASC, Marks ASC
