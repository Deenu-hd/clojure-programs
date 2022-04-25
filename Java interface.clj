(defn Example []
   (println (.toUpperCase "Hello World"))
   (println (.indexOf "Hello World","e"))
   
;java objects
   (def str1 (new String "Hello"))
   (println str1)
   
   (def my-int(new Integer 1))
   (println (+ 2 my-int)))
(Example)