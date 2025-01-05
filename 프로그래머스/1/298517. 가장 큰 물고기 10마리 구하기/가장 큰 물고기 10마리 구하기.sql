select ID as 'ID', LENGTH as 'LENGTH' from FISH_INFO
    where 1 = 1 and LENGTH is not NULL 
        order by LENGTH desc
        LIMIT 10