(defn demo []
   (try
      (def string1 (slurp "Example.txt"))
      (println string1)
      (catch Exception e (println (str "caught exception: " (.getMessage e))))))
(demo)


(defn demo2 []
   (try
      (def string1 (slurp "Example.txt"))
      (println string1)
      
      (catch java.io.FileNotFoundException e (println (str "caught file
         exception: " (.getMessage e))))
      
      (catch Exception e (println (str "caught exception: " (.getMessage e)))))
   (println "Let's move on"))
(demo2)