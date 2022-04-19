;----if-----
(defn demo3 [] (
   if (= 2 2)
   (println "Values are equal")
   (println "Values are not equal"))

   (if (not= 2 2)
   (println "true")
   (println "false"))

  (if ( and (= 2 2) (= 3 3))
   (println "Values are equal")
   (println "Values are not equal")))

(demo3)

;-----case----
(defn demo4 []
   (def x 5) 
   (case x 
         5 (println "x is 5")
        10 (println "x is 10")
        (println "x is neither 5 nor 10")))
(demo4)

;----cond-----
(defn demo5 []
   (let [x 70]
   (cond
      (= x 5) (println "x is 5")
      (= x 70) (println "x is 70")
      :else (println "x is not defined"))))
(demo5)