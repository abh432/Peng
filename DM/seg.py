f=open("FDRF5-DR.txt")
for x in f:
    n=x.partition("<||>")
    o=n[2]
    n=o.partition("<||>")
    o=n[0]
    n=o.partition(" ")
    o=n[2]
    n=o.partition(" ")
    m=n[0]
    o=n[2]
    n=o.partition(" ")
    d=n[0]
    d=int(d)
    if m == 'Nov': m=0
    elif m == 'Dec': m=30
    n  =  d  +  m  -  11
    g="Day_" +str(n) + ".txt"
    w=open(g,'a')
    w.write(x)
    w.close()
f.close()
