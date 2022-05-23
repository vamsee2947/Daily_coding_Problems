def fun(llist, start):
    i_list = []
    i_list.append(start)

    while len(llist) >= 1:
        current = None
        directions = {}

        for item in llist:
           
            if item[0] == start:
                directions[item[0]] = item[1]

        if len(directions) >= 1:
            current = min(directions.values())
            remove_tuple = (start, current)

        try:
            llist.remove(remove_tuple)
            i_list.append(current)
            start = current
        except:
            return 0

    return i_list

