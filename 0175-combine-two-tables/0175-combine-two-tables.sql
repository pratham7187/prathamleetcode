select firstname,lastname,city,state
from person e
left join  address a
on e.personid=a.personid;