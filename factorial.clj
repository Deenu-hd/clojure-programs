(defn fact [x]
    (if (<= x 1)
        1
        (* x (fact (- x 1)) )))

(println (fact 5))