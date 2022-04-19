(defn example []
   (println (list 1 2 3 4))
   (println (list 'a 'b 'c 'd)))
(example)

(println "------------"
(println (list* 1 [2,3]))   ;list*
(println (first (list 1,2,3)))  ;first
(println (nth (list 1 2,3) 1))  ;nth
(println (cons 5 (list 1,2,3))) ;adds begin of list
(println (conj (list 1 2,3) 4 5)) ;any order
(println (rest (list 1,2,3)))     ;list with first item removed