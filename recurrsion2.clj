(defn counter [x]
        (loop [count 0]
          (if (= count x)
            (println "Done!")
            (do
              (println count)
              (recur (inc count))))))
          
(println (counter 10))