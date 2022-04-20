;sets unique values (but in list copy can be present)
(println (set '(1 1 2 2)))
(println (sorted-set 3 2 1))  ;sorted-set
(println (contains? (set '(3 2 1)) 2))  ;contains
(println (conj (set '(3 2 1)) 5 8))   ;conjoins
(println (disj (set '(3 8 1)) 8))     ;disjoins
(println (set/union #{1 2} #{3 4}))   ;union
(println (set/difference #{1 2} #{2 3}))   ;diff
(println (set/intersection #{1 2} #{2 3}))
(println (set/subset? #{1 2} #{2 3}))
(println (set/subset? #{1 2} #{1 2 3})
(println (set/superset? #{1 2} #{1 2 3}))
(println (set/superset? #{1 2 3} #{1 2}))