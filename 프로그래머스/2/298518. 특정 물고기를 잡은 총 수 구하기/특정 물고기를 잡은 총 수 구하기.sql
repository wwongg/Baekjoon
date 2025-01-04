select count(*) as 'FISH_COUNT' 
    from FISH_INFO as I
        join FISH_NAME_INFO as N on I.FISH_TYPE =   
            N.FISH_TYPE
            where FISH_NAME = "BASS" or FISH_NAME = "SNAPPER"
