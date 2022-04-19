
(defn Example []
   (println "zero?")
   (def x (zero? 0))
   (println x)
   
   (def x (zero? 0.0))
   (println x)
   
   (def x (zero? 1))
   (println x)
   (println "-----------")
   
   (println "pos?")
   (def x (pos? 0))
   (println x)
   
   (def x (pos? -1))
   (println x)
   
   (def x (pos? 1))
   (println x)
   (println "-----------")
   
   (println "neg?")
   (def x (neg? -1))
   (println x)
   
   (def x (neg? 0))
   (println x)
  
   (def x (neg? 1))
   (println x)
   (println "-----------")
   
   (println "even?")
   (def x (even? 0))
   (println x)
   
   (def x (even? 3))
   (println x)
   
   (println "-----------")
   
   (println "odd?")
   (def x (odd? 0))
   (println x)
   
   (def x (odd? 1))
   (println x))
   

(Example)